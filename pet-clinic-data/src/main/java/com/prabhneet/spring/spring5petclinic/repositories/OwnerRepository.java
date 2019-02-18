package com.prabhneet.spring.spring5petclinic.repositories;

import com.prabhneet.spring.spring5petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
