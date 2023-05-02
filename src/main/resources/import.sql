INSERT INTO comunidades_autonomas (id, nombre, codigo) VALUES (1,'Galicia', '01');
INSERT INTO comunidades_autonomas (id, nombre, codigo) VALUES (2,'Asturias', '02');
INSERT INTO comunidades_autonomas (id, nombre, codigo) VALUES (3,'Cantabria', '03');
INSERT INTO comunidades_autonomas (id, nombre, codigo) VALUES (4,'Castilla y Leon', '04');

INSERT INTO provincias (id, nombre, codigo, comunidadautonoma_id) VALUES (1,'A Coruña', '15', 1);
INSERT INTO provincias (id, nombre, codigo, comunidadautonoma_id) VALUES (2,'Lugo', '16', 1);
INSERT INTO provincias (id, nombre, codigo, comunidadautonoma_id) VALUES (3,'León', '19', 4);
INSERT INTO provincias (id, nombre, codigo, comunidadautonoma_id) VALUES (4,'Oviedo', '20', 2);
INSERT INTO provincias (id, nombre, codigo, comunidadautonoma_id) VALUES (5,'Santander', '21', 3);

INSERT INTO municipios (id, nombre, codigo, provincia_id) VALUES (1,'Ferrol', '154', 1);
INSERT INTO municipios (id, nombre, codigo, provincia_id) VALUES (2,'Villalba', '155', 2);
INSERT INTO municipios (id, nombre, codigo, provincia_id) VALUES (3,'Riaño', '234', 3);
INSERT INTO municipios (id, nombre, codigo, provincia_id) VALUES (4,'Luarca', '178', 4);

INSERT INTO ubicaciones (id, nombre, parroquia, municipio_id) VALUES (1, 'Ferrol city', 'Joane', 1);