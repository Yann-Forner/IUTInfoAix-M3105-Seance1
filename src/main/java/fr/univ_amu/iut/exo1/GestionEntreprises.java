package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class GestionEntreprises {
    public static void main(String[] args) {
        Employe tristan = new Employe(
                0,
                "05056416541560",
                "LAROUBINE",
                0,
                LocalDate.of(2000, Month.NOVEMBER, 16),
                LocalDate.of(1999, Month.NOVEMBER, 16),10,50);
        Employe teo = new Employe(
                1,
                "040",
                "MARTIN",
                -1000,
                LocalDate.of(2000, Month.NOVEMBER, 16),
                LocalDate.of(1999, Month.NOVEMBER, 16),10,50);
        Entreprise yannCorp= new Entreprise("YannCorp");
        yannCorp.embaucher(tristan);
        yannCorp.embaucher(teo);
        System.out.println(yannCorp.toString());
    }
}