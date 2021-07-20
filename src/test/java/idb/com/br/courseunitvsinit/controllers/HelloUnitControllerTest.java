package idb.com.br.courseunitvsinit.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloUnitControllerTest {
	
    @Test
    void hello() {
        HelloUnitController controller = new HelloUnitController(); // Arrange
        String response = controller.hello("World"); // Act
        assertEquals("Hello, World", response);// Assert
    }
}
