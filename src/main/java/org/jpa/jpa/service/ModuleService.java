package org.jpa.jpa.service;

import org.jpa.jpa.modele.CustomModule;
import org.jpa.jpa.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;


    public List<CustomModule> getAllModules() {
        List<CustomModule> modules=new ArrayList<>();
        moduleRepository.findAll().forEach(modules::add);
        return modules;
    }

    public void ajouterModule(CustomModule module) {
        moduleRepository.save(module);
    }

    public Optional<CustomModule> getModule(Integer id) {
        return moduleRepository.findById(id);
    }

    public void modifierModule(Integer id, CustomModule module) {
        moduleRepository.save(module);
    }

    public void supprimerModule(Integer id) {
        moduleRepository.deleteById(id);
    }
}

