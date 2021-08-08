package com.example.webcafe.config;

import com.example.webcafe.repositories.WebCafeRepository;
import com.example.webcafe.repositories.impl.WebCafeRepositotyImpl;
import org.apache.logging.log4j.util.Supplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.time.temporal.ChronoUnit;


@Configuration
public class AppConfig {


    @Bean
    public Supplier<Instant> instantSupplier() {
        return () -> Instant
                .now()
                .minus(2l, ChronoUnit.DAYS);
    }


    @Bean
    public String hellostring(Supplier<Instant> instantSupplier) {

        return "Welcome to the webcafe" + instantSupplier.get();
    }

    /*@Bean
    public WebCafeRepository webCafeRepository() {
        return new WebCafeRepositotyImpl();
    }*/

      /*  @Bean
        public Instant time() {
            return Instant
                    .now()
                    .minus(2l, ChronoUnit.HOURS);
        }

        @Bean
        public String hellostring(Instant instant) {

            return "Welcome to the webcafe" + instant;
        }*/
}
