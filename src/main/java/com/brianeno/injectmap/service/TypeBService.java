package com.brianeno.injectmap.service;

import com.brianeno.injectmap.util.ServiceConstants;
import org.springframework.stereotype.Service;

@Service(ServiceConstants.TYPEB)
public class TypeBService extends BaseService {

    @Override
    public String printAndGetGreeting(String value) {
        String message = "From service type B: " + value;
        print(message);
        return message;
    }
}
