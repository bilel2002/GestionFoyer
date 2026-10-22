package tn.esprim.gestionfoyer.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Foyer foyer;
}
