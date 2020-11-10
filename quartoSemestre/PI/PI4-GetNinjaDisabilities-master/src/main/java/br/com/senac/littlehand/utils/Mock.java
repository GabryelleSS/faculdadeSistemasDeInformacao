package br.com.senac.littlehand.utils;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import br.com.senac.littlehand.model.entities.Address;
import br.com.senac.littlehand.model.entities.Consumer;
import br.com.senac.littlehand.model.entities.Provider;
import br.com.senac.littlehand.repository.AddressRepository;
import br.com.senac.littlehand.repository.ConsumerRepository;
import br.com.senac.littlehand.repository.ProviderRepository;

@Component
public class Mock {

	@Autowired
	private ProviderRepository providerRepository;
	
	@Autowired
	private ConsumerRepository consumerRepository;

	@Autowired
	AddressRepository addressRepository;
	
	@PostConstruct
	public void mock() {
		Address address = new Address();
		address = addressRepository.save(address);

		Provider provider = new Provider();
		provider.setAddress(address);
		provider.setEmail("provider@gmail.com");
		provider.setPassword(new BCryptPasswordEncoder().encode("123"));
		
		providerRepository.save(provider);
		
		Consumer consumer = new Consumer();
		consumer.setAddress(address);
		consumer.setEmail("consumer@gmail.com");
		consumer.setPassword(new BCryptPasswordEncoder().encode("123"));
		
		consumerRepository.save(consumer);
	}
}
