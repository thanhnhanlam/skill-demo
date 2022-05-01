import org.junit.*;
import static org.junit.Assert.*;

public class Tester {
    
    @Test
    public void testTrim() {
        assertEquals("Hi", SkillDemo.trim("  Hi  "));
    }
}
