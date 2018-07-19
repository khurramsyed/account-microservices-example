package org.khurramsyed.applicationservice.controller;


import org.khurramsyed.applicationservice.domain.Application;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping(value = "/application/{id}")
    public ResponseEntity<Application> findApplication(@PathVariable String id){
        return new ResponseEntity<Application>( new Application(), HttpStatus.OK);
    }
}
