package me.fahimfarook.springfactoriesorder.autoconfig;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class EnableAutoConfigurationInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	static {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationInitializer -> load");
	}

	public EnableAutoConfigurationInitializer() {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationInitializer -> new");
	}

	@Override
	public void initialize(ConfigurableApplicationContext arg0) {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationInitializer -> initialize()");		
	}
}