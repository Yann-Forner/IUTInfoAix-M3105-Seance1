package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Techniciens extends Employe {
    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Techniciens(int num_employe, String numeroInsee, String nom_employe, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double nbHeures, int nbUnitesProduites, double tauxCommissionUnite) {
        super(num_employe, numeroInsee, nom_employe, echelon, dateNaissance, dateEmbauche, base, nbHeures);
        this.nbUnitesProduites = nbUnitesProduites;
        this.tauxCommissionUnite = tauxCommissionUnite;
    }


    public void fabriquerProduit(){
        System.out.println("fabrique un produit");
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
                ", type =Techniciens \n"+
                '}';
    }
    @Override
    public double calcSalaireBrut(){
        return base*nbHeures+nbUnitesProduites*tauxCommissionUnite+100;
    }
}
