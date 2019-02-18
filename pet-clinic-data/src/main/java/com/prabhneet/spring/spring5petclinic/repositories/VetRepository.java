package com.prabhneet.spring.spring5petclinic.repositories;

import com.prabhneet.spring.spring5petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}