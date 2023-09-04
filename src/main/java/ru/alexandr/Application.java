package ru.alexandr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.alexandr.repository.UserRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext a = SpringApplication.run(Application.class, args);

        // just for test
//        a.getBean(UserRepository.class).createTempData();
    }
}
