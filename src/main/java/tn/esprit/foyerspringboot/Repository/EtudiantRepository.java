package tn.esprit.foyerSpringBoot.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyerSpringBoot.entities.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
