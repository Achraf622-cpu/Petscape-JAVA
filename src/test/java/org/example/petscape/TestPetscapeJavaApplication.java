package org.example.petscape;

import org.springframework.boot.SpringApplication;

public class TestPetscapeJavaApplication {

    public static void main(String[] args) {
        SpringApplication.from(PetscapeJavaApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
