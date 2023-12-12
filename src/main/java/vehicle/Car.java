package vehicle;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Override
    public String toString() {
        return "Car{}";
    }
}
