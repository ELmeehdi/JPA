package org.jpa.jpa.repository;

import org.jpa.jpa.modele.Cours;
import org.jpa.jpa.modele.CustomModule;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ModuleRepository extends CrudRepository<CustomModule, Integer> {
}
