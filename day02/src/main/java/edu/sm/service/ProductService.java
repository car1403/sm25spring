package edu.sm.service;

import edu.sm.dto.Cust;
import edu.sm.dto.Product;
import edu.sm.frame.SmService;
import edu.sm.repository.CustRepository;
import edu.sm.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements SmService<Product, Integer> {

    final ProductRepository  productRepository;

    @Override
    public void register(Product product) throws Exception {
        productRepository.insert(product);
    }

    @Override
    public void modify(Product product) throws Exception {
        productRepository.update(product);
    }

    @Override
    public void remove(Integer s) throws Exception {
        productRepository.delete(s);
    }

    @Override
    public List<Product> get() throws Exception {
        return productRepository.selectAll();
    }

    @Override
    public Product get(Integer s) throws Exception {
        return productRepository.select(s);
    }
}
