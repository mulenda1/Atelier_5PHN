package org.example;

public class Admin {
    private String nom;
    private String postNom;
    private String prenom;

    // Constructeur
    public Admin(String nom, String postNom, String prenom) {
        this.nom = nom;
        this.postNom = postNom;
        this.prenom = prenom;
    }

    // 👉 Ajoute cette méthode :
    public String getNomComplet() {
        return nom + " " + postNom + " " + prenom;
    }

    // Autres méthodes...
    public void ajouterOuvrier(GestionChantiers gestion, Ouvriers ouvrier) {
        gestion.ajouterOuvrier(ouvrier);
    }
}
