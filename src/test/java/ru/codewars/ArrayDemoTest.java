package ru.codewars;

import static org.junit.Assert.*;


import org.junit.Test;

public class ArrayDemoTest {
    @Test
        public void validate() {
            assertEquals("Bilal Djaghout", ArrayDemo.smash(new String[] { "Bilal", "Djaghout" }));
        }

        @Test
        public void validateEmpty() {
            assertEquals("", ArrayDemo.smash(new String[] {}));
        }


        @Test
        public void validateOneWord() {
            assertEquals("Bilal", ArrayDemo.smash(new String[] {"Bilal"}));
        }

    }


