package tn.esprit.foyerSpringBoot.Services;

import tn.esprit.foyerSpringBoot.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public Reservation addReservation(Reservation reservation);
    public List <Reservation> listALLReservations();
    public Reservation getReservationById (String resId);
    public Reservation modifyReservation(Reservation reservation);
    public void removeReservation(String resId);


}
