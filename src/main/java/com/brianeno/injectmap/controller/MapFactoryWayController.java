package com.brianeno.injectmap.controller;

import com.brianeno.injectmap.service.BaseService;
import com.brianeno.injectmap.service.ServiceFactory;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/old/map")
@AllArgsConstructor
public class MapFactoryWayController {

    private final ServiceFactory serviceFactory;

    @GetMapping({"", "/"})
    public ResponseEntity<String> getServiceGreetingFactory(@RequestParam String service,
                                                            @RequestParam String message) {
        try {
            BaseService serviceInstance = serviceFactory.getService(service);

            return new ResponseEntity<>(serviceInstance.printAndGetGreeting(message), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
