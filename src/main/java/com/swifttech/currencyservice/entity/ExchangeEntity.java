package com.swifttech.currencyservice.entity;

import com.swifttech.currencyservice.core.base.entity.BaseAuditEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "exchange")
public class ExchangeEntity extends BaseAuditEntity {

    private String fromCurrency;
    private String toCurrency;
    private double amount;
    private double rate;
}
