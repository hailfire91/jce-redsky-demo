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

    /**
     * This function interacts with the database to pull the price information for the requested product.
     * @param id id of the price
     * @return regular Price Object
     */
    @Override
    public Price getPriceById(String id) {
        Price price = new Price();
        RedisPrice redisPrice = null;
        try {
            redisPrice = priceRepository.findById(id).orElse(null);
        } catch(Exception e) {
            //TODO some logging so we know something is going wrong here
            return null;
        }
        if (redisPrice != null) {
            price.setCurrency_code(redisPrice.getCurrency_code());
            price.setValue(redisPrice.getValue());
        }
        return price;
    }

    @Override
    public RedisPrice updatePriceById(RedisPrice redisPrice) {
        return priceRepository.save(redisPrice);
    }
}
