package com.prabhneet.spring.spring5petclinic.services;

import com.prabhneet.spring.spring5petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
