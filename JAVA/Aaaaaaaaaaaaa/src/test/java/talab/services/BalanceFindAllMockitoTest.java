package talab.services;

import org.junit.Assert;
import org.junit.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import talab.dao.BalanceDao;
import talab.entities.Balance;

public class BalanceFindAllMockitoTest {
	Balance balance1 = new Balance(1, 1, 20, "2016-08-24 20:22:12");
	Balance balance2 = new Balance(2, 2, 701, "2016-08-24 21:39:13");
	Balance balance3 = new Balance(3, 3, 500, "2016-08-24 23:39:13");
	Balance balance4 = new Balance(4, 4, 100, "2016-08-24 23:41:15");
	Balance balance5 = new Balance(5, 5, 11, "2016-08-24 23:47:18");
	
	
	@Test
	public void TestBalanceFinAll() throws ClassNotFoundException, IOException, SQLException{
		BalanceService service = new BalanceService();
		BalanceDao dao = mock(BalanceDao.class);
		
		when(dao.findAll()).thenReturn(Arrays.asList(balance1, balance2, balance3, balance4, balance5));
		List<Balance> actual = service.getBalance();
		
		Assert.assertEquals(Arrays.asList(balance1, balance2, balance3, balance4, balance5), actual);

	}

}
