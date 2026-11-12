package com.tas.masterSecurity;

import com.tas.masterSecurity.entity.Role;
import com.tas.masterSecurity.entity.User;
import com.tas.masterSecurity.repositories.UserDetailsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Initializer {

    @Bean
    public CommandLineRunner createUser(UserDetailsRepository userDetailsRepository, PasswordEncoder passwordEncoder){
        return args -> {
            if(userDetailsRepository.findByUsername("admin").isEmpty()){
                User adminUser = new User();
                adminUser.setUsername("admin");
                adminUser.setPassword(passwordEncoder.encode("admin123"));
                adminUser.setRole(Role.ADMIN);

                userDetailsRepository.save(adminUser);
                System.out.println("Default admin user created");
            }

            if(userDetailsRepository.findByUsername("user").isEmpty()){
                User normalUser = new User();
                normalUser.setUsername("user");
                normalUser.setPassword(passwordEncoder.encode("user123"));
                normalUser.setRole(Role.USER);

                userDetailsRepository.save(normalUser);
                System.out.println("Default user created");
            }
        };
    }
}
