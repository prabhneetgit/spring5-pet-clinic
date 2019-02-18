package com.prabhneet.spring.spring5petclinic.repositories;

import com.prabhneet.spring.spring5petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
