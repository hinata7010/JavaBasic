package oop.stream.section2.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductStreamEx {
    public static void main(String[] args) {

        //1. 외부 반복자 fori를 이용하여 Product를 생성할때 제품번호 -> i값을 이용해서 만듬
        // 상품명 -> 상품명 + i, "SSG", 가격 random

        List<Product> productList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Random random = new Random();
            productList.add(new Product(i, "초코파이" + String.valueOf(i), "SSG", random.nextInt(10000)));
        }

        productList.stream().forEach(System.out::println);
    }
}
