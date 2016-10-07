package talab.controller;

import talab.entities.Goods;
import talab.service.GoodsService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vladyslav_Shkola on 10/7/2016.
 */
public class Runner {
    GoodsService service = GoodsService.getInstance();

    public Runner() throws ClassNotFoundException {
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
        new Runner().doServiceDiscountCall("100", "10");

    }

    public void doServiceDiscountCall(String price, String discount) throws IOException, SQLException {
        int priceVal = Integer.parseInt(price);
        int discountVal = Integer.parseInt(discount);
        if(discountVal<0 || discountVal>=100){
            throw new IllegalArgumentException();
        }
        List<Goods> goods = service.getGoodsWithDiscount(priceVal, discountVal);
        System.out.println(goods);
    }
}
