package com.deployment.vaadin;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@PWA(name = "Project Base for Vaadin with Spring", shortName = "Project Base")
public class VaadinApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(VaadinApplication.class, args);
	}

}
