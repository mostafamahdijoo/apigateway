package com.apigateway.web.service.impl;

import com.apigateway.web.dto.ProductDto;
import com.apigateway.web.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Override
    public List<ProductDto> getListOfProducts() {
        // 1) get the id of the requesting user either based on the session or jwt token
        // 2) get the list of visible products to the user by its id from Review micro service
        // 3) get the list of visible products price from Enquiry micro service
        // 4) aggregate result of step 2 and 3 and prepare final list of ProductDto
        // Note: in case of time out in either of steps 2 or 3 we can decide to deliver partial results or none.
        return null;
    }
}
