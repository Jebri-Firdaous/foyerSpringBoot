package tn.esprit.foyerSpringBoot.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyerSpringBoot.entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
