package fr.univ_amu.iut.exo3;

public class GestionEntreprises {
    public static void main(String[] args) {
        Vendeur tristan = new Vendeur(
                0,
                "05056416541560",
                "LAROUBINE",
                0,
                LocalDate.of(2000, Month.NOVEMBER, 16),
                LocalDate.of(1999, Month.NOVEMBER, 16),10,50,1000000,0.0000001);
        Representant teo = new Representant(
                1,
                "040",
                "MARTIN",
                0,
                LocalDate.of(2000, Month.NOVEMBER, 16),
                LocalDate.of(1999, Month.NOVEMBER, 16),10,50,1000000,0.0000001);
        Entreprise yannCorp= new Entreprise("YannCorp");
        yannCorp.embaucher(tristan);
        yannCorp.embaucher(teo);
        System.out.println(yannCorp.toString());
    }
}