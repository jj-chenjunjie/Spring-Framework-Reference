package integration.test.rmi;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import integration.rmi.Account;
import integration.rmi.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=RmiClient.class)
@Configuration
@ComponentScan(basePackages="integration.rmi")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RmiClient {
	
	@Autowired
	@Qualifier("myAccountService")
	private AccountService accountService;
	
	@Test
	public void testAInsertAcount() throws Exception {
		accountService.insertAccout(new Account("Jason"));
		assertEquals("Jason", accountService.getAccouts("").get(0).getName());
	}
	
//	@Test
	public void testBGetAccouts() {
		List<Account> accouts = accountService.getAccouts("");
		assertEquals("accouts number", 1, accouts.size());
	}
	
	@Test
	public void testC() {
		accountService.getAccouts("").get(0).setName("Mcc");
		assertEquals("Mcc", accountService.getAccouts("").get(0).getName());
	}
	
	@Bean(name="myAccountService")
	public RmiProxyFactoryBean rmiProxyFactoryBean() {
		RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
		rmiProxyFactoryBean.setServiceUrl("rmi://192.168.1.132:1199/AccountService");
		rmiProxyFactoryBean.setServiceInterface(AccountService.class);
		return rmiProxyFactoryBean;
	}
}
