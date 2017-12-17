# Order of beans defined in spring.factories

## Conclustions

I've made following conclusions on bean constrcutions order. The spring.factoris elements are processed in the following order.

1. ApplicationListeners
2. EnvironmentPostProcessor
2. BootstrapConfigurations 
3. EnableAutoConfiguration

- `BootstrapConfigurations` are loaded by one of ApplicationListeners only i.e. `BootstrapApplicationListener`
- `EnvironmentPostProcessor#postProcessEnvironment` is invoked before any `BootstrapConfiguration` `@Beans` are constrcuted.
- `BeanFactoryPostProcessors`, `ApplicationListeners` and `ApplicationInitilizers` can be configured as either BootstrapConfigurations or EnableAutoConfiguration in spring.factories -- OR -- defind as @Beans in @Configuration class (which is either BootstrapConfiguration or EnableAutoConfiguration in spring.factories). In either case
   - spring.factories beans constructed befor @Beans in @Configuration
   - `BeanFactoryPostProcessor#postProcessBeanFactory()` is run before constrcuting the other beans
   - `ApplicationInitilizer#initalize()` is invoked after creating all the beans in @Configuration


## Results

```
me.fahimfarook.springfactoriesorder.listener.ApplicationListener -> load
me.fahimfarook.springfactoriesorder.listener.ApplicationListener -> new
me.fahimfarook.springfactoriesorder.listener.ApplicationListener -> new

me.fahimfarook.springfactoriesorder.envpp.EnvironmentPostProcessor -> load
me.fahimfarook.springfactoriesorder.envpp.EnvironmentPostProcessor -> new
me.fahimfarook.springfactoriesorder.envpp.EnvironmentPostProcessor -> postProcessEnvironment

me.fahimfarook.springfactoriesorder.listener.ApplicationListener -> onApplicationEvent()


me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfiguration -> load
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBFPP -> load
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBFPP -> new
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBFPPBean -> load
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBFPPBean -> new
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBFPP -> postProcessBeanFactory()
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBFPPBean -> postProcessBeanFactory()


me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfiguration -> new
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationInitalizer -> load
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationInitalizer -> new
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationListener -> load
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationListener -> new
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBean -> load
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBean -> new
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationInitalizerBean -> load
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationInitalizerBean -> new
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationListenerBean -> load
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationListenerBean -> new
me.fahimfarook.springfactoriesorder.envpp.EnvironmentPostProcessor -> new
me.fahimfarook.springfactoriesorder.envpp.EnvironmentPostProcessor -> postProcessEnvironment
me.fahimfarook.springfactoriesorder.listener.ApplicationListener -> onApplicationEvent()


me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationInitalizer -> initialize()
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationInitalizerBean -> initialize()


me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfiguration -> load


me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBFPPBean -> new
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBFPPBean -> load
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBFPPBean -> new
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBFPP -> load
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBFPP -> new
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBFPPBean -> postProcessBeanFactory()
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBFPPBean -> postProcessBeanFactory()
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBFPP -> postProcessBeanFactory()


me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfiguration -> new
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationBean -> new
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationInitalizerBean -> new
me.fahimfarook.springfactoriesorder.bootstrap.BootstrapConfigurationListenerBean -> new


me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfiguration -> new
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBean -> load
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationBean -> new
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationInitalizerBean -> load
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationInitalizerBean -> new
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationListenerBean -> load
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationListenerBean -> new
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationInitializer -> load
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationInitializer -> new
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationListener -> load
me.fahimfarook.springfactoriesorder.autoconfig.EnableAutoConfigurationListener -> new
```
