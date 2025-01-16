import com.example.MyMarket_API2.Produit
import org.springframework.stereotype.Service

@Service
class ProduitService(private val productRepository: ProduitRepository) {

    fun addProduct(product: Produit): Produit {
        return productRepository.save(product)
    }
}
