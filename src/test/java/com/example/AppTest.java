package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testMessage() {
        App app = new App();
        assertEquals("Hello SonarQube!", app.message());
    }
}
