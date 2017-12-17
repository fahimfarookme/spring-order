package me.fahimfarook.springfactoriesorder.autoconfig;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class EnableAutoConfigurationListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
	static {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationListener -> load");
	}

	public EnableAutoConfigurationListener() {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationListener -> new");
	}

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent arg0) {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationListener -> onApplicationEvent()");		
	}
}
