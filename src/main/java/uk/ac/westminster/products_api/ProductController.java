package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping ("/product")
public class ProductController {
    //CRUD OPERATIONS : CREATE,READ,UPDATE,DELETE
    @Autowired
    private ProductService productService;

    @GetMapping ("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
        }


}

