drop database if exists  OK_GO;
create database OK_GO;
use OK_GO;

CREATE TABLE usuarios (
  id 					INT 					NOT NULL 			AUTO_INCREMENT,
  username				VARCHAR(30)				NOT NULL			UNIQUE, 
  email 				VARCHAR(100) 			UNIQUE,
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
  nome  				VARCHAR(100) 			NOT NULL			UNIQUE,
  descricao 			VARCHAR(500) 			NOT NULL,
  contato				VARCHAR(100)			NOT NULL,			
  criador_id			INT						NOT NULL,
  data_criacao 			TIMESTAMP 				DEFAULT 		CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  FOREIGN KEY (criador_id) REFERENCES usuarios(id)
);

CREATE TABLE membros (
  id_grupo				INT 					NOT NULL,
  id_membro				INT						NOT NULL,
  FOREIGN KEY (id_grupo) REFERENCES grupos(id),
  FOREIGN KEY (id_membro) REFERENCES usuarios(id)
);

-------------------------------------------------------------------------------------------------------
delimiter $
create trigger criador_membro after insert on grupos
	for each row
    begin
		insert into membros values (new.id, new.criador_id);
        end$
delimiter ;

insert into usuarios (username, nome, email, senha, celular) values
('Joao123','Joao Victor', 'joao@gmail.com', 'joaozinho123', '15999999999'),
('WnCassillo', 'Wilson Neto', 'wilson@gmail.com', '54321', '15888888888');

insert into avaliacoes (usuario_id, nota) values
(1, 4), (1, 3), (1, 4),
(2, 5), (2, 4), (2, 5);

insert into grupos (tag, nome, descricao, criador_id, contato) values
("RPG", "Mesa de RPG D&D", "D&D com os amigos", 2, "discord.gg/rpg" );
 
insert into membros (id_grupo, id_membro) values
 (1, 1);

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
    
##select * from usuarios;
    
##GRUPO
SELECT 
    gru.id,
    tag,
    gru.nome,
    descricao,
    contato,
    usu.username AS criador,
    data_criacao
FROM
    grupos AS gru
        LEFT JOIN
    usuarios AS usu ON gru.criador_id = usu.id;
    
##SELECT gru.nome, tag, gru.id, usu.username AS criador FROM grupos AS gru LEFT JOIN usuarios as usu on gru.criador_id = usu.id ORDER by id;
## insert into avaliacoes (nota,)

##MEMBROS
select
	gru.id,
	gru.nome,
    usu.id,
	usu.username
from membros
left join grupos as gru 
on id_grupo = gru.id
left join usuarios as usu
on id_membro = usu.id;

SELECT username, avg(nota)
                     FROM membros AS mem 
                     LEFT JOIN usuarios as usu on
                      id_membro = usu.id
                      LEFT JOIN grupos as gru on 
                      id_grupo = gru.id 
                      LEFT JOIN avaliacoes as ava on
                      ava.usuario_id = usu.id
                      where gru.id = 1
                      group by usu.id
                    ;
