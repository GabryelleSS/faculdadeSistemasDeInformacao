package br.com.senac.littlehand.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.littlehand.model.entities.Consumer;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long>{

	Optional<Consumer> findByEmail(String email);

}
