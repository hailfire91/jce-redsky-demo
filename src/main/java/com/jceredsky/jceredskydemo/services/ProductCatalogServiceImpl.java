package com.jceredsky.jceredskydemo.services;

import com.jceredsky.jceredskydemo.domain.Price;
import com.jceredsky.jceredskydemo.domain.Product;
import com.jceredsky.jceredskydemo.domain.RedisPrice;
import org.springframework.stereotype.Service;

@Service
public class ProductCatalogServiceImpl implements ProductCatalogService {

    private ProductInfoService productInfoService;
    private ProductPricingService productPricingService;

    public ProductCatalogServiceImpl(ProductInfoService productInfoService, ProductPricingService productPricingService) {
        this.productInfoService = productInfoService;
        this.productPricingService = productPricingService;
    }

    /**
     * This function gets the produce info and price from their respective services and combines them into a product for return.
     * @param id id of the product to get.
     * @return the requested Product.
     */
    @Override
    public Product getProductById(String id) {
        Product product = productInfoService.getProductBuyId(id);
        Price price = productPricingService.getPriceById(id);
        product.setPrice(price);
        return product;
    }

    /**
     * This function converts the product into a redis price so it can be updated in the database.
     * @param product product Who's price should be updated.
     * @return the database creation objectS.
     */
    @Override
    public RedisPrice savePriceById(Product product) {
        RedisPrice redisPrice = new RedisPrice();
        Price price = product.getPrice();
        redisPrice.setId(product.getId());
        redisPrice.setValue(price.getValue());
        redisPrice.setCurrency_code(price.getCurrency_code());
        return productPricingService.updatePriceById(redisPrice);
    }
}
