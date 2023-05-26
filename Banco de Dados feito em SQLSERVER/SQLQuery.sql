--Criando Tabela Cliente
CREATE TABLE Cliente (
    id_cliente INT PRIMARY KEY,
    nome VARCHAR(100),
    data_nascimento DATE
);

-- Criar a tabela Endereco
CREATE TABLE Endereco (
    id_endereco INT PRIMARY KEY,
    logradouro VARCHAR(100),
    cep VARCHAR(10),
    bairro VARCHAR(100),
    cidade VARCHAR(100),
    tipo_endereco VARCHAR(20) CHECK (tipo_endereco IN ('comercial', 'residencial')),
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES Cliente(id_cliente)
);

-- Inserindo Dados na Tabela Cliente
INSERT INTO Cliente (id_cliente, nome, data_nascimento)
VALUES (1, 'Daniel', '2002-04-13');

-- Inserindo dados na tabela Endereco (Comercial)
INSERT INTO Endereco (id_endereco, logradouro, cep, bairro, cidade, tipo_endereco, cliente_id)
VALUES (1, 'Quadra 100 Rua 40', '72801040', 'Mingone 2', 'Luziania', 'comercial', 1);

-- Inserindo dados na tabela Endereco (Residencial)
INSERT INTO Endereco (id_endereco, logradouro, cep, bairro, cidade, tipo_endereco, cliente_id)
VALUES (2, 'Avenida Aeroporto', '72855100', 'Setor Aeroporto', 'luziania', 'residencial', 1);

--Query1
SELECT c.nome, c.data_nascimento,e.tipo_endereco, e.logradouro, e.cep, e.bairro, e.cidade
FROM Cliente c
INNER JOIN Endereco e ON c.id_cliente = e.cliente_id
WHERE c.id_cliente = 1 AND e.tipo_endereco = 'residencial';

--Query2
SELECT c.nome, c.data_nascimento,e.tipo_endereco, e.logradouro, e.cep, e.bairro, e.cidade
FROM Cliente c
INNER JOIN Endereco e ON c.id_cliente = e.cliente_id
WHERE c.id_cliente = 1 AND e.tipo_endereco = 'comercial';

--Query3
SELECT c.nome, c.data_nascimento, e.logradouro, e.cep, e.bairro, e.cidade
FROM Cliente c
INNER JOIN Endereco e ON c.id_cliente = e.cliente_id
WHERE c.id_cliente = 1;

--Não utilizei ENUM pq no SQLServer ele não possui esses tipo de dados, como alternativa utilizei CHECK