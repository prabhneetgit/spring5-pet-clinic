package com.prabhneet.spring.spring5petclinic.repositories;

import com.prabhneet.spring.spring5petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
