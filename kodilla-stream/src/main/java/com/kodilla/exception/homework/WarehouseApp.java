package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("34"));
        warehouse.addOrder(new Order("32"));
        warehouse.addOrder(new Order("76"));
        warehouse.addOrder(new Order("90"));

        warehouse.getOrder("34");
        warehouse.getOrder("32");

    }
}