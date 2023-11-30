package com.ohgiraffers.section02.initdestroy.subsection02.annotation;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        ShoppingCart car1 = context.getBean("cart", ShoppingCart.class);
        car1.addItem(carpBread);
        car1.addItem(milk);

        System.out.println("car1 에 담긴 내용 : " + car1.getItems());

        ShoppingCart car2 = context.getBean("cart",ShoppingCart.class);
        car2.addItem(water);
        System.out.println("car2 에 담긴 내용 : " + car2.getItems());

        ((AnnotationConfigApplicationContext) context).close();
    }
}
