package ma.alicode.ecom.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "product_category")
//@Data
@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "category_name")
    private String categoryName;

    /**
     * because we have ManyToOne and OneToMany property
     * Many products belong to one category
     * One category has many products
     * we need to concrete that by using a Set
     */
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "category") //relation en cascade signifie que la suppression de la class mère nécessite la suppression de la classe fille
    //one category belong to Many product or we can say many product of the same category
    private Set<Product> products;
}
