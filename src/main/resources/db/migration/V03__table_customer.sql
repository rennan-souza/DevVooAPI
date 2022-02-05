CREATE TABLE tb_customer (
	id BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	full_name varchar(200),
	birth_date DATE,
	cpf varchar(200) UNIQUE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



INSERT INTO tb_customer (full_name, birth_date, cpf) VALUES ('Stephanie Green', '1994-02-04', '57149273033');
INSERT INTO tb_customer (full_name, birth_date, cpf) VALUES ('Joe Purple', '1984-04-10', '27002386050');