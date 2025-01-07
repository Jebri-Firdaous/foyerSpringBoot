package tn.esprit.foyerSpringBoot.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerSpringBoot.Services.IChambreService;
import tn.esprit.foyerSpringBoot.entities.Chambre;
import tn.esprit.foyerSpringBoot.enums.TypeChambre;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {

    private IChambreService chambreService;


    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }


    @GetMapping("/list-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.listAllChambres();
        return listChambres;
    }
    @GetMapping("/get-chambre/{chambr6e-id}")
    public Chambre getChambreById(@PathVariable("chambre-id") Long chId) {
        Chambre chambre = chambreService.getChambreById(chId);
        return chambre;
    }


    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.modifyChambre(c);
        return chambre;
    }

    @DeleteMapping("/removechambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.removeChambre(chId);
    }

    @GetMapping("/type/{typeChambre}")
    public List<Chambre> getChambresByType(@PathVariable TypeChambre typeChambre) {
        List<Chambre> listChambresByType = chambreService.getAllChambreByType(typeChambre);
        System.out.println("Chambres trouvées pour le type " + typeChambre + ": " + listChambresByType);

        return listChambresByType;
    }

    @GetMapping("/numero/{numeroChambre}")
    public  Chambre getChambreByNum(@PathVariable Long numeroChambre){
        return  chambreService.getChambreByNumero(numeroChambre);
    }

    @GetMapping("/JPQL/type/{typeChambre}")
    public List<Chambre> retrieveChambreByType(@PathVariable TypeChambre typeChambre) {
        List<Chambre> listChambresByType = chambreService.retrieveChambreByType(typeChambre);

        return listChambresByType;
    }



    }
