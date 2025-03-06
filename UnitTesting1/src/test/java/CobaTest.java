import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CobaTest {

    @Test
    void testMethod1() {
        Assertions.assertEquals(10,10);
    }

    @Test
    void testMethod2() {
        Assertions.assertSame(10,10);
    }
}

