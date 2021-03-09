package com.ipiecoles.java.java240;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

    @Bean
    public BitcoinService bitCoinService() {
        BitcoinService bitcoinService = new BitcoinService();
        bitcoinService.setWebPageManager(webPageManager());
        return bitcoinService;
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
