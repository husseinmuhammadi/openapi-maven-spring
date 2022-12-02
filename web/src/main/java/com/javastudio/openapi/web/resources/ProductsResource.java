package com.javastudio.openapi.web.resources;

import com.javastudio.openapi.web.generated.v1.v1.api.ProductsApi;
import com.javastudio.openapi.web.generated.v1.v1.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/api/v1")
public class ProductsResource implements ProductsApi {

    @Override
    public ResponseEntity<Void> findProducts(Locale locale) {
        return ProductsApi.super.findProducts(locale);
    }

    @Override
    public ResponseEntity<Void> saveProduct(Product product) {
        return ProductsApi.super.saveProduct(product);
    }
}
