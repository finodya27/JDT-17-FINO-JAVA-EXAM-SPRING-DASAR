package com.indivaragroup.spring.basic.configchallenge.runner;

import com.indivaragroup.spring.basic.configchallenge.service.GreetingMessageService;
import com.indivaragroup.spring.basic.configchallenge.service.ResourceReaderService;
import com.indivaragroup.spring.basic.configchallenge.service.StoreInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@RequiredArgsConstructor
public class AppRunner implements CommandLineRunner {

    private final StoreInfoService storeInfoService;
    private final ResourceReaderService resourceReaderService;
    private final GreetingMessageService greetingMessageService;

    @Override
    public void run(String[] args) {
        System.out.println(resourceReaderService.readBanner());
        System.out.println();

        storeInfoService.printStoreInfo();
        System.out.println();

        System.out.println("[EN]");
        System.out.println(greetingMessageService.getGreeting(Locale.ENGLISH));
        System.out.println(greetingMessageService.getStatus(Locale.ENGLISH));
        System.out.println();

        System.out.println("[ID]");
        Locale indonesia = new Locale("id", "ID");
        System.out.println(greetingMessageService.getGreeting(indonesia));
        System.out.println(greetingMessageService.getStatus(indonesia));
    }
}