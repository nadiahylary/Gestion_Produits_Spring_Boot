package nh.jee.gestionproduitsspringb.service;

import nh.jee.gestionproduitsspringb.dao.CategorieRepository;
import nh.jee.gestionproduitsspringb.entities.Categorie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCategorie implements IServiceCategorie{
    private CategorieRepository categorieRepository;

    public ServiceCategorie(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }

    @Override
    public void addCategorie(Categorie categorie) {
        categorieRepository.save(categorie);
    }

    @Override
    public Categorie getCategorie(int id) {
        return categorieRepository.findById(id).get();
    }

    @Override
    public void deleteCategorie(int id) {
        categorieRepository.deleteById(id);
    }
}
