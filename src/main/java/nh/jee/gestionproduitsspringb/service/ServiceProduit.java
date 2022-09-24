package nh.jee.gestionproduitsspringb.service;

import nh.jee.gestionproduitsspringb.dao.ProduitRepository;
import nh.jee.gestionproduitsspringb.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduit implements IServiceProduit{
    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public void ajouterProduit(Produit p) {
        produitRepository.save(p);
    }

    @Override
    public void supprimerProduit(int id) {
        produitRepository.deleteById(id);
    }

    @Override
    public void mettreAjourProduit(Produit p) {
        produitRepository.save(p);
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public List<Produit> getProduitsBMC(String motcle) {
        return produitRepository.findByNom(motcle);
    }

    @Override
    public Produit getProduit(int id) {
        return produitRepository.getById(id);
    }
}
