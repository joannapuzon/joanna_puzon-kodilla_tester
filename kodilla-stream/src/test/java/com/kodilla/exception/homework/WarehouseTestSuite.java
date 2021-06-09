package com.kodilla.exception.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WarehouseTestSuite {
    Order order1 = new Order("23");
    Order order2 = new Order("34");


    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        // given
        Warehouse.addOrder(order1);
        Warehouse.addOrder(order2);
        String isOrder = "34";
        Order orderExp = new Order(isOrder);
        Order orderActual = Warehouse.getOrder(isOrder);
        assertEquals(orderExp, orderActual);
    }

    @Test
    public void testGetOrder_withException() throws OrderDoesntExistException {
        // given
        Warehouse.addOrder(order1);
        Warehouse.addOrder(order2);

        String isNotOrder = "46";

        OrderDoesntExistException exeption = assertThrows(OrderDoesntExistException.class, () -> Warehouse.getOrder(isNotOrder));
        assertEquals("Order Does Not Exist", exeption.getMessage());
    }
}