package tn.esprit.foyerSpringBoot.Services;

import tn.esprit.foyerSpringBoot.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    public List<Universite> listAllUniversite();
    public Universite getUniversiteById(Long UniID);

    public Universite addUni(Universite Uni);
    public void removeUniv(Long UniId);
    public Universite modifyUni(Universite universite);
}
