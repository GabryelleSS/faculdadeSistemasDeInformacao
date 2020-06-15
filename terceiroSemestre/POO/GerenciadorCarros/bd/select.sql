use gerenciador_carros;

select * from carro;

select * from operacao;

select * from operacao inner join carro on (operacao.placa = carro.placa) where carro.placa = "789APSF";