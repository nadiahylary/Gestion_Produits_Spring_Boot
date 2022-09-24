package nh.jee.gestionproduitsspringb.service;

import nh.jee.gestionproduitsspringb.entities.Produit;

import java.util.List;

public interface IServiceProduit {
    public void ajouterProduit(Produit p);
    public void supprimerProduit(int id);
    public void mettreAjourProduit(Produit p);
    public List<Produit> getAllProduits();
    public List<Produit> getProduitsBMC(String motcle);
    public Produit getProduit(int id);
}
