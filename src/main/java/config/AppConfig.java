package config;

import engine.Engine;
import engine.SuperEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class AppConfig {

    @ComponentScan(basePackages = "vehicle")
    public static class VehicleComponentScan {
    }

    @Configuration
    public static class EngineConfig {
        @Bean("super-engine")
        public Engine engine() {
            return new SuperEngine();
        }
    }

}
