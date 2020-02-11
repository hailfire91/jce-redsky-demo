package com.jceredsky.jceredskydemo.services;

import com.jceredsky.jceredskydemo.domain.ShortProduct;
import com.jceredsky.jceredskydemo.models.RedskyResponse;
import com.jceredsky.jceredskydemo.resources.RedskyResource;
import org.springframework.stereotype.Service;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    private RedskyResource redskyResource;

    public ProductInfoServiceImpl(RedskyResource redskyResource) {
        this.redskyResource = redskyResource;
    }

    @Override
    public ShortProduct getProductBuId(String id) {
        RedskyResponse response = redskyResource.getRedskyProduct(id);
        //Pull the values we need out of the Marshaled json
        String tcin = response.getProduct().getItem().getTcin();
        String title = response.getProduct().getItem().getProduct_description().getTitle();

        ShortProduct product = new ShortProduct();
        product.setId(tcin);
        product.setName(title);

        return product;
    }
}
