package integration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import integration.rmi.AccountService;

@Configuration
@ComponentScan("integration.rmi")
public class RmiStarter {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(RmiStarter.class);
	}
	
	@Bean
	public RmiServiceExporter rmiServiceExporter(AccountService accountService) {
		RmiServiceExporter exporter = new RmiServiceExporter();
		exporter.setServiceName("AccountService");
		exporter.setService(accountService);
		exporter.setServiceInterface(AccountService.class);
		exporter.setRegistryPort(1199);
		return exporter;
	}
}
