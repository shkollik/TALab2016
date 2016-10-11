package talab.controller;

import talab.entities.Balance;
import talab.services.BalanceService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vladyslav_Shkola on 10/11/2016.
 */
public class OldController {
    BalanceService service = BalanceService.getInstance();

    public OldController() throws ClassNotFoundException {
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
        // TODO Auto-generated method stub
        new OldController().doServiceBalanceBonus("450","10");

    }

    public List<Balance> doServiceBalanceBonus(String amount , String bonus) throws IOException, SQLException {
        int amountVal = Integer.parseInt(amount);
        int bonusVal = Integer.parseInt(bonus);
        if ( bonusVal<0 || bonusVal>=100 )
            throw new IllegalArgumentException();
        List<Balance> balance = service.getBalanceWithBonus(amountVal, bonusVal);
        //System.out.println(balance);
        return balance;

    }

}
