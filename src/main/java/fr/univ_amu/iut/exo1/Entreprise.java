package fr.univ_amu.iut.exo1;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
    private String nom;
    private List<Employe> employesList =new ArrayList<>();

    public Entreprise(String nom ){
        this.nom = nom;
    }

    public void embaucher(Employe employe)
    {
        this.employesList.add(employe);
    }
    public void licensier(Employe employe)
    {
        this.employesList.remove(employe);
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Employe> getEmployesList() {
        return employesList;
    }

    public void setEmployesList(List<Employe> employesList) {
        this.employesList = employesList;
    }

    @Override
    public String toString() {

        return "Entreprise{" +
                "nom='" + nom + '\'' +
                ", employesList=" + employesList +"\n"+
                '}';
    }
}
