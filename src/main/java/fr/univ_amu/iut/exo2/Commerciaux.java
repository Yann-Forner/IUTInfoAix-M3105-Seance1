package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Commerciaux extends Employe {
    protected double chiffreAffaires;
    protected double tauxCommission;

    public Commerciaux(int num_employe, String numeroInsee, String nom_employe, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(num_employe, numeroInsee, nom_employe, echelon, dateNaissance, dateEmbauche, base, nbHeures);
        this.chiffreAffaires = chiffreAffaires;
        this.tauxCommission = tauxCommission;
    }


    public void negocieTransaction(){
        System.out.println("négocie une transaction");
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
                ", type =Commerciaux \n"+
                '}';
    }
    @Override
    public double calcSalaireBrut(){
        return base+chiffreAffaires*tauxCommission+100;
    }
}
