package tn.esprit.foyerSpringBoot.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyerSpringBoot.entities.Bloc;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long>  {
}
