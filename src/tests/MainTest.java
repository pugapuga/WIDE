package tests;

import org.junit.jupiter.api.Test;
import uabc.edu.mx.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        Main.main(new String[]{"arg1", "arg2"});
        assertTrue(true);
    }
}