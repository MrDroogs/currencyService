package com.swifttech.currencyservice.service;

import com.swifttech.currencyservice.core.model.Response;
import com.swifttech.currencyservice.payload.request.CurrencyRequest;

public interface ExchangeRateService {

 public void exchangeMoney(CurrencyRequest currencyRequest);

}
