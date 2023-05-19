drop database if exists  OK_GO;
create database OK_GO;
use OK_GO;

CREATE TABLE usuarios (
  id 					INT 					NOT NULL 			AUTO_INCREMENT,
  username				VARCHAR(30)				NOT NULL				UNIQUE, 
  email 				VARCHAR(100) 			NOT NULL				UNIQUE,
  nome  				VARCHAR(100) 			NOT NULL,
  senha 				VARCHAR(100) 			NOT NULL,
  celular				VARCHAR(15),
  PRIMARY KEY (id)
);

CREATE TABLE avaliacoes ( 
  id 					INT 					NOT NULL 			AUTO_INCREMENT,
  usuario_id 			INT 					NOT NULL,
  nota					INT						NOT NULL,  
  PRIMARY KEY (id),
  FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE grupos (
  id					INT 					NOT NULL 			AUTO_INCREMENT,
  tag					VARCHAR(20)				NOT NULL, 
  nome  				VARCHAR(100) 			NOT NULL,
  descricao 			VARCHAR(500) 			NOT NULL,
  contato				VARCHAR(100),			
  criador_id			INT						NOT NULL,
  data_criação 			TIMESTAMP 				DEFAULT 		CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  FOREIGN KEY (criador_id) REFERENCES usuarios(id)
);

CREATE TABLE membros (
  id_grupo				INT 					NOT NULL,
  id_membro				INT						NOT NULL,
  FOREIGN KEY (id_grupo) REFERENCES grupos(id),
  FOREIGN KEY (id_membro) REFERENCES usuarios(id)
);

-- -----------------------------------------------------------------------------------------------------

insert into usuarios (username, nome, email, senha, celular) values
('Joao123','Joao Victor', 'joao@gmail.com', 'joaozinho123', '15999999999'),
('WnCassillo', 'Wilson Neto', 'wilson@gmail.com', '54321', '15888888888'),
('PHolder', 'Pedro Holder', 'pholder@gmail.com', '0123', '11000000000');

insert into avaliacoes (usuario_id, nota) values
(1, 4), (1, 3), (1, 4),
(2, 5), (2, 4), (2, 5),
(3, 1), (3, 3), (3, 2);

insert into grupos (tag, nome, descricao, criador_id) values
("D&D", "Mesa de RPG D&D", "RPG com os amigos", 2 ),
("Teste", "Grupo de teste", "descrição mt boa", 3 );
 
insert into membros (id_grupo, id_membro) values
(1, 2), (1, 3),
(2,1), (2,2), (2,3);

##SELECTS DE TESTE
##USUARIOS
select 
	usu.id as id_usuario,
    username,
    nome,
    email,
    senha,
    celular
from usuarios as usu;

##NOTAS
select * from avaliacoes;  
  
##NOTA POR USUARIO
select 
    usuario_id,
    avg(nota),
    usu.nome
    from avaliacoes as ava
    left join usuarios as usu 
    on ava.usuario_id = usu.id
    group by usuario_id;
    
##GRUPO
select
	gru.id,
    tag,
    gru.nome,
    descricao,
    usu.username as criador,
    data_criação
from grupos as gru
left join usuarios as usu
on gru.criador_id = usu.id;

##MEMBROS
select 
	gru.nome,
	usu.username
from membros
left join grupos as gru 
on id_grupo = gru.id
left join usuarios as usu
on id_membro = usu.id;		