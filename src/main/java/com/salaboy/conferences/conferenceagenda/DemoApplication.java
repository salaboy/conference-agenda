package com.salaboy.conferences.conferenceagenda;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Value("${version:0}")
    private String version;

    @GetMapping
    public String helloAgendaWithVersion() {
        return "AGENDA v" + version;
    }

}
