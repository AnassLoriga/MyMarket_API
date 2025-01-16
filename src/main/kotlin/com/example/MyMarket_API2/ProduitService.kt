package com.example.MyMarket_API2

import org.springframework.stereotype.Service

@Service
class ProduitService(private val productRepository: ProduitRepository) {

    fun ajouterProduit(product: Produit): Produit {
        return productRepository.save(product)
    }

    fun getAllProduits(): List<Produit> {
        return productRepository.findAll()
    }

    fun findProduitById(id: Int): Produit {
        return productRepository.findById(id.toLong())
            .orElseThrow { RuntimeException("Produit avec ID $id introuvable") }
    }

    fun deleteProduitById(id: Int) {
        if (!productRepository.existsById(id.toLong())) {
            throw RuntimeException("Produit avec ID $id introuvable")
        }
        productRepository.deleteById(id.toLong())
    }

    fun updateProduitById(id: Int, updatedProduit: Produit): Produit {
        val ProduitById = productRepository.findById(id.toLong())
            .orElseThrow { RuntimeException("Produit avec ID $id introuvable") }
        val ProduitModifier = ProduitById.copy(
            nomP = updatedProduit.nomP,
            description = updatedProduit.description,
            prix = updatedProduit.prix,
            category = updatedProduit.category,
            image = updatedProduit.image,
            quantite = updatedProduit.quantite,
            Promo = updatedProduit.Promo,
            quantitePanier = updatedProduit.quantitePanier
        )
        return productRepository.save(ProduitModifier)
    }
}

