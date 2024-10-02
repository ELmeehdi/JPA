package org.jpa.jpa.controleur;


import org.jpa.jpa.modele.CustomModule;
import org.jpa.jpa.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ModuleControleur {


    @Autowired
    private ModuleService moduleService;

    @RequestMapping("/modules")
    public List<CustomModule> getModules() {
        return moduleService.getAllModules();
    }


    @RequestMapping(method= RequestMethod.POST, value="/modules")
    public void ajouterModule(@RequestBody CustomModule module) {
        moduleService.ajouterModule(module);
    }

    @RequestMapping("/modules/{id}")
    public Optional<CustomModule> getModule(@PathVariable Integer id){
        return moduleService.getModule(id);
    }



    @RequestMapping(method=RequestMethod.PUT, value="/modules/{id}")
    public void modifierModule(@RequestBody CustomModule module, @PathVariable Integer id) {
        moduleService.modifierModule(id, module);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/modules/{id}")
    public void supprimerModule(@PathVariable Integer id) {
        moduleService.supprimerModule(id);
    }

}