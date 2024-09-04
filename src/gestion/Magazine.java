package gestion;

import java.time.LocalDate;

public class Magazine extends document {

    private int numero;

    public Magazine(String auteur, String titre, int nombreDePages, LocalDate dateDePublication, boolean etat, int numero) {
        super(auteur, titre, nombreDePages, dateDePublication, etat);
        this.numero = numero;
    }


    
    @Override
    public void afficherDetails() {
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------------------Magazine------------------------");
		System.out.println("ID : " + this.id + "\n");
        System.out.println("Titre : " + this.titre + "\n");
        System.out.println("Auteur : " + this.auteur + "\n");
        System.out.println("Date de publication : " + this.dateDePublication + "\n");
        System.out.println("Nombre des pages : " + this.nombreDePages + "\n");
        System.out.println("--------------------------------------------------------");
    }

    @Override
    public void emprunter() {
        this.etat = true;
    }

    @Override
    public void retourner() {
        this.etat = false;
    }

    // Getters
    public int  getNumero() {
        return this.numero ;

    }
    public void  SetNumero(int numero){
        this.numero = numero;
    }

    
    
}
