package nh.jee.gestionproduitsspringb.controller;

import nh.jee.gestionproduitsspringb.entities.Categorie;
import nh.jee.gestionproduitsspringb.entities.Produit;
import nh.jee.gestionproduitsspringb.service.IServiceCategorie;
import nh.jee.gestionproduitsspringb.service.IServiceProduit;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class ProduitController {
    @Autowired
    IServiceProduit serviceProduit;
    @Autowired
    IServiceCategorie serviceCategorie;

    @Autowired
    public ProduitController(IServiceProduit serviceProduit, IServiceCategorie serviceCategorie) {
        this.serviceProduit = serviceProduit;
        this.serviceCategorie = serviceCategorie;
    }

    @GetMapping("/products")
    public String getAllProduits(Model model) {
        List<Produit> produitList = serviceProduit.getAllProduits();
        model.addAttribute("products", produitList);
        return "produits";
    }
    @GetMapping("/produitmc")
    public String getProduitsPMC(@RequestParam String mc, Model model){
        List<Produit> produitList = serviceProduit.getProduitsBMC(mc);
        model.addAttribute("products", produitList);
        return "produits";
    }
    @GetMapping("/supprimerproduit{id}")
    public String supprimerProduit(@PathVariable int id){
        serviceProduit.supprimerProduit(id);
        return "redirect:api/products";
    }

    @GetMapping("/ajouterProduit")
    public String ajouterProduit(Model model){
        model.addAttribute("categories", serviceCategorie.getAllCategories());
        return "ajouterProduit";

    }

    @PostMapping("/ajouterProduit")
    public String ajouter(Produit prod, @RequestParam("categorie")int idCat){
        Categorie categorie = serviceCategorie.getCategorie(idCat);
        prod.setCategorie(categorie);
        /*if(!idProd.equals(""))
            prod.setId(Integer.parseInt(idProd));*/
        serviceProduit.ajouterProduit(prod);
        return "redirect:/api/products";
    }

    @GetMapping("/modifierproduit/{id}")
    public String mettreAjourProduit(Model model, @PathVariable("id") String id){
        model.addAttribute("categories", serviceCategorie.getAllCategories());
        model.addAttribute("produit", serviceProduit.getProduit(Integer.parseInt(id)));
        return "ajouterproduit";
    }

}
