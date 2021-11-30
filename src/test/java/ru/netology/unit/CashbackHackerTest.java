package ru.netology.unit;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackerTest {

    @Test
    public void shouldReturn100IfAmount900() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 900;

        int actual = cashbackHacker.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturn0IfAmount1000() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 1000;

        int actual = cashbackHacker.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);

    }
}