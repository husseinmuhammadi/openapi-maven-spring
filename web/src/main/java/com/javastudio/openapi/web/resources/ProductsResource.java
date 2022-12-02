package com.javastudio.openapi.web.resources;

import com.javastudio.openapi.web.generated.v1.v1.api.ProductsApi;
import com.javastudio.openapi.web.generated.v1.v1.model.InlineObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductsResource implements ProductsApi {
    @Override
    public ResponseEntity<Void> findProducts() {
        return ProductsApi.super.findProducts();
    }

    @Override
    public ResponseEntity<Void> saveProduct(InlineObject inlineObject) {
        return ProductsApi.super.saveProduct(inlineObject);
    }
}
