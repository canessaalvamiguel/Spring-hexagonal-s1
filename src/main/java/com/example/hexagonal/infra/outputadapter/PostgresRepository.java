package com.example.hexagonal.infra.outputadapter;

import com.example.hexagonal.infra.outputport.EntityRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostgresRepository implements EntityRepository {
    @Override
    public <T> T save(T reg) {
        return null;
    }

    @Override
    public <T> T getById(String id, Class<T> clazz) {
        return null;
    }

    @Override
    public <T> List<T> getAll(Class<T> clazz) {
        return null;
    }
}
