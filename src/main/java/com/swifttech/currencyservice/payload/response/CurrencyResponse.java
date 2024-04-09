package com.swifttech.currencyservice.payload.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class CurrencyResponse {
    private String terms;
    private String privacy;
    private String from;
    private double amount;
    private String timestamp;
    private List<ConversionRate> conversionRate=new ArrayList<>();



}
