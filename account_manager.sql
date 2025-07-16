create database accountmanager;

use accountmanager;

create table TBUsuarios(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
senha VARCHAR(255) NOT NULL,
perfil ENUM('ADMIN','NORMAL') NOT NULL
);

create table TBContas(
id INT PRIMARY KEY AUTO_INCREMENT,
descricao VARCHAR(200) NOT NULL,
valor DECIMAL(10,2) NOT NULL,
forma_pagamento ENUM('CREDITO','DEBITO','PIX','DINHEIRO','BOLETO') NOT NULL,
parcelas INT,
data_compra DATE NOT NULL,
data_pagamento DATE,
status_pagamento ENUM('PAGA','PENDENTE','ATRASADA') NOT NULL,
usuario_id INT NOT NULL,
FOREIGN KEY (usuario_id) REFERENCES TBUsuarios(id)
);

create table TBCategorias(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL
);

create table TBContasCategorias(
conta_id INT NOT NULL,
categoria_id INT NOT NULL,
PRIMARY KEY (conta_id, categoria_id),
FOREIGN KEY (conta_id) REFERENCES TBContas(id) ON DELETE CASCADE,
FOREIGN KEY (categoria_id) REFERENCES TBCategorias(id) ON DELETE CASCADE
);

INSERT INTO TBUsuarios(nome,senha,perfil) VALUES ("Vitor","01234",'ADMIN');
INSERT INTO TBUsuarios(nome,senha,perfil) VALUES ("Miguel","43210",'ADMIN');