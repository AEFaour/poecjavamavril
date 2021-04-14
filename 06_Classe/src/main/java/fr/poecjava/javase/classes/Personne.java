package fr.poecjava.javase.classes;

import java.time.LocalDate;
import java.time.Period;


public class Personne {

    //Attributs
    private String prenom;
    private LocalDate ddn;
    private Personne conjoint;

    public Personne(String prenom, LocalDate ddn) {
       this.prenom = prenom;
       this.ddn = ddn;
    }


	public String getPrenom() {
        return prenom;
    }

    public LocalDate getDdn() {
        return ddn;
    }

    public Personne getConjoint() {
        return conjoint;
    }

    public int getAge(){
        Period p = Period.between(ddn, LocalDate.now());
        int age = p.getYears();
        return age;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void seMarier(Personne pp){
        if (getAge() >= 18 && pp.getAge() >= 18 && conjoint == null && pp.conjoint == null){
            conjoint = pp;
            pp.conjoint = this;
        }
    }

    public String description() {
        String texte = String.format("%s, %s ans ", prenom, getAge());
        if(conjoint != null){
            texte += String.format("a pour conjoint %s, %s", conjoint.prenom, conjoint.getAge());
        }
        return texte;

    }

}
