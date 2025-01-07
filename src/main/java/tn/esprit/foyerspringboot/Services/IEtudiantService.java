package tn.esprit.foyerSpringBoot.Services;

import tn.esprit.foyerSpringBoot.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public Etudiant addEtudiant(Etudiant e);

    public List<Etudiant> listAllEtudiant ();
    public Etudiant getEtudiantById (Long etudiantId);
    public Etudiant modifyEtudiant(Etudiant etudiant);
    public void removeEtudiant(Long etudiantId);
}
