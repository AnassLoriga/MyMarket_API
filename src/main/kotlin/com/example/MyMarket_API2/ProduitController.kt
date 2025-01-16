import com.example.MyMarket_API2.Produit
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/produits")
class ProduitController(private val produitRepository: ProduitRepository){
    @GetMapping
    fun getSongs():List<Produit>{
        return produitRepository.findAll()
    }

    @PostMapping
    fun addProduit(@RequestBody produit: Produit):Produit{
        return produitRepository.save(produit)
    }

}
