package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    App app = new App();

    @Test
    public void testAdd() {
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, app.subtract(3, 2));
    }
}
