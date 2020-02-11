package com.jceredsky.jceredskydemo.controllers;

import com.jceredsky.jceredskydemo.domain.ShortProduct;
import com.jceredsky.jceredskydemo.services.ProductCatalogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ProductController.BASE_URL)
public class ProductController {

    private ProductCatalogService productCatalogService;

    public ProductController(ProductCatalogService productCatalogService) {
        this.productCatalogService = productCatalogService;
    }

    public static final String BASE_URL = "/api/v1/products";

    @GetMapping("/{id}")
    public ShortProduct getProductById(@PathVariable String id) {
        return productCatalogService.getProductBuId(id);
    }
}
