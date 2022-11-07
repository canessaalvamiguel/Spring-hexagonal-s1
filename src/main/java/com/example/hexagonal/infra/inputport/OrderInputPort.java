package com.example.hexagonal.infra.inputport;

import com.example.hexagonal.domain.Orders;

import java.math.BigDecimal;

public interface OrderInputPort {
    public Orders createOrder(String customerId, BigDecimal total );
}
