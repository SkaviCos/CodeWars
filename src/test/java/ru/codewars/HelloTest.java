package ru.codewars;

import org.junit.Test;
import ru.codewars.Hello;

import static org.junit.Assert.assertEquals;

public class HelloTest {
    @Test
    public void test1() throws Exception {
        Hello h = new Hello();
        String[] name = {"John", "Smith"};
        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
                h.sayHello(name, "Phoenix", "Arizona"));
    }
}