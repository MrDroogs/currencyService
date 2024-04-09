package com.swifttech.currencyservice.core.base;



import com.swifttech.currencyservice.core.records.CodeRecord;
import org.springframework.stereotype.Component;

@FunctionalInterface
@Component
public interface Codes {

    CodeRecord pick(String code);
}
