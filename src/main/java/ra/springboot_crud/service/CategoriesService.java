package ra.springboot_crud.service;

import ra.springboot_crud.model.Categories;

import java.util.List;

public interface CategoriesService {
    List<Categories> findAll();
    Categories create(Categories categories);
    Categories update(Categories categories, int catalogId);
    void delete(int catalogId);
    List<Categories> findByName(String catalogName);
}
