package tn.esprit.foyerSpringBoot.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.foyerSpringBoot.enums.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;

    @ManyToOne
    @JoinColumn(name = "bloc_id" )
    private Bloc bloc;

    @OneToMany(mappedBy ="chambre" , fetch = FetchType.EAGER)
    private Set<Reservation> reservations;
}
