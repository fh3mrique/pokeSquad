INSERT INTO tipo (name) VALUES ('Agua');
INSERT INTO tipo (name) VALUES ('Eletrico');
INSERT INTO tipo (name) VALUES ('Fogo');
INSERT INTO tipo (name) VALUES ('Inseto');
INSERT INTO tipo (name) VALUES ('Fantasma');
INSERT INTO tipo (name) VALUES ('Psiquico');
INSERT INTO tipo (name) VALUES ('Pedra');
INSERT INTO tipo (name) VALUES ('Voador');

INSERT INTO treinador (name, age, genero, imgURL) VALUES ('Agatha', '60', 'FEMININO',  'https://archives.bulbagarden.net/media/upload/5/5c/Lets_Go_Pikachu_Eevee_Agatha.png');

INSERT INTO pokemon (name, level, trainer_id) Values ('Pikachu', 20, 1);
INSERT INTO pokemon (name, level, trainer_id) Values ('Kadabra', 16, 1);
INSERT INTO pokemon (name, level, trainer_id) Values ('Lapras', 30, 1);
INSERT INTO pokemon (name, level, trainer_id) Values ('Charizard', 36, 1);


INSERT INTO pokemon_tipo (pokemon_id, tipo_id) VALUES (1, 2);
INSERT INTO pokemon_tipo (pokemon_id, tipo_id) VALUES (2, 6);
INSERT INTO pokemon_tipo (pokemon_id, tipo_id) VALUES (3, 1);
INSERT INTO pokemon_tipo (pokemon_id, tipo_id) VALUES (4, 3);
INSERT INTO pokemon_tipo (pokemon_id, tipo_id) VALUES (4, 8);


