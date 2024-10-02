package org.jpa.jpa.repository;
import java.util.List;

import org.jpa.jpa.modele.Cours;
import org.springframework.data.repository.CrudRepository;

public interface CoursRepository extends CrudRepository<Cours, Integer> {
    public List<Cours> findByModuleId(Integer moduleId);
}
