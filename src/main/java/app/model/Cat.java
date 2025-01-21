package app.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cat")
@Primary
public class Cat extends Animal {
    @Override
    public String toString() {
        return "Im a Cat";
    }
}
