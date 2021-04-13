package fr.poecjava.javase.classes;

public class Rationnel {
    private long numerateur;
    private long denominateur;

    public Rationnel(long numerateur, long denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public long getNumerateur() {
        return numerateur;
    }

    public void setNumerateur(long numerateur) {
        this.numerateur = numerateur;
    }

    public long getDenominateur() {
        return denominateur;
    }

    public void setDenominateur(long denominateur) {
        this.denominateur = denominateur;
    }


    public String toString() {
        return  " numerateur = " + numerateur + ", denominateur = " + denominateur ;
    }

    public static Rationnel create(long numerateur, long denominateur){
        Rationnel rationnel = new Rationnel(numerateur, denominateur);
        return rationnel;
    }

    public Rationnel copy(){
        Rationnel rationnel = new Rationnel(this.numerateur, this.denominateur);
        return rationnel;
    }

    public Rationnel opposite() {
        long temp = - this.numerateur;
        Rationnel rationnel = new Rationnel(temp, this.denominateur);
        return rationnel;
    }

    public Rationnel inverse() {
        Rationnel rationnel = new Rationnel(this.denominateur, this.numerateur);
        return rationnel;
    }

    public void reduce() {

        Rationnel rationnel = new Rationnel(this.numerateur, this.denominateur);
        if (this.numerateur > this.denominateur){
            rationnel.inverse();
        }
        long division = this.numerateur % this.denominateur;
        while(division != 0) {
            this.numerateur = this.denominateur;
            this.denominateur = division;
            division = this.numerateur % this.denominateur;

        }
        System.out.println("Reduce :" + division );
    }

    public boolean isPositive() {
        boolean bool = false;
        if (this.numerateur > 0 && this.denominateur >0){
            bool = true;
        }
        return bool;
    }

    public Rationnel add(Rationnel other){
        return Rationnel.create(other.numerateur+ this.numerateur,
                other.denominateur + this.denominateur);
    }

    public void addTo(Rationnel other){
       Rationnel newRat =  Rationnel.create(other.numerateur+ this.numerateur,
                other.denominateur + this.denominateur);
        System.out.println("Addition : " + newRat);
    }

    public Rationnel sub(Rationnel other){
        return Rationnel.create(other.numerateur - this.numerateur,
                other.denominateur - this.denominateur);
    }

    public Rationnel multiply(Rationnel other){
        return Rationnel.create(other.numerateur * this.numerateur,
                other.denominateur * this.denominateur);
    }


    public Rationnel divide(Rationnel other){
        return Rationnel.create(other.numerateur / this.numerateur,
                other.denominateur / this.denominateur);
    }

    public boolean equals(Rationnel other)
    {
        return this.numerateur + other.numerateur == this.denominateur + other.denominateur ;
    }

    public int compareTo(Rationnel other){
        int count = 0;
        if (this.numerateur + other.numerateur == this.denominateur + other.denominateur){
            count = 0;
        } else if (this.numerateur + other.numerateur > this.denominateur + other.denominateur){
            count = -1;
        }else{
            count = 1;
        }
        return count;
    }



}
