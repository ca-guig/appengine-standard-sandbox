package ca.guig.sandbox;

import org.springframework.boot.SpringApplication;

public final class Launcher {

    private Launcher() {}

    public static void main(String[] arguments) {
        SpringApplication application = new SpringApplication(Application.class);
        application.run(arguments);
    }

}
