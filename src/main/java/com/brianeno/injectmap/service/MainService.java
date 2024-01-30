package com.brianeno.injectmap.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
public class MainService {

    //This map gets auto-injected with entries by Spring
    private final Map<String, BaseService> serviceMap;

    public BaseService getService(final String serviceName) {

        return serviceMap.get(serviceName.toLowerCase());
    }
}
