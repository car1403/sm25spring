package edu.sm.repository;

import edu.sm.dto.Cart;
import edu.sm.frame.SmRepository;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CartRepository extends SmRepository<Cart, Cart> {

}
