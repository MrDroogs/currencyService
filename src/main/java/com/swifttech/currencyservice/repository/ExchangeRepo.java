package com.swifttech.currencyservice.repository;

import com.swifttech.currencyservice.entity.ExchangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ExchangeRepo extends JpaRepository<ExchangeEntity, UUID> {
}
