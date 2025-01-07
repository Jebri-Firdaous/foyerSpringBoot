package tn.esprit.foyerSpringBoot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;
    private Long capaciteFoyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer", fetch = FetchType.EAGER)
    private Set<Bloc> listBloc;

    @OneToOne(mappedBy = "foyer" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
  private Universite universite;
}
