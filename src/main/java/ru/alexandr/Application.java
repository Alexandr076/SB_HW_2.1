package ru.alexandr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import ru.alexandr.handlerMethodArgumentResolver.UserHandlerMethodArgumentResolver;

import java.util.List;


@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new UserHandlerMethodArgumentResolver());
    }

    public static void main(String[] args) {
        ApplicationContext a = SpringApplication.run(Application.class, args);

        // just for test
//        a.getBean(UserRepository.class).createTempData();
    }
}
