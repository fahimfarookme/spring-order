package me.fahimfarook.springfactoriesorder.bootstrap;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class BootstrapConfigurationListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
	static {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationListener -> load");
	}

	public BootstrapConfigurationListener() {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationListener -> new");
	}

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent arg0) {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationListener -> onApplicationEvent()");		
	}
}
