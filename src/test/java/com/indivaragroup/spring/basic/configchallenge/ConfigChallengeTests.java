package com.indivaragroup.spring.basic.configchallenge;

import com.indivaragroup.spring.basic.configchallenge.config.StoreProperties;
import com.indivaragroup.spring.basic.configchallenge.service.GreetingMessageService;
import com.indivaragroup.spring.basic.configchallenge.service.ResourceReaderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ConfigChallengeTests {

    @Autowired
    private StoreProperties storeProperties;

    @Autowired
    private ResourceReaderService resourceReaderService;

    @Autowired
    private GreetingMessageService greetingMessageService;

    @Test
    void testStoreProperties() {
        assertEquals("Indivara Mini Store", storeProperties.getName());
        assertEquals("Jakarta", storeProperties.getCity());
        assertEquals("IDR", storeProperties.getCurrency());
        assertEquals(100, storeProperties.getMaxDailyOrder());
        assertTrue(storeProperties.getActive());
    }

    @Test
    void testReadBanner() {
        String banner = resourceReaderService.readBanner();
        assertNotNull(banner);
        assertTrue(banner.contains("Powered by Spring Boot"));
    }

    @Test
    void testGreetingEnglish() {
        String message = greetingMessageService.getGreeting(Locale.ENGLISH);
        assertEquals("Welcome to Indivara Mini Store located in Jakarta", message);
    }

    @Test
    void testStatusEnglish() {
        String message = greetingMessageService.getStatus(Locale.ENGLISH);
        assertEquals("Store is currently active", message);
    }

    @Test
    void testGreetingIndonesia() {
        String message = greetingMessageService.getGreeting(new Locale("id", "ID"));
        assertEquals("Selamat datang di Indivara Mini Store yang berlokasi di Jakarta", message);
    }

    @Test
    void testStatusIndonesia() {
        String message = greetingMessageService.getStatus(new Locale("id", "ID"));
        assertEquals("Toko sedang aktif", message);
    }
}