package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Representant extends Commerciaux {

    public Representant(int num_employe, String numeroInsee, String nom_employe, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(num_employe, numeroInsee, nom_employe, echelon, dateNaissance, dateEmbauche, base, nbHeures, chiffreAffaires, tauxCommission);
    }
    @Override
    public double calcSalaireBrut() {
        return base * nbHeures + echelon * 100 + 100;
    }
}
