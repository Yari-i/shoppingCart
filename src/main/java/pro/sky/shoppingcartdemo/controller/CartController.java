package pro.sky.shoppingcartdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shoppingcartdemo.service.CartService;

import java.util.List;
import java.util.Set;

@RequestMapping("/order")
@RestController
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping("/add")
    public String add(@RequestParam List<Integer> goods) {
        return cartService.add(goods);
    }

//    @GetMapping("/add")
//    public Set<Integer> add(@RequestParam List<Integer> goods) {
//        return cartService.add(goods);
//    }

    @GetMapping("/get")
    public Set<Integer> get() {
        return cartService.get();
    }
}
