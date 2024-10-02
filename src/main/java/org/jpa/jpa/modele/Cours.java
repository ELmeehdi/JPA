package org.jpa.jpa.modele;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cours {
    @Id
    private int id;
    private String nom;
    private String description;
    @ManyToOne
    private CustomModule module;

    public Cours(int id, String nom, String description, int moduleId) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.module = new CustomModule(moduleId,"","");
    }
}
