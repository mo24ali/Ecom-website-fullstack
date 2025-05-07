package ma.alicode.ecom.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity //declarer que la classe est une entité JPA
@Table(name = "product") // assure l'enchainement entre le classe et la table dans la base de données
//@Data //annotation de Lombok nous assure la génération en backgrounde des getters et setters
@Getter
@Setter

public class Product {

    @Id //indiquer que l'id est une clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)//definir que l'id est un auto increment
    @Column(name="id") // le mapping des attributs avec les colonnes de la table dans la base de données
    private Long id;

    @ManyToOne //Many products of the same category
    @JoinColumn(name = "category_id" , nullable = false)
    private ProductCategory category;
    @Column(name="sku")
    private String sku;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "active")
    private boolean active;
    @Column(name = "units_in_stock")
    private int unitsInStock;

    @Column(name = "date_created")
    @CreationTimestamp //utiliser pour indiquer la date de creation
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp //utiliser pour indiquer la date de updating
    private Date DateUpdated;


}
