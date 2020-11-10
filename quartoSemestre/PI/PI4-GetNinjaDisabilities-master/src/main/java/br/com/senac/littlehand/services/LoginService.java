package br.com.senac.littlehand.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.senac.littlehand.model.entities.Consumer;
import br.com.senac.littlehand.model.entities.Provider;
import br.com.senac.littlehand.repository.ConsumerRepository;
import br.com.senac.littlehand.repository.ProviderRepository;

@Service
public class LoginService implements UserDetailsService {

	@Autowired
	private ConsumerRepository consumerRepository;

	@Autowired
	private ProviderRepository providerRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		Optional<Consumer> consumer = consumerRepository.findByEmail(email);

		if (consumer.isPresent()) {
			return consumer.get();
			
		} else {
			Optional<Provider> provider = providerRepository.findByEmail(email);

			if (provider.isPresent()) {
				return provider.get();
			}
		}

		throw new UsernameNotFoundException("Invalid username or password.");
	}

}
