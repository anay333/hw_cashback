package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CashbackHackerTest {

    @Test
    public void shouldReturn100IfAmount900() {
        CashbackHacker cashbackHacker=new CashbackHacker();
        int amount=900;

        int actual=cashbackHacker.remain(amount);
        int expected=100;

        assertEquals(actual,expected);

    }
    @Test
    public void shouldReturn0IfAmount1000() {
        CashbackHacker cashbackHacker=new CashbackHacker();
        int amount=1000;

        int actual=cashbackHacker.remain(amount);
        int expected=0;

        assertEquals(actual,expected);

    }
}