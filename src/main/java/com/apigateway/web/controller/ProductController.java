package com.apigateway.web.controller;

import com.apigateway.web.dto.ProductDto;
import com.apigateway.web.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    IProductService iProductService;

    @GetMapping("/getListOfProducts")
    public ResponseEntity<List<ProductDto>> getListOfProducts() {
        List<ProductDto> productDtoList = iProductService.getListOfProducts();
        return new ResponseEntity<>(productDtoList, HttpStatus.OK);
    }

}
