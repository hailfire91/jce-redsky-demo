package com.jceredsky.jceredskydemo.controllers;

import com.jceredsky.jceredskydemo.domain.Product;
import com.jceredsky.jceredskydemo.domain.RedisPrice;
import com.jceredsky.jceredskydemo.services.ProductCatalogService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ProductController.BASE_URL)
public class ProductController {

    private ProductCatalogService productCatalogService;

    public ProductController(ProductCatalogService productCatalogService) {
        this.productCatalogService = productCatalogService;
    }

    public static final String BASE_URL = "/api/v1/products";

    /**
     * This api call will return a fully formed product if on exists.
     * @param id id of the product to be returned
     * @return json encoded product
     */
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        try {
            return productCatalogService.getProductBuId(id);
        } catch(Exception e) {
            //TODO figure out if there is a better way to handle this
            return null;
        }
    }

    /**
     *
     * This api call will return the result of the update call to the database.
     * @param product product who's price should be updated
     * @return created object from the database
     */
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public RedisPrice savePrice(@RequestBody Product product) {
        return productCatalogService.savePriceById(product);
    }
}
