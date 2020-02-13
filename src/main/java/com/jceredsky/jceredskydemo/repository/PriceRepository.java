package com.jceredsky.jceredskydemo.repository;

import com.jceredsky.jceredskydemo.domain.RedisPrice;
import org.springframework.data.repository.CrudRepository;

public interface PriceRepository extends CrudRepository<RedisPrice, String> {
}
