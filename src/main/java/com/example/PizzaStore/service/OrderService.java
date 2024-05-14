package com.example.PizzaStore.service;

import com.example.PizzaStore.controller.OrderController;
import com.example.PizzaStore.model.NewOrder;

import java.util.Properties;

public class OrderService {

    private static final Properties props = new Properties();

    public static void insertOrder(OrderController.NewOrder order){
        NewOrder newOrder = NewOrder.newBuilder()
                .setPizzaStyle(order.pizzaStyle())
                .setEmail(order.email())
                .setSize(order.size())
                .build();

    }
}
