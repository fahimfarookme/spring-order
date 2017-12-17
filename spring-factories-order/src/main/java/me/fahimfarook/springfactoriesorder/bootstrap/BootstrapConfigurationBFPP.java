package me.fahimfarook.springfactoriesorder.bootstrap;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BootstrapConfigurationBFPP implements BeanFactoryPostProcessor {
	static {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBFPP -> load");
	}

	public BootstrapConfigurationBFPP() {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBFPP -> new");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBFPP -> postProcessBeanFactory()");		
	}
}