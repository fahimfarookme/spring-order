package me.fahimfarook.springfactoriesorder.bootstrap;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BootstrapConfiguration {

	static {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfiguration -> load");
	}

	public BootstrapConfiguration() {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfiguration -> new");
	}

	@Bean
	public BootstrapConfigurationBean getBootstrapBean() {
		return new BootstrapConfigurationBean();
	}

	@Bean
	public BootstrapConfigurationInitalizerBean getBootstrapConfigurationInitalizerBean() {
		return new BootstrapConfigurationInitalizerBean();
	}
	
	@Bean
	public BootstrapConfigurationListenerBean getBootstrapConfigurationListenerBean() {
		return new BootstrapConfigurationListenerBean();
	}
	
	@Bean
	public static BootstrapConfigurationBFPPBean getBootstrapConfigurationBFPPBean() {
		return new BootstrapConfigurationBFPPBean();
	}
}

class BootstrapConfigurationBean {
	static {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBean -> load");
	}

	public BootstrapConfigurationBean() {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBean -> new");
	}
}

class BootstrapConfigurationInitalizerBean implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	static {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationInitalizerBean -> load");
	}

	public BootstrapConfigurationInitalizerBean() {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationInitalizerBean -> new");
	}

	@Override
	public void initialize(ConfigurableApplicationContext arg0) {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationInitalizerBean -> initialize()");		
	}
}

class BootstrapConfigurationListenerBean implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
	static {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationListenerBean -> load");
	}

	public BootstrapConfigurationListenerBean() {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationListenerBean -> new");
	}

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent arg0) {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationListenerBean -> onApplicationEvent()");		
	}
}

class BootstrapConfigurationBFPPBean implements BeanFactoryPostProcessor {
	static {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBFPPBean -> load");
	}

	public BootstrapConfigurationBFPPBean() {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBFPPBean -> new");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBFPPBean -> postProcessBeanFactory()");		
	}
}
