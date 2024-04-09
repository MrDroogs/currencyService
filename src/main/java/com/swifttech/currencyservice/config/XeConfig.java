package com.swifttech.currencyservice.config;

import lombok.Getter;
import lombok.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class XeConfig {

    private   String apiKey;

    public XeConfig(){
        this.apiKey="7pu3usa80btekv8jb661d7pcek";
    }

}
