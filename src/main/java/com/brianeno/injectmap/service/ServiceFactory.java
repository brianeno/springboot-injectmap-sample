package com.brianeno.injectmap.service;

import com.brianeno.injectmap.util.ServiceConstants;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServiceFactory {

    private final TypeAService typeAService;
    private final TypeBService typeBService;
    private final TypeCService typeCService;

    public BaseService getService(final String serviceName) {
        if (ServiceConstants.TYPEA.equalsIgnoreCase(serviceName)) {
            return typeAService;
        } else if (ServiceConstants.TYPEB.equalsIgnoreCase(serviceName)) {
            return typeBService;
        } else {
            return typeCService;
        }
    }
}
