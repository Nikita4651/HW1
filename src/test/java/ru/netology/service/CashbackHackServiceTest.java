package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void test1() {
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals("Для 900 руб. нужно докупить 100 руб.", expected, actual);
    }

    @Test
    public void test2() {
        int actual = service.remain(1500);
        int expected = 500;
        Assert.assertEquals("Для 1500 руб. нужно докупить 500 руб.", expected, actual);
    }


    @Test
    public void test4() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals("Для 1000 руб. докупать не нужно", expected, actual);
    }

}
