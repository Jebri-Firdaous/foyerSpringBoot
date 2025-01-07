package tn.esprit.foyerSpringBoot.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyerSpringBoot.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
