package tn.esprit.foyerSpringBoot.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerSpringBoot.Services.IEtudiantService;
import tn.esprit.foyerSpringBoot.entities.Etudiant;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
    private IEtudiantService etudiantService;

    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }


    @GetMapping("/list-all-etudiant")
    public List<Etudiant> getEtudiant() {
        List<Etudiant> listEtudiant = etudiantService.listAllEtudiant();
        return listEtudiant;
    }
    @GetMapping("/get-etudiant/{etudiant-id}")
    public Etudiant getEtudiantById(@PathVariable("etudiant-id") Long etudiantId) {
        Etudiant etudiant = etudiantService.getEtudiantById(etudiantId);
        return etudiant;
    }


    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.modifyEtudiant(e);
        return etudiant;
    }

    @DeleteMapping("/removeetudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        etudiantService.removeEtudiant(etudiantId);
    }

}
