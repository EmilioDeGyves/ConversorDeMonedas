package com.emilio.conversor.modules;


import java.util.concurrent.ConcurrentHashMap;

public record Moneda(String base_code, ConcurrentHashMap<String, Float> conversion_rates) {
}
