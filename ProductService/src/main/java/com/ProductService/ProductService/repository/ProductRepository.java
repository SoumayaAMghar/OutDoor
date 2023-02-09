package com.ProductService.ProductService.repository;

import com.ProductService.ProductService.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {

}
