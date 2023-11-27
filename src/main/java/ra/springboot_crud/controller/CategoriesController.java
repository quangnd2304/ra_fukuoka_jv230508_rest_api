package ra.springboot_crud.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ra.springboot_crud.model.Categories;
import ra.springboot_crud.service.CategoriesService;

import java.util.List;
@RestController
@RequestMapping("api/v1/categories")
public class CategoriesController {
    @Autowired
    private CategoriesService categoriesService;
    @GetMapping
    public List<Categories> getAllCategories(){
        return categoriesService.findAll();
    }
    @PostMapping
    public Categories create(@RequestBody Categories categories){
        return categoriesService.create(categories);
    }
    @PutMapping("/{catalogId}")
    public Categories update(@RequestBody Categories categories,@PathVariable int catalogId){
        return  categoriesService.update(categories,catalogId);
    }
    @DeleteMapping("/{catalogId}")
    public void delete(@PathVariable int catalogId){
        categoriesService.delete(catalogId);
    }
    @GetMapping("/searchName")
    public List<Categories> findByName(@PathParam("catalogName") String catalogName){
        System.out.println("VAO FIND BY NAME");
        return categoriesService.findByName(catalogName);
    }

}
