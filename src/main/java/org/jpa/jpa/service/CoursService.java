package org.jpa.jpa.service;

import org.jpa.jpa.modele.Cours;
import org.jpa.jpa.repository.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CoursService {
    @Autowired //pour l’injection des dépendances et éviter l’appel des new()
    private CoursRepository coursRepository;
    public List<Cours> getAllCours(Integer moduleId) {
        List<Cours> cours=new ArrayList<>();
        coursRepository.findByModuleId(moduleId).forEach(cours::add);
        return cours;
    }
    public Optional<Cours> getCours(Integer id) {
        return coursRepository.findById(id);
    }
    public void ajouterCours(Cours cours) {
        coursRepository.save(cours); //la méthode save est implémentée dans CourseRepository
    }
    public void modifierCours(Cours cours) {
        coursRepository.save(cours); 
    }
    public void supprimerCours(Integer id) {
        coursRepository.deleteById(id);
    }
}
