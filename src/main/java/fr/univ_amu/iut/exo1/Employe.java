package fr.univ_amu.iut.exo1;


import java.time.LocalDate;

public class Employe {

    protected int num_employe;
    protected String numeroInsee;
    protected  String nom_employe;
    protected  int echelon;
    protected  LocalDate dateNaissance;
    protected  LocalDate dateEmbauche;
    protected double base;
    protected double nbHeures;


    public Employe(int num_employe, String numeroInsee, String nom_employe, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche,double base, double nbHeures) {
        this.num_employe = num_employe;
        this.numeroInsee = numeroInsee;
        this.nom_employe = nom_employe;
        this.echelon = echelon;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.base=base;
        this.nbHeures=nbHeures;
    }



    public void showEmploye()
    {
        System.out.println(this.num_employe + " : "
                +this.numeroInsee+", "
                +this.nom_employe+", "
                +this.dateNaissance +", "
                +this.dateEmbauche+" --  "
                +this.echelon);
    }
    public double calcSalaireBrut(){
        return this.base * this.nbHeures;
    }
    public double calcSalaireNet(){return 0.8*(calcSalaireBrut()); }
    public int getNum_employe() {
        return num_employe;
    }

    public void setNum_employe(int num_employe) {
        this.num_employe = num_employe;
    }

    public String getNumeroInsee() {
        return numeroInsee;
    }

    public void setNumeroInsee(String numeroInsee) {
        this.numeroInsee = numeroInsee;
    }

    public String getNom_employe() {
        return nom_employe;
    }

    public void setNom_employe(String nom_employe) {
        this.nom_employe = nom_employe;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "num_employe=" + num_employe +
                ", numeroInsee='" + numeroInsee + '\'' +
                ", nom_employe='" + nom_employe + '\'' +
                ", echelon=" + echelon +
                ", dateNaissance=" + dateNaissance +
                ", dateEmbauche=" + dateEmbauche +
                ", salaire Brut ="+calcSalaireBrut()+
                '}';
    }
}
