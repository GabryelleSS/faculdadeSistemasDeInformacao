package br.com.senac.littlehand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.littlehand.model.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
