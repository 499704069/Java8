package com.my.java8;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/15 14:48
 */
public class PricePredicate implements MyPredicate<Product>{

    private final static int FILTER_PRICE = 1000;
    @Override
    public boolean test(Product product) {
        return product.getPrice() > FILTER_PRICE;
    }
}
