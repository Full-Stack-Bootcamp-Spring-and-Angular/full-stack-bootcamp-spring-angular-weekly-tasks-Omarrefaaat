package com.example.demo.Controller;
import com.example.demo.Model.ProductModel;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class HomeController {



    @Autowired
    private ProductService productService;


    @PostMapping
    public ResponseEntity<ProductModel> addProduct(@RequestBody ProductModel product) {
        ProductModel insert =productService.insert(product);
        return ResponseEntity.ok().body(insert);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductModel> updateProduct(@RequestBody ProductModel product, @PathVariable int id) {
        ProductModel insert = productService.update(id, product);
        return ResponseEntity.ok().body(insert);
    }

    @GetMapping
    public ResponseEntity<List<ProductModel>> getAllProducts() {
        return ResponseEntity.ok().body(productService.getAll());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id) {
        productService.delete(id);
        return ResponseEntity.ok("Deleted Successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductModel> getProductById(@PathVariable int id) {
        return ResponseEntity.ok(productService.getById(id));
    }

}
