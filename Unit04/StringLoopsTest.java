package Unit04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringLoopsTest {

    @Test
    void doubleChar() {
        assertEquals("TThhee", StringLoops.doubleChar("The"));
        assertEquals("AAAAbbbb", StringLoops.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", StringLoops.doubleChar("Hi-There"));
    }

    @Test
    void countCode() {
        assertEquals(1, StringLoops.countCode("aaacodebbb"));
        assertEquals(2, StringLoops.countCode("codexxcode"));
        assertEquals(2, StringLoops.countCode("cozexxcope"));
    }

    @Test
    void bobThere() {
        assertTrue(StringLoops.bobThere("abcbob"));
        assertTrue(StringLoops.bobThere("b9b"));
        assertFalse(StringLoops.bobThere("bac"));
    }

    @Test
    void prefixAgain() {
        assertTrue(StringLoops.prefixAgain("abXYabc", 1));
        assertTrue(StringLoops.prefixAgain("abXYabc", 2));
        assertFalse(StringLoops.prefixAgain("abXYabc", 3));
    }

    @Test
    void sameStarChar() {
        assertTrue(StringLoops.sameStarChar("xy*yzz"));
        assertFalse(StringLoops.sameStarChar("xy*zzz"));
        assertTrue(StringLoops.sameStarChar("*xa*az"));
    }

    @Test
    void starOut() {
        assertEquals("ad", StringLoops.starOut("ab*cd"));
        assertEquals("ad", StringLoops.starOut("ab**cd"));
        assertEquals("silly", StringLoops.starOut("sm*eilly"));
    }

    @Test
    void countHi() {
        assertEquals(1, StringLoops.countHi("abc hi ho"));
        assertEquals(2, StringLoops.countHi("ABChi hi"));
        assertEquals(2, StringLoops.countHi("hihi"));
    }

    @Test
    void endOther() {
        assertTrue(StringLoops.endOther("Hiabc", "abc"));
        assertTrue(StringLoops.endOther("AbC", "HiaBc"));
        assertTrue(StringLoops.endOther("abc", "abXabc"));
    }

    @Test
    void xyBalance() {
        assertTrue(StringLoops.xyBalance("aaxbby"));
        assertFalse(StringLoops.xyBalance("aaxbb"));
        assertFalse(StringLoops.xyBalance("yaaxbb"));
    }

    @Test
    void plusOut() {
        assertEquals("++xy++", StringLoops.plusOut("12xy34", "xy"));
        assertEquals("1+++++", StringLoops.plusOut("12xy34", "1"));
        assertEquals("++xy++xy+++xy", StringLoops.plusOut("12xy34xyabcxy", "xy"));
    }

    @Test
    void catDog() {
        assertTrue(StringLoops.catDog("catdog"));
        assertFalse(StringLoops.catDog("catcat"));
        assertTrue(StringLoops.catDog("1cat1cadodog"));
    }

    @Test
    void mixString() {
        assertEquals("axbycz", StringLoops.mixString("abc", "xyz"));
        assertEquals("HTihere", StringLoops.mixString("Hi", "There"));
        assertEquals("xTxhxexre", StringLoops.mixString("xxxx", "There"));
    }

    @Test
    void repeatSeparator() {
        assertEquals("WordXWordXWord", StringLoops.repeatSeparator("Word", "X", 3));
        assertEquals("ThisAndThis", StringLoops.repeatSeparator("This", "And", 2));
    }
}