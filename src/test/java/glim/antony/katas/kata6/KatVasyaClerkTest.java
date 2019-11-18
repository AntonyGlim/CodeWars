package glim.antony.katas.kata6;

import org.junit.Test;

import static org.junit.Assert.*;

public class KatVasyaClerkTest {
    
    @Test
    public void test1() {
        assertEquals("YES", KatVasyaClerk.Tickets(new int[] {25, 25, 50}));
    }
    @Test
    public void test2() {
        assertEquals("NO", KatVasyaClerk.Tickets(new int []{25, 100}));
    }
    @Test
    public void test3() {
        assertEquals("YES", KatVasyaClerk.Tickets(new int[] {25, 25, 25, 25, 25, 25, 25, 25, 25, 25}));
    }
    @Test
    public void test4() {
        assertEquals("NO", KatVasyaClerk.Tickets(new int []{50, 50, 50, 50, 50, 50, 50, 50, 50, 50}));
    }
    @Test
    public void test5() {
        assertEquals("NO", KatVasyaClerk.Tickets(new int []{100, 100, 100, 100, 100, 100, 100, 100, 100, 100}));
    }
    @Test
    public void test6() {
        assertEquals("YES", KatVasyaClerk.Tickets(new int []{25, 25, 25, 25, 50, 100, 50}));
    }
    @Test
    public void test7() {
        assertEquals("NO", KatVasyaClerk.Tickets(new int []{50, 100,100}));
    }
    @Test
    public void test8() {
        assertEquals("NO", KatVasyaClerk.Tickets(new int []{25, 25, 100}));
    }
    @Test
    public void test9() {
        assertEquals("NO", KatVasyaClerk.Tickets(new int []{25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 100, 100, 100, 100}));
    }
    @Test
    public void test10() {
        assertEquals("NO", KatVasyaClerk.Tickets(new int []{25,25,50,50,100}));
    }
    @Test
    public void test11() {
        assertEquals("NO", KatVasyaClerk.Tickets(new int []{25, 25, 25, 25, 25, 100, 100}));
    }
    @Test
    public void test12() {
        assertEquals("NO", KatVasyaClerk.Tickets(new int []{100, 50, 25, 25}));
    }
    @Test
    public void test13() {
        assertEquals("NO", KatVasyaClerk.Tickets(new int []{25, 50, 100, 25, 25, 25, 50}));
    }
    @Test
    public void test14() {
        assertEquals("NO", KatVasyaClerk.Tickets(new int []{25, 50, 25, 50, 100, 25, 25, 50}));
    }
    @Test
    public void test15() {
        assertEquals("YES", KatVasyaClerk.Tickets(new int []{25, 25, 25, 100}));
    }

}