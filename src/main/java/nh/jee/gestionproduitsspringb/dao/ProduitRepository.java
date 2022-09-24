package nh.jee.gestionproduitsspringb.dao;

import nh.jee.gestionproduitsspringb.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {
    @Query("select p from Produit p where p.nom like %:x%")
    List<Produit> findByNom(@Param("x")String mc);
    List<Produit> findAll();
}
