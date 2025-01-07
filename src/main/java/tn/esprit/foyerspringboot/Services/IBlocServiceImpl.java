package tn.esprit.foyerSpringBoot.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerSpringBoot.Repository.BlocRepository;
import tn.esprit.foyerSpringBoot.entities.Bloc;

import java.util.List;

@Service
@AllArgsConstructor
public class IBlocServiceImpl implements IBlocService{
    BlocRepository blocRepository;
    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> listAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc getBlocById(Long blocId) {
        return blocRepository.findById(blocId).get();
    }

    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void removeBloc(Long blocId) {
        blocRepository.deleteById(blocId);

    }
}
