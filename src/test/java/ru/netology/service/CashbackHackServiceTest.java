package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void remainBoundaryMin1() {

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
    @Test
    public void remainBoundaryMin2() {
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
    @Test
    public void remainBoundaryMin3() {

        int amount = -1;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
    @Test
    public void remainBoundaryMax() {

        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }

    @Test
    public void remainBoundaryMax1() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
    @Test
    public void remainBoundaryMax2() {

        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
    @Test
    public void remainBoundaryMiddle() {

        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }

}