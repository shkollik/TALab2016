package talab.controller;

import org.junit.Before;
import org.junit.Test;
import talab.service.GoodsService;

import java.io.IOException;
import java.sql.SQLException;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

/**
 * Created by Vladyslav_Shkola on 10/7/2016.
 */
public class TestController {
    private Runner controller;
    private GoodsService service;

    @Before
    public void init() throws ClassNotFoundException {
        service = mock(GoodsService.class);
        controller = new Runner();
        controller.service = service;
    }

    @Test
    public void testController() throws IOException, SQLException {
        controller.doServiceDiscountCall("100", "10");
        verify(service).getGoodsWithDiscount(100, 10);
    }

    @Test(expected = RuntimeException.class)
    public void testControllerInvalidData() throws IOException, SQLException {
        controller.doServiceDiscountCall("100", "10");
        verify(service).getGoodsWithDiscount(100, 10);
    }

    @Test // fail cause in controller we should not let pass values below zero
    public void testControllerInvalidDataExt() throws IOException, SQLException {
        try{
            controller.doServiceDiscountCall("-100500", "10");
        }catch(RuntimeException ex){

        }

        verify(service, never()).getGoodsWithDiscount(anyInt(), anyInt());
    }
}
