package app;

import config.AppConfig;
import engine.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vehicle.Vehicle;

public class App {
    public static void main(String[] args) {
        xmlConfig();
        annoConfig();
        javaConfig();
    }

    static void javaConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.EngineConfig.class);

        Engine engine = context.getBean("super-engine", Engine.class);
        System.out.println(engine);
    }

    static void annoConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.VehicleComponentScan.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle);
    }

    static void xmlConfig() {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

        Vehicle vehicle = context.getBean(Vehicle.class);
        Engine engine = context.getBean("small-engine", Engine.class);

        System.out.println(vehicle);
        System.out.println(engine);
    }
}
