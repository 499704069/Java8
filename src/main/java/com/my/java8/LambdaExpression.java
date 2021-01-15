package com.my.java8;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/15 11:08
 */
public class LambdaExpression {

    public static void main(String[] args) {


        Comparator<Integer> cpt = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1 , o2);
            }
        };

        Comparator<Integer> integerComparator = Integer::compare;

        TreeSet<Integer> treeSet = new TreeSet<>(integerComparator);
    }
}
