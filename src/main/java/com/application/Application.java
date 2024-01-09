package com.application;

//import com.application.User.Services.UserService;
//import com.application.User.Entities.User;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;

//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

//TODO: Mirar Posicionamiento de Notifications + LineAwesomeIcon
/**
 * The entry point of the Spring Boot application.
 *
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 *
 */
@EnableWebSecurity
@SpringBootApplication

@Theme(value = "mytodo")
public class Application implements AppShellConfigurator {

    //@Autowired
    //private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**@Bean
    public CommandLineRunner  createAdminUser() {
        return (args) -> {
            try {
                userService.loadUserByUsername("admin");
            } catch (UsernameNotFoundException e) {
                User admin = new User();

                admin.setUsername("admin");
                admin.setEmail("admin@gmail.com");
                admin.setPassword("admin");
                ((UserService) userService).registerUser(admin);
            }
        };
    };
    **/

}
