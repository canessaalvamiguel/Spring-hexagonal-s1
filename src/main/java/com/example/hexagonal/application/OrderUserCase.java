package com.example.hexagonal.application;

import com.example.hexagonal.domain.Orders;
import com.example.hexagonal.infra.inputport.OrderInputPort;
import com.example.hexagonal.infra.outputport.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class OrderUserCase implements OrderInputPort {

    @Autowired
    EntityRepository entityRepository;

    @Override
    public Orders createOrder(String customerId, BigDecimal total) {
        Orders order = Orders.builder()
                .id( UUID.randomUUID().toString() )
                .customerId( customerId )
                .total( total )
                .build();

        return entityRepository.save( order );
    }
}
