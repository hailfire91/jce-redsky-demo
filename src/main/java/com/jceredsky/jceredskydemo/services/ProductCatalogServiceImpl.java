package com.jceredsky.jceredskydemo.services;

import com.jceredsky.jceredskydemo.domain.ShortProduct;
import com.jceredsky.jceredskydemo.models.RedskyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductCatalogServiceImpl implements ProductCatalogService {

private ProductInfoService productInfoService;

    public ProductCatalogServiceImpl(ProductInfoService productInfoService) {
        this.productInfoService = productInfoService;
    }

    @Override
    public ShortProduct getProductBuId(String id) {
        ShortProduct shortProduct = productInfoService.getProductBuId(id);
        return shortProduct;
    }

}
