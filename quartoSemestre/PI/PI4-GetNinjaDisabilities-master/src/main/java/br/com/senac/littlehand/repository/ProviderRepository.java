package br.com.senac.littlehand.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.littlehand.model.entities.Provider;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {

	Optional<Provider> findByEmail(String email);

}
