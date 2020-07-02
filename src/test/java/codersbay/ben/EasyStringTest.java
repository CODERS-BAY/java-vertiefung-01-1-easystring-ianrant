package codersbay.ben;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EasyStringTest {

    @Test
    @DisplayName("Add String with several words to the list")
    public void testAdd() {
        EasyString easyString1 = new EasyString("Many medical maladies. ");
        assertEquals("Many medical maladies. ", easyString1.toString());
    }


    @Test
    @DisplayName("Comparing the length of a String to the length of the list that it was added to")
    public void testLength() {
        EasyString easyString2 = new EasyString("10987654321");
        assertEquals("10987654321".length(), easyString2.getCharacterList().size());
    }

    @Test
    public void testRemove() {
        EasyString easyString3 = new EasyString("Many medical maladies");
        easyString3.remove(3);
        assertEquals("Many medical malad".length(), easyString3.getCharacterList().size());
    }

    @Test
    public void testTrimFront() {
        EasyString easyString4 = new EasyString("     Hallo Welt ");
        easyString4.trimFront();
        assertEquals("Hallo Welt ", easyString4.toString());
    }

    @Test
    public void testTrimBack() {
        EasyString easyString5 = new EasyString(" Hallo Welt          ");
        easyString5.trimBack();
        assertEquals(" Hallo Welt", easyString5.toString());
    }

    @Test
    public void testTrimMiddle() {
        EasyString easyString6 = new EasyString(" Hallo            Welt ");
        easyString6.trimMiddle();
        assertEquals(" HalloWelt ", easyString6.toString());
    }

}