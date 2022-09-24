package nh.jee.gestionproduitsspringb.controller;

import nh.jee.gestionproduitsspringb.entities.Categorie;
import nh.jee.gestionproduitsspringb.entities.Produit;
import nh.jee.gestionproduitsspringb.service.IServiceCategorie;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategorieController {
    IServiceCategorie serviceCategorie;

    @GetMapping("/all")
    public String getAllProduits(Model model) {
        List<Categorie> categorieList = serviceCategorie.getAllCategories();
        model.addAttribute("categorieList", categorieList);
        return "categories";
    }

}
