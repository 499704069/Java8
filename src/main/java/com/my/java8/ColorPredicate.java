package com.my.java8;


/**
 * @author zy
 * @version 1.0
 * @date 2021/1/15 14:40
 */
public class ColorPredicate implements MyPredicate<Product> {


    @Override
    public boolean test(Product product) {
        return product.getName().equals("red");
    }
}
