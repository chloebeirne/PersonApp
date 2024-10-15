package ie.atu.personapp;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@RestController
@RequestMapping("/products")
public class ProductController {
    List<Product> productList = new ArrayList<>();
    public String getProducts(){
        return "products listed";
    }

    @GetMapping
    public List<Product> getProducts(){
        return productList;
    }

    @PostMapping
    public List<Product> addProduct(@Valid @RequestBody Product product){
        productList.add(Product);
        return productList;
    }
}

