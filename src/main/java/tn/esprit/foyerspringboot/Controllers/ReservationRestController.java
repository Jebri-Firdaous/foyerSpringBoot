package tn.esprit.foyerspringboot.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.Entities.Reservation;
import tn.esprit.foyerspringboot.Services.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {

    private IReservationService reservationService;

    @PostMapping("/add-res")
    public Reservation addRes(@RequestBody Reservation r) {
        Reservation res = reservationService.addReservation(r);
        return res;
    }

    @GetMapping ("/list-all-reservations")
    public List <Reservation> listAllResercations ()
    {
        List <Reservation> listReservations = reservationService.listALLReservations();
        return listReservations;
    }

    @GetMapping ("/get-reservation/{reservation-id}")
    public  Reservation getReservationById(@PathVariable("reservation-id") String resId)
    {
        Reservation res= reservationService.getReservationById(resId);
        return res;
    }


    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation reservation)
    {
        Reservation res =reservationService.modifyReservation(reservation);
        return res ;
    }

    @DeleteMapping ("remove-res/{res-id}")
    public  void  removeReservation(@PathVariable ("res-id") String resId)
    {
        reservationService.removeReservation(resId);
    }

}
