package edu.sm.service;

import edu.sm.dto.Cart;
import edu.sm.frame.SmService;
import edu.sm.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CartService implements SmService<Cart, Cart> {

    final CartRepository cartRepository;

    @Override
    public void register(Cart cart) throws Exception {
        cartRepository.insert(cart);
    }

    @Override
    public void modify(Cart cart) throws Exception {
        cartRepository.update(cart);
    }

    @Override
    public void remove(Cart cart) throws Exception {
        cartRepository.delete(cart);
    }

    @Override
    public List<Cart> get() throws Exception {
        return cartRepository.selectAll();
    }

    @Override
    public Cart get(Cart cart) throws Exception {
        return null;
    }
}
