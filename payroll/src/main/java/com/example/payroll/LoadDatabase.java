package com.example.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository){
        return args -> {
          log.info("Preloading " + repository.save(new Employee("Bob Blecher", "Owner")));
          log.info("Preloading " + repository.save(new Employee("Stan Smith", "CIA Agent")));
        };
    }
}
