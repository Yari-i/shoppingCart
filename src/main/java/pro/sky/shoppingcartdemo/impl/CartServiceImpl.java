package pro.sky.shoppingcartdemo.impl;

import org.springframework.stereotype.Service;
import pro.sky.shoppingcartdemo.model.ShoppingCart;
import pro.sky.shoppingcartdemo.service.CartService;


import java.util.List;
import java.util.Set;

@Service
public class CartServiceImpl implements CartService {

    private final ShoppingCart shoppingCart;

    public CartServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public String add(List<Integer> goods) {
        shoppingCart.add(goods);
        return "Товары добавлены";
    }



//    @Override
//    public Set<Integer> add(List<Integer> goods) {
//        return shoppingCart.add(goods);
//    }

    @Override
    public Set<Integer> get() {
        return shoppingCart.get();
    }
}
