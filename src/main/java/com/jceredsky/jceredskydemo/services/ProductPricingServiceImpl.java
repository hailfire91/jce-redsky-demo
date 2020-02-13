package com.jceredsky.jceredskydemo.services;

import com.jceredsky.jceredskydemo.domain.Price;
import com.jceredsky.jceredskydemo.domain.RedisPrice;
import com.jceredsky.jceredskydemo.repository.PriceRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductPricingServiceImpl implements ProductPricingService {

    private PriceRepository priceRepository;

    public ProductPricingServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public Price getPriceById(String id) {
        Price price = new Price();
        RedisPrice redisPrice = null;
//        try {
            redisPrice = priceRepository.findById(id).orElse(null);
//        } catch(Exception e) {
            if (redisPrice != null) {
                price.setCurrency_code(redisPrice.getCurrency_code());
                price.setValue(redisPrice.getValue());
            }
//        }
        return price;
    }

    @Override
    public RedisPrice updatePriceById(RedisPrice redisPrice) {
        return priceRepository.save(redisPrice);
    }
}
