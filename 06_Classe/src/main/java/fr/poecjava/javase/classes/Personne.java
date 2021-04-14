package fr.poecjava.javase.classes;

import java.time.LocalDate;
import java.time.Period;

public class Personne {

	// Attributs
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

	public int getAge() {
		Period p = Period.between(ddn, LocalDate.now());
		int age = p.getYears();
		return age;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void seMarier(Personne pp) {
		if (getAge() >= 18 && pp.getAge() >= 18 && conjoint == null && pp.conjoint == null) {
			conjoint = pp;
			pp.conjoint = this;
		}
	}

	public String description() {
		String texte = String.format("%s, %s ans ", prenom, getAge());
		if (conjoint != null) {
			texte += String.format("a pour conjoint %s, %s", conjoint.prenom, conjoint.getAge());
		}
		return texte;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ddn == null) ? 0 : ddn.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (ddn == null) {
			if (other.ddn != null)
				return false;
		} else if (!ddn.equals(other.ddn))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		// return "Personne [prenom=" + prenom + ", ddn=" + ddn + ", conjoint=" +
		// conjoint + "]";
		return this.description();
	}

}
