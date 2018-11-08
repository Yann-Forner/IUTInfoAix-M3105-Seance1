package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;


public class EmployesOrdinaires extends Employe {
    public EmployesOrdinaires(int num_employe, String numeroInsee, String nom_employe, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double nbHeures) {
        super(num_employe, numeroInsee, nom_employe, echelon, dateNaissance, dateEmbauche, base, nbHeures);
    }

    public void effectueTacheOrdinaire(){
        System.out.println("effectue une tache ordinaire");
    }
    @Override
    public String toString(){
        return "Employe{" +
                "num_employe=" + num_employe +
                ", numeroInsee='" + numeroInsee + '\'' +
                ", nom_employe='" + nom_employe + '\'' +
                ", echelon=" + echelon +
                ", dateNaissance=" + dateNaissance +
                ", dateEmbauche=" + dateEmbauche +
                ", salaire Brut ="+calcSalaireBrut()+
                ", type =Employe oridnaire\n"+
                '}';
    }
    @Override
    public double calcSalaireBrut(){
        return base*nbHeures+echelon*100+100;
    }
}
