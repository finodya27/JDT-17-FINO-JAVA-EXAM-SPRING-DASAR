package com.indivaragroup.spring.basic.configchallenge.service;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
@RequiredArgsConstructor
public class ResourceReaderService {

    private final ResourceLoader resourceLoader;

    public String readBanner() {
        Resource resource = resourceLoader.getResource("classpath:banner-store.txt");
        try {
            return new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}