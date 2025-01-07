package tn.esprit.foyerspringboot.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    private String idReservation;


    private Date anneeUniversitaire;

    private boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant>etudiants;

    @ManyToOne
    @JoinColumn(name = "chambre_id")
    private Chambre chambre ;

}
