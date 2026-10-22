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
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne(fetch = FetchType.EAGER)
    private Bloc bloc;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private Set<Reservation> reservations;
}
