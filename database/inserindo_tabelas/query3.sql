CREATE TABLE livros (
  id_livro INTEGER NOT NULL,
  nome VARCHAR(15) NOT NULL,
  autor VARCHAR(40) NOT NULL,
  sinopse VARCHAR(500),
  id_disciplina INTEGER,
  PRIMARY KEY (id_livro),
  FOREIGN KEY (id_disciplina) REFERENCES disciplinas(id_disciplina)
);