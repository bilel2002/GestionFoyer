package tn.esprim.gestionfoyer.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reservation implements Serializable {
    @Id
    private String idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @ToString.Exclude
    private Set<Etudiant> etudiants;
}
