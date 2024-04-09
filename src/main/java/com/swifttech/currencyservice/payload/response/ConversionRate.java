package com.swifttech.currencyservice.payload.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ConversionRate {
    private String quotecurrency;
    private Double mid;
}
