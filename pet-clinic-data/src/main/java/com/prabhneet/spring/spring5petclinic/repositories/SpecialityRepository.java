package com.prabhneet.spring.spring5petclinic.repositories;

import com.prabhneet.spring.spring5petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
