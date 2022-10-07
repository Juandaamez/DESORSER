CREATE TABLE estudiantes(

    id_estudiante SERIAL PRIMARY KEY NOT NULL,
	nombre_estudiantes VARCHAR(30)NOT NULL,
	primer_apellido VARCHAR(30) NOT NULL,
	segundo_apellido VARCHAR (30) NOT NULL,
	codigo_estudiante INT NOT NULL
)