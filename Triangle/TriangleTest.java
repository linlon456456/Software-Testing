package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle Tri;

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach......");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach......");
    }

    @Test
    void checkTriangle() {
        try {
            Tri = new Triangle(0, -1, -3);      //error
        } catch (TriangleException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test TriType......\t"+Tri.getTriType()+"...");
    }
}