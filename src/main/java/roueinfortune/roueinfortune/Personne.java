package roueinfortune.roueinfortune;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
public class Personne {
    public String nom;
    public String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
