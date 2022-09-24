package nh.jee.gestionproduitsspringb.service;

import nh.jee.gestionproduitsspringb.entities.Categorie;

import java.util.List;

public interface IServiceCategorie {
    public List<Categorie> getAllCategories();
    public void addCategorie(Categorie categorie);
    public Categorie getCategorie(int id);
    public void deleteCategorie(int id);
}
