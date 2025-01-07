package tn.esprit.foyerspringboot.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyerspringboot.Entities.Bloc;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long>  {
}
