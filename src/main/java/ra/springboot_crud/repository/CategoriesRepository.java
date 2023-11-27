package ra.springboot_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ra.springboot_crud.model.Categories;

import java.util.List;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories,Integer> {
    @Query("select c from Categories c where c.catalogName like %?1%")
    List<Categories> findByCatalogName(String catalogName);
}
