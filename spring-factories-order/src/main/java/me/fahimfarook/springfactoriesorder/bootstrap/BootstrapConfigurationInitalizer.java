package me.fahimfarook.springfactoriesorder.bootstrap;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class BootstrapConfigurationInitalizer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	static {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationInitalizer -> load");
	}

	public BootstrapConfigurationInitalizer() {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationInitalizer -> new");
	}

	@Override
	public void initialize(ConfigurableApplicationContext arg0) {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationInitalizer -> initialize()");		
	}
}