package pro.sky.shoppingcartdemo.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface CartService {

    String add(List<Integer> goods);

//    Set<Integer> add(List<Integer> goods);

    Set<Integer> get();
}
