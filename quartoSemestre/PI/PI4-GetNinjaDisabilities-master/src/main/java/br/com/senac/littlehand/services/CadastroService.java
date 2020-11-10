package br.com.senac.littlehand.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.littlehand.model.entities.Address;
import br.com.senac.littlehand.model.entities.Consumer;
import br.com.senac.littlehand.model.entities.Provider;
import br.com.senac.littlehand.repository.AddressRepository;
import br.com.senac.littlehand.repository.ConsumerRepository;
import br.com.senac.littlehand.repository.ProviderRepository;

@Service
public class CadastroService {

    @Autowired
    private ConsumerRepository consumerRepository;

    @Autowired
    private ProviderRepository providerRepository;

    @Autowired
    private AddressRepository addressRepository;

    public Consumer save(Consumer consumer) {
        Address address = consumer.getAddress();

        address = addressRepository.save(address);
        consumer.setAddress(address);

        return consumerRepository.save(consumer);
    }

    public Provider save(Provider provider) {
        Address address = provider.getAddress();

        address = addressRepository.save(address);
        provider.setAddress(address);

        return providerRepository.save(provider);
    }

}