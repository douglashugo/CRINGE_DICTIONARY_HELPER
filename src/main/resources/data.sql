create table palavras(
    id int primary key auto_increment,
    palavra varchar(100) not null,
    significado varchar(500) not null
);

insert into palavras (palavra, significado) values
('de base', 'Morrer...'),
('F','Prestar condolências.'),
('Não Tankou', 'Não aguentou.'),
('Cringe', '25+'),
('chavoso','Estiloso, (Gangsta)');