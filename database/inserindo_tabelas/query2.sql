CREATE TABLE professores (
  id_professor INTEGER NOT NULL,
  celular VARCHAR(14),
  nome VARCHAR(40) NOT NULL,
  id_disciplina INTEGER,
  PRIMARY KEY (id_professor),
  FOREIGN KEY (id_disciplina) REFERENCES disciplinas(id_disciplina)
);