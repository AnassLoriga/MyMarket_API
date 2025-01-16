package com.example.MyMarket_API2

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/produits")
class ProduitController(private val productService: ProduitService) {
    @PostMapping
    fun addProduit(@RequestBody product: Produit): ResponseEntity<Produit> {
        val savedProduit = productService.ajouterProduit(product)
        return ResponseEntity.ok(savedProduit)
    }

    @GetMapping
    fun getAllProduits(): ResponseEntity<List<Produit>> {
        val produits = productService.getAllProduits()
        return ResponseEntity.ok(produits)
    }

    @GetMapping("/{id}")
    fun findProduitById(@PathVariable id: Int): ResponseEntity<Produit> {
        val produit = productService.findProduitById(id)
        return ResponseEntity.ok(produit)
    }

    @DeleteMapping("/{id}")
    fun deleteProduitById(@PathVariable id: Int): ResponseEntity<Void> {
        productService.deleteProduitById(id)
        return ResponseEntity.noContent().build()
    }

    @PutMapping("/{id}")
    fun updateProduitById(@PathVariable id: Int, @RequestBody nouveauProduit: Produit): ResponseEntity<Produit> {
        val nouveau = productService.updateProduitById(id, nouveauProduit)
        return ResponseEntity.ok(nouveau)
    }
}


