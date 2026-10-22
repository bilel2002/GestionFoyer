package tn.esprim.gestionfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestionfoyer.entities.Etudiant;

import java.util.Date;
import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

    List<Etudiant> findByNomEt(String nomEt);

    Etudiant findByCin(Long cin);

    List<Etudiant> findByDateNaissanceGreaterThan(Date date);

    List<Etudiant> findByDateNaissanceLessThan(Date date);

    List<Etudiant> findByDateNaissanceBetween(Date dFrom, Date dTo);

    List<Etudiant> findByDateNaissanceIsNull();

    List<Etudiant> findByEcoleNotNull();

    List<Etudiant> findByNomEtLike(String nomEt);


    List<Etudiant> findByEcoleContaining(String ecole);

    List<Etudiant> findByEcoleAndDateNaissanceGreaterThan(String ecole, Date date);

    List<Etudiant> findByReservationsEstValide(boolean estValide);
}
