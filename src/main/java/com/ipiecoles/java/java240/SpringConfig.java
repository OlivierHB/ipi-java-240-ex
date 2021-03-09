package com.ipiecoles.java.java240;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

    @Bean
    @Scope(value = "singleton")
    public BitcoinService bitCoinService() {
        return new BitcoinService();
    }

    @Bean
    public WebPageManager webPageManager() {
        return new WebPageManager();
    }

    @Bean
    public ProduitManager produitManager() {
        ProduitManager pInjection = new ProduitManager();
        pInjection.setBitcoinService(bitCoinService());
        pInjection.setWebPageManager(webPageManager());
        return pInjection;
    }
}
