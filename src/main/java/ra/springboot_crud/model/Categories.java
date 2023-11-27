package ra.springboot_crud.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Categories")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "catalog_id")
    private int catalogId;
    @Column(name = "catalog_name", unique = true, columnDefinition = "varchar(50)")
    private String catalogName;
    @Column(name = "catalog_status")
    private boolean catalogStatus;
}
