package tn.esprit.foyerSpringBoot.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerSpringBoot.Services.IFoyerService;
import tn.esprit.foyerSpringBoot.entities.Foyer;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {
    private IFoyerService foyerService;

    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.addFoyer(f);
        return foyer;
    }


    @GetMapping("/list-all-foyer")
    public List<Foyer> getFoyer() {
        List<Foyer> listFoyer = foyerService.listAllFoyer();
        return listFoyer;
    }
    @GetMapping("/get-foyer/{foyer-id}")
    public Foyer getFoyerById(@PathVariable("foyer-id") Long foyerId) {
        Foyer foyer = foyerService.getFoyerById(foyerId);
        return foyer;
    }


    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer e) {
        Foyer foyer = foyerService.modifyFoyer(e);
        return foyer;
    }

    @DeleteMapping("/removefoyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long foyerId) {
        foyerService.removeFoyer(foyerId);
    }
}
