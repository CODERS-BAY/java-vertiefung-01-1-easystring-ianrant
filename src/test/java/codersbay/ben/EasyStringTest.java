package codersbay.ben;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EasyStringTest {

    @Test
    @DisplayName("Add String with several words to the list")
    public void testAdd() {
        EasyString easyString1 = new EasyString();
        String test = "Many medical maladies merge merciless mornings.";
        easyString1.add(test);
        assertEquals(test, easyString1.toString());

        EasyString easyString2 = new EasyString("Many medical maladies merge merciless mornings.");
        assertEquals("Many medical maladies merge merciless mornings.", easyString2.toString());

    }


    @Test
    @DisplayName("Comparing the length of a String to the length of the list that it was added to")
    public void testLength() {
        EasyString easyString = new EasyString();
        String test = "10987654321";
        easyString.add(test);
        assertEquals(test, easyString.getCharacterList().size());
    }

    @Test
    public void testRemove() {
        EasyString easyString = new EasyString("Many medical maladies");
        easyString.remove(3);
        assertEquals("Many medical malad".length(), easyString.getCharacterList().size());
    }

    @Test
    public void testTrimFront() {
        EasyString easyString = new EasyString(" Hallo Welt ");
        easyString.trimFront();
        assertEquals("Hallo Welt ", easyString.getCharacterList().toString());
    }

    @Test
    public void testTrimBack() {
        EasyString easyString = new EasyString(" Hallo Welt ");
        easyString.trimBack();
        assertEquals(" Hallo Welt", easyString.getCharacterList().toString());
    }

    @Test
    public void testTrimMiddle() {
        EasyString easyString = new EasyString(" Hallo Welt ");
        easyString.trimBack();
        assertEquals(" HalloWelt", easyString.getCharacterList().toString());
    }


}