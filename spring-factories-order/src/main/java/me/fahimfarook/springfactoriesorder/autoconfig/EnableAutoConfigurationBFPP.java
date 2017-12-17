package me.fahimfarook.springfactoriesorder.autoconfig;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class EnableAutoConfigurationBFPP implements BeanFactoryPostProcessor {
	static {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBFPP -> load");
	}

	public EnableAutoConfigurationBFPP() {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBFPP -> new");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBFPP -> postProcessBeanFactory()");		
	}
}