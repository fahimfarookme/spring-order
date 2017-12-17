package me.fahimfarook.springfactoriesorder.envpp;

import org.springframework.boot.SpringApplication;
import org.springframework.core.env.ConfigurableEnvironment;

public class EnvironmentPostProcessor implements org.springframework.boot.env.EnvironmentPostProcessor {

	static {
		System.out.println("me.fahimfarook.springfactoriesorder.envpp.EnvironmentPostProcessor -> load");
	}
	
	public EnvironmentPostProcessor() {
		System.out.println("me.fahimfarook.springfactoriesorder.envpp.EnvironmentPostProcessor -> new");
	}
	
	@Override
	public void postProcessEnvironment(final ConfigurableEnvironment environment, final SpringApplication application) {
		System.out.println("me.fahimfarook.springfactoriesorder.envpp.EnvironmentPostProcessor -> postProcessEnvironment");
	}

}