package tn.esprit.foyerSpringBoot.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.foyerSpringBoot.entities.Chambre;
import tn.esprit.foyerSpringBoot.enums.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long>{
    List <Chambre> findAllByTypeChambre(TypeChambre typeChambre);
    Chambre findChambreByNumeroChambre(long numeroChambre);

    @Query("SELECT c FROM Chambre c WHERE c.typeChambre=:type")
    List<Chambre> retrieveChambreByType(@Param("type") TypeChambre type);

    @Query("SELECT c FROM Chambre c")
    List<Chambre> retrieveAllChambres();



}
