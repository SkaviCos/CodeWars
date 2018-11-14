package ru.codewars.chall;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    public void test() throws Exception{
        BinarySearch b = new BinarySearch();
        int[] list = {2,3,4,5,6,7};

        assertEquals(2,b.Search(list,4));
        System.out.println("Test done");
        //assertEquals(null,b.Search(list,1));
    }
}
