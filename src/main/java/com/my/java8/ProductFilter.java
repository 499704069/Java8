package com.my.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/15 14:42
 */
public class ProductFilter {

    private static List<Product> filterProductByPredicate(List<Product> lists,
                                                          MyPredicate<Product> predicate){

        List<Product> results = new ArrayList<>();
        for (Product list : lists) {
            if(predicate.test(list)){
                results.add(list);
            }
        }
        return results;
    }

    public static void main(String[] args) {


    }
}
