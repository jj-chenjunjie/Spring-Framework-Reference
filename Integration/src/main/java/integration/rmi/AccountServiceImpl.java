package integration.rmi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
	
	private static List<Account> ACCOUTS = new ArrayList<>();
	
	@Override
	public void insertAccout(Account account) {
		System.out.println("AccountServiceImpl.insertAccout()");
		ACCOUTS.add(account);
	}

	@Override
	public List<Account> getAccouts(String name) {
		System.out.println("AccountServiceImpl.getAccouts()");
		return ACCOUTS;
	}

}
