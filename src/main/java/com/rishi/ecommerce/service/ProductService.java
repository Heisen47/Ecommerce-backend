package com.rishi.ecommerce.service;

import com.rishi.ecommerce.exception.ProductException;
import com.rishi.ecommerce.model.Product;
import com.rishi.ecommerce.request.CreateProductRequest;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    public Product createProduct(CreateProductRequest req);

    public String deleteProduct(Long productId) throws ProductException;

    public Product updateProduct(Long productId , Product req) throws ProductException;

    public List<Product> getAllProducts();

    public Product findProductById(Long id) throws ProductException;

    public List<Product> findProductByCategory(String category);

    public List<Product> searchProduct(String query);

    public Page<Product> getAllProduct(String category , List<String> colors,List<String> sizes, Integer minPrice , Integer maxPrice
    ,Integer minDiscount , String sort ,String stock , Integer pageNumber , Integer pageSize);

    public List<Product> recentlyAddedProduct();

}
