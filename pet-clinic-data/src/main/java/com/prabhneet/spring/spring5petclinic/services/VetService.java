package com.prabhneet.spring.spring5petclinic.services;

import com.prabhneet.spring.spring5petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
