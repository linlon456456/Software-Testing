package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.desktop.SystemEventListener;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Kevin");
        System.out.println("BeforeEach......");
    }

    //Test---------------------------------------------------------------------
    @Test
    void setHW() {
        try {
            person.setHW(1.7f, 800);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test setHW......\t"+person.getName()+"\t"+person.getBMI());
    }

    @Test
    void setAge() {
        //System.out.println("non...");
        try {
            //person.setHW(1.7f, 65);
            person.setAge(65);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test setAge......\t"+person.getName()+"\tAge:"+person.getAge());
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finish.");
    }
}