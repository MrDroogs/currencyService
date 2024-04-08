package com.swifttech.currencyservice.controller;

import com.swifttech.currencyservice.service.ExchangeRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/currency")
@RequiredArgsConstructor
public class ApiController {



        private final ExchangeRateService exchangeRateService;


        @GetMapping("/convert")
        public Mono<Double> convertCurrency(@RequestParam String from, @RequestParam String to, @RequestParam double amount) {
//            return currencyExchangeService.convertCurrency(from, to, amount);
        }
    }

}
