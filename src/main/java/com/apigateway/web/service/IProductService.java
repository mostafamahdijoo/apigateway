package com.apigateway.web.service;

import com.apigateway.web.dto.ProductDto;

import java.util.List;

public interface IProductService {
    List<ProductDto> getListOfProducts();
}
