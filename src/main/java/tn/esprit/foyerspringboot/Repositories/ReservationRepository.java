package tn.esprit.foyerspringboot.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyerspringboot.Entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
