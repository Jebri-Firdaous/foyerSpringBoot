package tn.esprit.foyerspringboot.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.Entities.Bloc;
import tn.esprit.foyerspringboot.Services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {
    private IBlocService blocService;

    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }


    @GetMapping("/list-all-blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listBlocs = blocService.listAllBloc();
        return listBlocs;
    }
    @GetMapping("/get-bloc/{bloc-id}")
    public Bloc getChambreById(@PathVariable("bloc-id") Long blocId) {
        Bloc bloc = blocService.getBlocById(blocId);
        return bloc;
    }


    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc blocId) {
        Bloc bloc = blocService.modifyBloc(blocId);
        return bloc;
    }
    @DeleteMapping("/removebloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long blocId) {
        blocService.removeBloc(blocId);
    }


}
