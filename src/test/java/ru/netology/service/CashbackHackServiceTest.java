package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

        @Test
        public void remainBoundaryMin1() {
            CashbackHackService service = new CashbackHackService();
            int amount = 0;
            int expected = 1000;
            int actual = service.remain(amount);
            assertEquals(actual,expected);
        }

        @Test
        public void remainBoundaryMin2() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1;
            int expected = 999;
            int actual = service.remain(amount);
            assertEquals(actual,expected);
        }

        @Test
        public void remainBoundaryMin3() {
            CashbackHackService service = new CashbackHackService();
            int amount = -1;
            int expected = 1000;
            int actual = service.remain(amount);
            assertEquals(actual,expected);
        }

        @Test
        public void remainBoundaryMax() {
            CashbackHackService service = new CashbackHackService();
            int amount = 999;
            int expected = 1;
            int actual = service.remain(amount);
            assertEquals(actual,expected);
        }

        @Test
        public void remainBoundaryMax1() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;
            int expected = 0;
            int actual = service.remain(amount);
            assertEquals(actual,expected);
        }

        @Test
        public void remainBoundaryMax2() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1001;
            int expected = 999;
            int actual = service.remain(amount);
            assertEquals(actual,expected);
        }

    @Test
    public void remainBoundaryMiddle() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }


    }

