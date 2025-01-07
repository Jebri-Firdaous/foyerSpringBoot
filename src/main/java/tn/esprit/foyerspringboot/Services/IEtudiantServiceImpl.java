package tn.esprit.foyerSpringBoot.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerSpringBoot.Repository.EtudiantRepository;
import tn.esprit.foyerSpringBoot.entities.Etudiant;

import java.util.List;

@Service
@AllArgsConstructor
public class IEtudiantServiceImpl implements  IEtudiantService {
    EtudiantRepository etudiantRepository;
    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public List<Etudiant> listAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getEtudiantById(Long etudiantId) {
        return etudiantRepository.findById(etudiantId).get();
    }

    @Override
    public Etudiant modifyEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void removeEtudiant(Long etudiantId) {
        etudiantRepository.deleteById(etudiantId);

    }
}
