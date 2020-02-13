package com.jceredsky.jceredskydemo.services;

import com.jceredsky.jceredskydemo.domain.Product;
import com.jceredsky.jceredskydemo.domain.RedisPrice;

public interface ProductCatalogService {

    Product getProductBuId(String id);

    RedisPrice savePriceById(Product product);
}
