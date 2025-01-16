package com.example.MyMarket_API2

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Produit(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Int=0,
    val nomP : String,
    val description : String,
    var prix : Double,
    var category: String,
    val image : Int,
    var quantite : Int,
    var Promo:Int = 0,
    var quantitePanier:Int=1
){
    constructor() : this(
        id = 0,
        nomP = "",
        description = "",
        prix = 0.0,
        category = "",
        image = 0,
        quantite = 0,
        Promo = 0,
        quantitePanier = 0
    )
}

