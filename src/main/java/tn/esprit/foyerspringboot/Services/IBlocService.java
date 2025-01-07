package tn.esprit.foyerSpringBoot.Services;

import tn.esprit.foyerSpringBoot.entities.Bloc;

import java.util.List;

public interface IBlocService {
    public Bloc addBloc(Bloc bloc);

    public List<Bloc> listAllBloc ();
    public Bloc getBlocById (Long blocId);
    public Bloc modifyBloc(Bloc bloc);
    public void removeBloc(Long blocId);
}
