package tn.esprit.foyerSpringBoot.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerSpringBoot.Repository.ChambreRepository;
import tn.esprit.foyerSpringBoot.entities.Chambre;
import tn.esprit.foyerSpringBoot.enums.TypeChambre;

import java.util.List;

@Service
@AllArgsConstructor
public class IChambreServiceImpl implements IChambreService {
    ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }


    @Override
    public List<Chambre> listAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre getChambreById(Long chambreId) {
        return chambreRepository.findById(chambreId).get();
    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
    @Override
    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);
    }

    @Override
    public List<Chambre> getAllChambreByType(TypeChambre typeChambre) {
        return chambreRepository.findAllByTypeChambre(typeChambre);
    }

    @Override
    public Chambre getChambreByNumero(long numeroChambre) {
        return chambreRepository.findChambreByNumeroChambre(numeroChambre);
    }

    @Override
    public List<Chambre> retrieveChambreByType(TypeChambre type) {
        return chambreRepository.retrieveChambreByType(type);
    }


}
