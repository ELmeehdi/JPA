package org.jpa.jpa.controleur;

import org.jpa.jpa.modele.Cours;
import org.jpa.jpa.modele.CustomModule;
import org.jpa.jpa.service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //pour indiquer que c’est un controller Rest pour gérer les mappings après
public class CoursControleur {

    @Autowired //pour faire de l’injection de la classe CoursService au niveau du Controller
    private CoursService coursService;

    @RequestMapping("/modules/{id}/cours")
    public List<Cours> getAllCours(@PathVariable Integer id) {
        return coursService.getAllCours(id);
    }

    @RequestMapping("/modules/{moduleId}/cours/{id}")
    public Optional<Cours> getCours(@PathVariable Integer id) {
        return coursService.getCours(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/modules/{moduleId}/cours")
    //pour ajouter un Cours à un Module donné
    public void ajouterCours(@RequestBody Cours cours, @PathVariable Integer moduleId) {
        cours.setModule(new CustomModule(moduleId, "", ""));
        coursService.ajouterCours(cours);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/modules/{moduleId}/cours/{id}")
    public void modifierCours(@RequestBody Cours cours, @PathVariable Integer moduleId,
                              @PathVariable Integer id) {
        cours.setModule(new CustomModule(moduleId,"",""));
        coursService.modifierCours(cours);
    }
    @RequestMapping(method=RequestMethod.DELETE, value="/modules/{moduleId}/cours/{id}")
    public void supprimerCours(@PathVariable Integer id) {
        coursService.supprimerCours(id);
    }

}
