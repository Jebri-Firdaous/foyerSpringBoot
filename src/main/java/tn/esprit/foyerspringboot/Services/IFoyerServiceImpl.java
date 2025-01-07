package tn.esprit.foyerSpringBoot.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerSpringBoot.Repository.FoyerRepository;
import tn.esprit.foyerSpringBoot.entities.Foyer;

import java.util.List;
@Service
@AllArgsConstructor

public class IFoyerServiceImpl implements IFoyerService{
    FoyerRepository foyerRepository;
    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public List<Foyer> listAllFoyer() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer getFoyerById(Long foyertId) {
        return foyerRepository.findById(foyertId).get();
    }

    @Override
    public Foyer modifyFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void removeFoyer(Long foyerId) {
        foyerRepository.deleteById(foyerId);

    }
}
