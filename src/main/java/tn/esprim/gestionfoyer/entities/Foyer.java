package tn.esprim.gestionfoyer.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;

    @OneToOne(mappedBy = "foyer", fetch = FetchType.EAGER)
    @ToString.Exclude
    private Universite universite;

    @OneToMany(mappedBy = "foyer", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @ToString.Exclude
    private Set<Bloc> blocs;
}
