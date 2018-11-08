package fr.univ_amu.iut.exo1;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Entreprise implements Serializable {
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
    public void distribuerBonus(double bonus)
    {
        Comparator<Employe> employeComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.dateEmbauche.compareTo(o2.dateEmbauche);
            }
        };
        PriorityQueue<Employe> priorityQueue = new PriorityQueue<Employe>(employesList.size(), employeComparator);
        priorityQueue.addAll(this.employesList);

        while (bonus > 0 && !priorityQueue.isEmpty()){
            Employe e=priorityQueue.poll();
            double prime=0;
            if(bonus<e.calcAnciennete()*10){
                prime=bonus;
                bonus=0;
            }else
            {
                prime = e.calcAnciennete()*10;
                bonus=bonus-e.calcAnciennete()*10;
            }
            System.out.println(e.getNom_employe() + " : "+ prime);
        }

    }
    public void updateEntr()
    {
        ObjectOutputStream oos = null;
        try {
           final FileOutputStream fichier = new FileOutputStream("Entreprise.ser");
            oos = new ObjectOutputStream(fichier);
            oos.writeObject(this);
            oos.flush();
            System.out.println("ok");
        }catch (final java.io.IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(oos != null){
                    oos.flush();
                    oos.close();
                }
            }catch (final IOException ex){
                ex.printStackTrace();
            }
        }
    }
    public Entreprise loadEntr()
    {
        ObjectInputStream ois = null;
        try {
            final FileInputStream fichier = new FileInputStream("Entreprise.ser");
            ois = new ObjectInputStream(fichier);
            return (Entreprise) ois.readObject();
        }catch (final IOException | ClassNotFoundException e){
            e.printStackTrace();
        } finally {
            try {
                if(ois !=null){
                    ois.close();
                }
            }catch (final IOException ex){
                ex.printStackTrace();
            }
        }
        return null;
    }
}

