package tn.esprit.foyerSpringBoot.Services;

import tn.esprit.foyerSpringBoot.entities.Foyer;

import java.util.List;

public interface IFoyerService
{
        public Foyer addFoyer(Foyer f);

        public List<Foyer> listAllFoyer ();
        public Foyer getFoyerById (Long foyertId);
        public Foyer modifyFoyer(Foyer foyer);
        public void removeFoyer(Long foyerId);
}
