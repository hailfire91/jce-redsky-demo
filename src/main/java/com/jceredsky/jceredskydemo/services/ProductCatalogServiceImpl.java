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

    @Override
    public Product getProductBuId(String id) {
        Product product = productInfoService.getProductBuyId(id);
        Price price = productPricingService.getPriceById(id);
        product.setPrice(price);
        return product;
    }

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
