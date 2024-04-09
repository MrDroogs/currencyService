package com.swifttech.currencyservice.payload.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrencyRequest {

 private double amount;
 private String fromCurrency;
 private String toCurrency;
}
