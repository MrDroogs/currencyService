package com.swifttech.currencyservice.mapper;

import com.swifttech.currencyservice.entity.ExchangeEntity;
import com.swifttech.currencyservice.payload.request.CurrencyRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExchangeMapper {
    ExchangeMapper Instance = Mappers.getMapper(ExchangeMapper.class);


    ExchangeEntity toEntity(CurrencyRequest currencyRequest);
    CurrencyRequest toDto(ExchangeEntity exchangeEntity);

}
