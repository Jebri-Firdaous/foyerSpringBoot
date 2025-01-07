package tn.esprit.foyerSpringBoot.Services;

import org.springframework.data.repository.query.Param;
import tn.esprit.foyerSpringBoot.entities.Chambre;
import tn.esprit.foyerSpringBoot.enums.TypeChambre;

import java.util.List;


public interface IChambreService  {
    //-----------------------------------------CRUD-----------------------------------------------//

    public Chambre addChambre(Chambre c);

    public List<Chambre> listAllChambres ();
    public Chambre getChambreById (Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
    public void removeChambre(Long chambreId);
    //-----------------------------------------KEYWORDS--------------------------------------------//
    public  List<Chambre> getAllChambreByType(TypeChambre typeChambre);
    public Chambre getChambreByNumero(long numeroChambre);

    //-----------------------------------------JPQL------------------------------------------------//
    List<Chambre> retrieveChambreByType(@Param("type") TypeChambre type);





}
