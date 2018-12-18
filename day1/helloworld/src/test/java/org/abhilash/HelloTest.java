package org.abhilash;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {

@Test
public void testSayHello(){
        Hello obj  = new Hello();

        String ac = obj.sayHello();
        String real  = "Hello World";

        assertEquals(ac,real);
}
}
