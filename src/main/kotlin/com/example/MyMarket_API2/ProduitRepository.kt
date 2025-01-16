import com.example.MyMarket_API2.Produit
import org.springframework.data.jpa.repository.JpaRepository

interface ProduitRepository : JpaRepository<Produit, Long>
