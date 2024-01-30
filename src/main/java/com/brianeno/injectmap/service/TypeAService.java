package com.brianeno.injectmap.service;

import com.brianeno.injectmap.util.ServiceConstants;
import org.springframework.stereotype.Service;

@Service(ServiceConstants.TYPEA)
public class TypeAService extends BaseService {

    @Override
    public String printAndGetGreeting(String value) {
        String message = "From service type A: " + value;
        print(message);
        return message;
    }
}
