package nh.jee.gestionproduitsspringb.dao;

import nh.jee.gestionproduitsspringb.entities.Categorie;
import nh.jee.gestionproduitsspringb.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

    @Query("select c from Categorie c")
    List<Categorie> findAll();
}
