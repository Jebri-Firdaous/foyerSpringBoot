package tn.esprit.foyerspringboot.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.foyerspringboot.Entities.Universite;
import tn.esprit.foyerspringboot.Services.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/univ")
public class UniversiteRestController {
    IUniversiteService univservice;

    @PostMapping("/addUniv")
    public Universite addUni(@RequestBody Universite un){
        Universite uni=univservice.addUni(un);
        return  uni;
    }

    @GetMapping("/get-allUniv")
    public List<Universite> getUnivs(){
        List<Universite> listuni=univservice.listAllUniversite();
        return listuni;
    }
    @GetMapping("/getUniId/{uni-id}")
    public Universite getUnivId(@PathVariable("uni-id") Long uniId){
        Universite universite=univservice.getUniversiteById(uniId);
        return universite;
    }
    @PutMapping("/modify-Uni")
    public Universite modifyUni(@RequestBody Universite univ){
        Universite uni=univservice.modifyUni(univ);
        return  uni;
    }
    @DeleteMapping("/delete-Uni/{Uni-id}")
    public void removeUni(@PathVariable("Uni-id") Long UniId){
        univservice.removeUniv(UniId);
    }
}
