package me.fahimfarook.springfactoriesorder.listener;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;

public class ApplicationListener implements org.springframework.context.ApplicationListener<ApplicationEnvironmentPreparedEvent> {
	static {
		System.out.println("me.fahimfarook.springfactoriesorder.listener.ApplicationListener -> load");
	}

	public ApplicationListener() {
		System.out.println("me.fahimfarook.springfactoriesorder.listener.ApplicationListener -> new");
	}

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent arg0) {
		System.out.println("me.fahimfarook.springfactoriesorder.listener.ApplicationListener -> onApplicationEvent()");		
	}
}
