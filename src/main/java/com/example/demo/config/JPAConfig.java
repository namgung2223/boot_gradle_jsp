package com.example.demo.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JPAConfig {
    @PersistenceContext
    private EntityManager entityManager;
    @Bean
    JPAQueryFactory queryFactory(){
        return new JPAQueryFactory(entityManager);
    }
}
