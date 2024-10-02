package org.jpa.jpa.repository;

import org.jpa.jpa.modele.CustomModule;
import org.springframework.data.repository.CrudRepository;

public interface ModuleRepository extends CrudRepository<CustomModule, Integer> {
}
