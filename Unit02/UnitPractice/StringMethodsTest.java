package Unit02.UnitPractice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringMethodsTest {

    @Test
    void helloName() {
        assertEquals("Hello Bella!", StringMethods.helloName("Bella"));
        assertEquals("Hello John!", StringMethods.helloName("John"));
    }

    @Test
    void firstHalf() {
        assertEquals("Ja", StringMethods.firstHalf("Java"));
        assertEquals("AP ", StringMethods.firstHalf("AP CSA"));
    }

    @Test
    void endsLy() {
        assertTrue(StringMethods.endsLy("quickly"));
        assertFalse(StringMethods.endsLy("quick"));
    }

    @Test
    void makeAbba() {
        assertEquals("HiByeByeHi", StringMethods.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", StringMethods.makeAbba("Yo", "Alice"));
    }

    @Test
    void withoutEnd() {
        assertEquals("ell", StringMethods.withoutEnd("Hello"));
        assertEquals("orl", StringMethods.withoutEnd("World"));
    }

    @Test
    void nTwice() {
        assertEquals("Held", StringMethods.nTwice("Hello World", 2));
        assertEquals("Wd", StringMethods.nTwice("World", 1));
    }

    @Test
    void makeTags() {
        assertEquals("<i>Hello</i>", StringMethods.makeTags("i", "Hello"));
        assertEquals("<b>World</b>", StringMethods.makeTags("b", "World"));
    }

    @Test
    void middleTwo() {
        assertEquals("av", StringMethods.middleTwo("Java"));
        assertEquals(" C", StringMethods.middleTwo("AP CSA"));
    }
}