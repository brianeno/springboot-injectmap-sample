package com.brianeno.injectmap.controller;

import com.brianeno.injectmap.service.BaseService;
import com.brianeno.injectmap.service.MainService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/map")
@AllArgsConstructor
public class MapController {

    private final MainService mainService;

    @GetMapping({"", "/"})
    public ResponseEntity<String> getServiceGreeting(@RequestParam(required = true) String service,
                                                     @RequestParam(required = true) String message) {
        try {
            BaseService serviceInstance = mainService.getService(service);

            return new ResponseEntity<>(serviceInstance.printAndGetGreeting(message), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
