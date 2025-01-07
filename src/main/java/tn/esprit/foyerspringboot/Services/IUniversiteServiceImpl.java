package tn.esprit.foyerSpringBoot.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerSpringBoot.Repository.UniversiteRepository;
import tn.esprit.foyerSpringBoot.entities.Universite;

import java.util.List;

@Service
@AllArgsConstructor
public class IUniversiteServiceImpl implements IUniversiteService{
    UniversiteRepository universiteRepository;


    @Override
    public Universite addUni(Universite Uni) {
        return universiteRepository.save(Uni);
    }
    @Override
    public List<Universite> listAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite getUniversiteById(Long UniID) {
        return universiteRepository.findById(UniID).get();
    }


    @Override
    public Universite modifyUni(Universite universite) {
        return universiteRepository.save(universite);
    }
    @Override
    public void removeUniv(Long UniId) {
        universiteRepository.deleteById(UniId);

    }
}
