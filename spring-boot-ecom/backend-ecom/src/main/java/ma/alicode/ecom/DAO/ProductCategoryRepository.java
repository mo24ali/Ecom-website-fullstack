package ma.alicode.ecom.DAO;

import ma.alicode.ecom.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel ="productCategory", path = "product_category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {
}
