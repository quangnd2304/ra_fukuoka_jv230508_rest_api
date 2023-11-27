package ra.springboot_crud.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.springboot_crud.model.Categories;
import ra.springboot_crud.repository.CategoriesRepository;
import ra.springboot_crud.service.CategoriesService;

import java.util.List;

@Service
public class CategoriesServiceImp implements CategoriesService {
    @Autowired
    private CategoriesRepository categoriesRepository;
    @Override
    public List<Categories> findAll() {
        return categoriesRepository.findAll();
    }

    @Override
    public Categories create(Categories categories) {
        return categoriesRepository.save(categories);
    }

    @Override
    public Categories update(Categories categories, int catalogId) {
        //Lay Categories cap nhat theo catalogId
        Categories catalogUpdate = categoriesRepository.findById(catalogId).get();
        catalogUpdate.setCatalogName(categories.getCatalogName());
        catalogUpdate.setCatalogStatus(categories.isCatalogStatus());
        return categoriesRepository.save(catalogUpdate);
    }

    @Override
    public void delete(int catalogId) {
        categoriesRepository.deleteById(catalogId);
    }

    @Override
    public List<Categories> findByName(String catalogName) {
        return categoriesRepository.findByCatalogName(catalogName);
    }
}
