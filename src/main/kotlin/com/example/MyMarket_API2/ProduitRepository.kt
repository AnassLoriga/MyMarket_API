package com.example.MyMarket_API2

import org.springframework.data.jpa.repository.JpaRepository

interface ProduitRepository : JpaRepository<Produit, Long>
