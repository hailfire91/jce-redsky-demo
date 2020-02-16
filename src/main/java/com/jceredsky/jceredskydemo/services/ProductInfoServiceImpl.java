package com.jceredsky.jceredskydemo.services;

import com.jceredsky.jceredskydemo.domain.Product;
import com.jceredsky.jceredskydemo.models.RedskyResponse;
import com.jceredsky.jceredskydemo.resources.RedskyResource;
import org.springframework.stereotype.Service;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    private RedskyResource redskyResource;

    public ProductInfoServiceImpl(RedskyResource redskyResource) {
        this.redskyResource = redskyResource;
    }

    /**
     * This function pulls the data we need for the product object out of the marshaled json object and
     * created a new Product with this data.
     * @param id id of the product to get
     * @return the product
     */
    @Override
    public Product getProductBuyId(String id) {
        RedskyResponse response = redskyResource.getRedskyProduct(id);
        //Pull the values we need out of the Marshaled json
        String tcin = response.getProduct().getRedskyItem().getTcin();
        String title = response.getProduct().getRedskyItem().getProduct_description().getTitle();

        Product product = new Product();
        product.setId(tcin);
        product.setName(title);

        return product;
    }
}
