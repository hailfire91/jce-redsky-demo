package com.jceredsky.jceredskydemo.services;

import com.jceredsky.jceredskydemo.domain.Price;
import com.jceredsky.jceredskydemo.domain.RedisPrice;

public interface ProductPricingService {

    public Price getPriceById(String id);

    public RedisPrice updatePriceById(RedisPrice redisPrice);

}
