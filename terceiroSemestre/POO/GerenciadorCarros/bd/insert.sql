use gerenciador_carros;

insert into carro(placa, marca, modelo, ano, tipo_carro, quilometragem, tanque, disponibilidade) 
	values("FXR4945", "Hyundai", "HB20", 2019, "Econômico", 1500, "vazio", true);
    
insert into operacao(tipo_operacao, data_hora, valor, quilometragem, tanque, placa)
	values("compra", "2020-06-15 02:40:00",  80741.00, 1500, "cheio", "FXR4945");
    