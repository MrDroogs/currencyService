package com.swifttech.currencyservice.service.impl;

import com.swifttech.currencyservice.entity.ExchangeEntity;
import com.swifttech.currencyservice.mapper.ExchangeMapper;
import com.swifttech.currencyservice.payload.request.CurrencyRequest;
import com.swifttech.currencyservice.payload.response.CurrencyResponse;
import com.swifttech.currencyservice.repository.ExchangeRepo;
import com.swifttech.currencyservice.service.ExchangeRateService;
import com.swifttech.currencyservice.util.ApiConnector;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;




@Service
@RequiredArgsConstructor
public class CurrencyExchangeService implements ExchangeRateService {
    private final ExchangeRepo exchangeRepo;
    private final ApiConnector apiConnector;


    @Override
    public void exchangeMoney(CurrencyRequest currencyRequest) {

        CurrencyResponse apiResponse = apiConnector.getCurrency(currencyRequest);
        ExchangeEntity exchangeEntity= ExchangeMapper.Instance.toEntity(currencyRequest);
        exchangeEntity.setRate(apiResponse.getAmount());
      exchangeRepo.save(exchangeEntity);

    }


}

