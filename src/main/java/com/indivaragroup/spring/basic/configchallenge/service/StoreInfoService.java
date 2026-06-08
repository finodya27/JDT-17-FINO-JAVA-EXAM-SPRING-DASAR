package com.indivaragroup.spring.basic.configchallenge.service;

import com.indivaragroup.spring.basic.configchallenge.config.StoreProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreInfoService {

    private final StoreProperties storeProperties;

    public void printStoreInfo() {

        System.out.println("Store Name      : " + storeProperties.getName());
        System.out.println("Store City      : " + storeProperties.getCity());
        System.out.println("Currency        : " + storeProperties.getCurrency());
        System.out.println("Max Daily Order : " + storeProperties.getMaxDailyOrder());
        System.out.println("Active          : " + storeProperties.getActive());
    }
}