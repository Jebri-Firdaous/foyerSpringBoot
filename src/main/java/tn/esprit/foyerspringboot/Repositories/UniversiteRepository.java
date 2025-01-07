package tn.esprit.foyerspringboot.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyerspringboot.Entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
