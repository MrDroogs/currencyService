package com.swifttech.currencyservice.controller;

import com.swifttech.currencyservice.payload.request.CurrencyRequest;
import com.swifttech.currencyservice.service.ExchangeRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/currency")
@RequiredArgsConstructor
public class CurrencyExchangeController {


    private final ExchangeRateService service;


    @PostMapping("/convert")
    public void convertCurrency(@RequestBody CurrencyRequest currencyRequest)  {
        service.exchangeMoney(currencyRequest);


    }
}

