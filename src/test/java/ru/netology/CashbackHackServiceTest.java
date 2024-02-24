package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackServiceTest {
@Test
    public void calculateCashBack1 () {
        CashbackHackService service = new CashbackHackService();

        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void calculateCashBack2 () {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void calculateCashBack3 () {
        CashbackHackService service = new CashbackHackService();

        int amount = 1010;

        int actual = service.remain(amount);
        int expected = 990;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void calculateCashBack4 () {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}
