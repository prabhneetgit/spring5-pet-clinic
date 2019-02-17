package com.prabhneet.spring.spring5petclinic.services;


import com.prabhneet.spring.spring5petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
