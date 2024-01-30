package com.brianeno.injectmap.service;

import com.brianeno.injectmap.util.ServiceConstants;
import org.springframework.stereotype.Service;

@Service(ServiceConstants.TYPEC)
public class TypeCService extends BaseService {

    @Override
    public String printAndGetGreeting(String value) {
        String message = "From service type C: " + value;
        print(message);
        return message;
    }
}
