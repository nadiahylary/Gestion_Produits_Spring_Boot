package nh.jee.gestionproduitsspringb.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private double prix;
    private String nom;
    private int quantite;

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToOne()
    private Categorie categorie;

    public Produit( String nom, double prix, int quantite,Categorie categorie) {
        this.prix = prix;
        this.nom = nom;
        this.quantite = quantite;
        this.categorie = categorie;
    }

    public Produit(String nom, double prix, int quantite) {
        this.prix = prix;
        this.nom = nom;
        this.quantite = quantite;
    }

    public Produit(int id, String nom, double prix, int quantite, Categorie categorie) {
        this.id = id;
        this.prix = prix;
        this.nom = nom;
        this.quantite = quantite;
        this.categorie = categorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

}
