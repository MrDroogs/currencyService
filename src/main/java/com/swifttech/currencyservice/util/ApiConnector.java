package com.swifttech.currencyservice.util;

import com.swifttech.currencyservice.payload.request.CurrencyRequest;
import com.swifttech.currencyservice.payload.response.CurrencyResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@RequiredArgsConstructor
@Slf4j
@Component
public class ApiConnector {
    private final WebClient.Builder webClient;
//    private XeConfig xeConfig;


    public CurrencyResponse getCurrency(CurrencyRequest currencyRequest) {

        return webClient.build().get()
                .uri(uriBuilder -> uriBuilder
                        .scheme("https") // Specify the scheme
                        .host("xecdapi.xe.com") // Specify the host
                        .path("/v1/convert_from.json")
                        .queryParam("from", currencyRequest.getFromCurrency())
                        .queryParam("to", currencyRequest.getToCurrency())
                        .queryParam("amount", currencyRequest.getAmount())
                        .build())
                .headers(httpHeaders -> httpHeaders.setBasicAuth("swift548634552", "7pu3usa80btekv8jb661d7pcek"))
                .retrieve()
                .bodyToMono(CurrencyResponse.class)
                .block();

    }
}



