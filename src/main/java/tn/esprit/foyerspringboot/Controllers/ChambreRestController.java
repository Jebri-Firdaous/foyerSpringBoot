package tn.esprit.foyerspringboot.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.Entities.Chambre;
import tn.esprit.foyerspringboot.Services.IChambreService;

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


    }
