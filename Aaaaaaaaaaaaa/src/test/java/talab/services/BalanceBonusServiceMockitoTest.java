package talab.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import talab.dao.BalanceDao;
import talab.entities.Balance;
import talab.services.BalanceService;

public class BalanceBonusServiceMockitoTest {
	private int minLimit = 450;	
	private int bonus = 10;
	Balance balance1 = new Balance(2, 2, 701, "2016-08-24 21:39:13");
	Balance balance2 = new Balance(3, 3, 500, "2016-08-24 23:39:13");
	Balance balance1WithBonus = new Balance(2, 2, 771, "2016-08-24 21:39:13");
	Balance balance2WithBonus = new Balance(3, 3, 550, "2016-08-24 23:39:13");
	
	@Test
	public void testBalanceBonusList() throws ClassNotFoundException, IOException, SQLException{
		BalanceService service = new BalanceService();
		BalanceDao dao = mock(BalanceDao.class);
		service.setDao(dao);
		when(dao.findByAmount(minLimit)).thenReturn(
				Arrays.asList(balance1, balance2));
		List<Balance> actual = service.getBalanceWithBonus(minLimit, bonus);
		assertEquals( Arrays.asList(balance1WithBonus, balance2WithBonus), actual);		
	}
}
