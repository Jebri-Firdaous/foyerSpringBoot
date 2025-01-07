package tn.esprit.foyerSpringBoot.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerSpringBoot.Repository.ReservationRepository;
import tn.esprit.foyerSpringBoot.entities.Reservation;

import java.util.List;

@Service
@AllArgsConstructor
public class IReservationServiceImpl implements IReservationService{
    ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> listALLReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservationById(String resId) {
        return reservationRepository.findById(resId).get();

    }

    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void removeReservation(String resId) {
        reservationRepository.deleteById(resId);

    }


}
