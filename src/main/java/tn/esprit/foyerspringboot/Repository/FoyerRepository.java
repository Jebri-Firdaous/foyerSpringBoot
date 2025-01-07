package tn.esprit.foyerSpringBoot.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyerSpringBoot.entities.Foyer;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
