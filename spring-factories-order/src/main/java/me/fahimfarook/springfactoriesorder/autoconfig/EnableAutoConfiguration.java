package me.fahimfarook.springfactoriesorder.autoconfig;

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
public class EnableAutoConfiguration {

	static {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfiguration -> load");
	}

	public EnableAutoConfiguration() {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfiguration -> new");
	}

	@Bean
	public EnableAutoConfigurationBean getBean() {
		return new EnableAutoConfigurationBean();
	}
	
	@Bean
	public EnableAutoConfigurationInitalizerBean getEnableAutoConfigurationInitalizerBean() {
		return new EnableAutoConfigurationInitalizerBean();
	}
	
	@Bean
	public EnableAutoConfigurationListenerBean getEnableAutoConfigurationListenerBean() {
		return new EnableAutoConfigurationListenerBean();
	}
	
	@Bean
	public static EnableAutoConfigurationBFPPBean getEnableAutoConfigurationBFPPBean() {
		return new EnableAutoConfigurationBFPPBean();
	}

}

class EnableAutoConfigurationBean {
	static {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBean -> load");
	}

	public EnableAutoConfigurationBean() {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBean -> new");
	}
}

class EnableAutoConfigurationInitalizerBean implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	static {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationInitalizerBean -> load");
	}

	public EnableAutoConfigurationInitalizerBean() {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationInitalizerBean -> new");
	}

	@Override
	public void initialize(ConfigurableApplicationContext arg0) {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationInitalizerBean -> initialize()");		
	}
}

class EnableAutoConfigurationListenerBean implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
	static {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationListenerBean -> load");
	}

	public EnableAutoConfigurationListenerBean() {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationListenerBean -> new");
	}

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent arg0) {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationListenerBean -> onApplicationEvent()");		
	}
}

class EnableAutoConfigurationBFPPBean implements BeanFactoryPostProcessor {
	static {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBFPPBean -> load");
	}

	public EnableAutoConfigurationBFPPBean() {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBFPPBean -> new");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBFPPBean -> postProcessBeanFactory()");		
	}
}

