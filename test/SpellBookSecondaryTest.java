import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import components.map.Map;
import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber1L;
import components.naturalnumber.NaturalNumber2;
import components.set.Set;

/**
 * JUnit test cases for SpellBookTest using OSU Components API. Tests the
 * secondary methods for SpellBook
 *
 */

public class SpellBookSecondaryTest {

    /**
     * Test allSpells method for zero.
     */
    @Test
    public void testAllSpellsForZero() {
        SpellBook spell = new SpellBook1L();
        Set<String> actual = spell.allSpells();
        assertEquals(0, actual.size());
    }

    /**
     * Test allSpells method for one.
     */
    @Test
    public void testAllSpellsForOne() {
        SpellBook spell = new SpellBook1L();
        spell.addSpell("fire", new NaturalNumber2(10));
        Set<String> actual = spell.allSpells();
        assertEquals(true, actual.contains("fire"));
        assertEquals(1, actual.size());
    }

    /**
     * Test allSpells method for many.
     */
    @Test
    public void testAllSpellsForMany() {
        SpellBook spell = new SpellBook1L();
        spell.addSpell("fire", new NaturalNumber2(10));
        spell.addSpell("ice", new NaturalNumber2(5));
        spell.addSpell("wind", new NaturalNumber2(7));
        Set<String> actual = spell.allSpells();
        assertEquals(3, actual.size());
        assertEquals(true, actual.contains("fire"));
        assertEquals(true, actual.contains("ice"));
        assertEquals(true, actual.contains("wind"));
    }

    /**
     * Test spellsAbove method for zero.
     */
    @Test
    public void testSpellsAboveForZeroSpells() {
        SpellBook spell = new SpellBook1L();
        Map<String, NaturalNumber> actual = spell.spellsAbove(5);
        assertEquals(0, actual.size());
    }

    /**
     * Test allSpells method for one below.
     */
    @Test
    public void testSpellsAboveForOneBelow() {
        SpellBook spell = new SpellBook1L();
        spell.addSpell("fire", new NaturalNumber2(3));
        Map<String, NaturalNumber> actual = spell.spellsAbove(5);
        assertEquals(0, actual.size());
    }

    /**
     * Test spellsABove method for one equal.
     */
    @Test
    public void testSpellsAboveForOneEqual() {
        SpellBook spell = new SpellBook1L();
        spell.addSpell("fire", new NaturalNumber2(5));
        Map<String, NaturalNumber> actual = spell.spellsAbove(5);
        for (Map.Pair<String, NaturalNumber> p : actual) {
            assertEquals("fire", p.key());
            assertEquals(new NaturalNumber2(5), p.value());
        }
        assertEquals(0, actual.size());
    }

    /**
     * Test allSpells method for one above.
     */
    @Test
    public void testSpellsAboveForOneAbove() {
        SpellBook spell = new SpellBook1L();
        spell.addSpell("fire", new NaturalNumber2(10));
        Map<String, NaturalNumber> actual = spell.spellsAbove(5);
        for (Map.Pair<String, NaturalNumber> p : actual) {
            assertEquals("fire", p.key());
            assertEquals(new NaturalNumber2(10), p.value());
        }
        assertEquals(1, actual.size());
    }

    /**
     * Test allSpells method for many.
     */
    @Test
    public void testSpellsAboveForMany() {
        SpellBook spell = new SpellBook1L();
        spell.addSpell("fire", new NaturalNumber2(10));
        spell.addSpell("ice", new NaturalNumber2(2));
        spell.addSpell("wind", new NaturalNumber2(7));
        Map<String, NaturalNumber> actual = spell.spellsAbove(5);
        int count = 0;
        for (Map.Pair<String, NaturalNumber> p : actual) {
            if (p.key().equals("fire")) {
                assertEquals(new NaturalNumber2(10), p.value());
                count++;
            }
            if (p.key().equals("wind")) {
                assertEquals(new NaturalNumber2(7), p.value());
                count++;
            }
        }
        assertEquals(2, count);
    }

    /**
     * Test equals method for zero.
     */
    @Test
    public void testEqualsForZero() {
        SpellBook spell1 = new SpellBook1L();
        SpellBook spell2 = new SpellBook1L();
        assertTrue(spell1.equals(spell2));
    }

    /**
     * Test equals method for one.
     */
    @Test
    public void testEqualsForOne() {
        SpellBook spell1 = new SpellBook1L();
        SpellBook spell2 = new SpellBook1L();

        spell1.addSpell("Fire", new NaturalNumber1L(10));
        spell2.addSpell("Fire", new NaturalNumber1L(10));

        assertTrue(spell1.equals(spell2));
    }

    /**
     * Test equals method for many.
     */
    @Test
    public void testEqualsForMany() {
        SpellBook spell1 = new SpellBook1L();
        SpellBook spell2 = new SpellBook1L();

        spell1.addSpell("Fire", new NaturalNumber1L(10));
        spell1.addSpell("Ice", new NaturalNumber1L(25));
        spell1.addSpell("Wind", new NaturalNumber1L(40));

        spell2.addSpell("Fire", new NaturalNumber1L(10));
        spell2.addSpell("Ice", new NaturalNumber1L(25));
        spell2.addSpell("Wind", new NaturalNumber1L(40));

        assertTrue(spell1.equals(spell2));
    }

    /**
     * Test equals method for different spells and power levels.
     */
    @Test
    public void testEqualsForDifferent() {
        SpellBook spell1 = new SpellBook1L();
        SpellBook spell2 = new SpellBook1L();

        spell1.addSpell("Fire", new NaturalNumber1L(10));
        spell2.addSpell("Ice", new NaturalNumber1L(20));

        assertEquals(false, spell1.equals(spell2));
    }

    /**
     * Test equals method for the same.
     */
    @Test
    public void testEqualsForSame() {
        SpellBook spell = new SpellBook1L();

        spell.addSpell("Fire", new NaturalNumber1L(10));
        spell.addSpell("Wind", new NaturalNumber1L(40));

        assertTrue(spell.equals(spell));
    }

    /**
     * Test toString method for zero.
     */
    @Test
    public void testToStringForZero() {
        SpellBook spell = new SpellBook1L();
        assertEquals("{}", spell.toString());
    }

    /**
     * Test toString method for one.
     */
    @Test
    public void testToStringForOne() {
        SpellBook spell = new SpellBook1L();

        spell.addSpell("Fire", new NaturalNumber1L(10));

        assertEquals("{Fire: 10}", spell.toString());
    }

    /**
     * Test toString method for many.
     */
    @Test
    public void testToStringForMany() {
        SpellBook spell = new SpellBook1L();

        spell.addSpell("Fire", new NaturalNumber1L(10));
        spell.addSpell("Ice", new NaturalNumber1L(25));
        spell.addSpell("Wind", new NaturalNumber1L(40));

        String s = spell.toString();

        boolean sVals = s.equals("{Fire: 10, Ice: 25, Wind: 40}")
                || s.equals("{Fire: 10, Wind: 40, Ice: 25}")
                || s.equals("{Ice: 25, Fire: 10, Wind: 40}")
                || s.equals("{Ice: 25, Wind: 40, Fire: 10}")
                || s.equals("{Wind: 40, Fire: 10, Ice: 25}")
                || s.equals("{Wind: 40, Ice: 25, Fire: 10}");

        assertTrue(sVals);
    }
}
