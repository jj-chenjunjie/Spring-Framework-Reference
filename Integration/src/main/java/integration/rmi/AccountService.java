package integration.rmi;

import java.util.List;

public interface AccountService {
	void insertAccout(Account account);
	List<Account> getAccouts(String name);
}
