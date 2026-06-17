package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

 public class CashbackHackServiceTest {
    private final CashbackHackService service = new CashbackHackService();

     @Test
     public void test1() {
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected, "Для 900 руб. нужно докупить 100 руб.");
    }

     @Test
     public void test2() {
        int actual = service.remain(1500);
        int expected = 500;
        Assert.assertEquals(actual, expected, "Для 1500 руб. нужно докупить 500 руб.");
    }

     @Test
    public void test3() {
        int actual = service.remain(2000);
        int expected = 0;
        Assert.assertEquals(actual, expected, "Для 2000 руб. докупать не нужно");
    }

     @Test
     public void test4() {
        int actual = service.remain(0);
        int expected = 0;
        Assert.assertEquals(actual, expected, "Для 0 руб. докупать не нужно");
    }

     @Test (expectedExceptions = IllegalArgumentException.class)
     public void test5() {
        service.remain(-100);
    }
}
