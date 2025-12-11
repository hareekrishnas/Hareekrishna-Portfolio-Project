import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import components.map.Map;
import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber1L;
import components.set.Set;
import components.set.Set1L;

/**
 * JUnit test cases for SpellBook1L using OSU Components API. Tests the kernel
 * methods for SpellBook
 *
 */
public class SpellBook1LTest {

    /**
     * Test addSpell kernel method with 0 spells.
     */
    @Test
    public void testAddSpellZero() {
        SpellBook book = new SpellBook1L();
        book.addSpell("Fire", new NaturalNumber1L(10));

        // Check postconditions using kernel methods
        assertTrue(book.hasSpell("Fire"));
        assertEquals(1, book.spellsCount());
        assertEquals(10, book.getPower("Fire").toInt());
    }

    /**
     * Test addSpell kernel method with 1 spell already present.
     */
    @Test
    public void testAddSpellOne() {
        SpellBook book = new SpellBook1L();
        book.addSpell("Fire", new NaturalNumber1L(10));
        book.addSpell("Water", new NaturalNumber1L(5));

        assertTrue(book.hasSpell("Water"));
        assertEquals(2, book.spellsCount());
        assertEquals(5, book.getPower("Water").toInt());
    }

    /**
     * Test addSpell method for many spells.
     */
    @Test
    public void testAddSpellMany() {
        SpellBook book = new SpellBook1L();
        book.addSpell("Fire", new NaturalNumber1L(10));
        book.addSpell("Water", new NaturalNumber1L(5));
        book.addSpell("Rock", new NaturalNumber1L(7));

        book.addSpell("Fire", new NaturalNumber1L(12));

        assertEquals(12, book.getPower("Fire").toInt());
        assertEquals(3, book.spellsCount());
    }

    /**
     * Test hasSpell method when 0 spells are in the SpellBook.
     */
    @Test
    public void testHasSpellZero() {
        SpellBook book = new SpellBook1L();
        assertEquals(false, book.hasSpell("Fire"));
    }

    /**
     * Test hasSpell method when 1 spell is in the SpellBook.
     */
    @Test
    public void testHasSpellOne() {
        SpellBook book = new SpellBook1L();
        book.addSpell("Fire", new NaturalNumber1L(10));
        assertEquals(true, book.hasSpell("Fire"));
    }

    /**
     * Test removeSpell method with 0 spells in the SpellBook.
     */
    @Test
    public void testRemoveSpellZero() {
        SpellBook book = new SpellBook1L();
        String removed = book.removeSpell("Fire");
        assertEquals("", removed);
        assertEquals(0, book.spellsCount());
    }

    /**
     * Test removeSpell method with 1 spell in the SpellBook.
     */
    @Test
    public void testRemoveSpellOne() {
        SpellBook book = new SpellBook1L();
        book.addSpell("Fire", new NaturalNumber1L(10));
        String removed = book.removeSpell("Fire");

        assertEquals("Fire", removed);
        assertEquals(0, book.spellsCount());
        assertEquals(false, book.hasSpell("Fire"));
    }

    /**
     * Test getPower method with 0 spells in the SpellBook.
     */
    @Test
    public void testGetPowerZero() {
        SpellBook book = new SpellBook1L();
        assertEquals(0, book.getPower("Fire").toInt());
    }

    /**
     * Test getPower method with 1 spell in the SpellBook.
     */
    @Test
    public void testGetPowerOne() {
        SpellBook book = new SpellBook1L();
        book.addSpell("Fire", new NaturalNumber1L(10));
        assertEquals(10, book.getPower("Fire").toInt());
    }

    /**
     * Test spellsCount method when there are 0 spells in the SpellBook
     */
    @Test
    public void testSpellsCountZero() {
        SpellBook book = new SpellBook1L();
        assertEquals(0, book.spellsCount());
    }

    /**
     * Test for spellsCount with many spells in the SpellBook.
     */
    @Test
    public void testSpellsCountForMany() {
        SpellBook book = new SpellBook1L();
        book.addSpell("Fire", new NaturalNumber1L(10));
        book.addSpell("Water", new NaturalNumber1L(5));
        book.addSpell("Rock", new NaturalNumber1L(7));
        assertEquals(3, book.spellsCount());
    }

    /**
     * Test for newInstance method for zero.
     */
    @Test
    public void testNewInstanceForZero() {
        SpellBook spell = new SpellBook1L();
        SpellBook spell2 = spell.newInstance();
        assertTrue(spell2.spellsCount() == 0);
    }

    /**
     * Test for newInstance method for one.
     */
    @Test
    public void testNewInstanceForOne() {
        SpellBook spell = new SpellBook1L();
        spell.addSpell("Fire", new NaturalNumber1L(10));
        SpellBook spell2 = spell.newInstance();
        assertTrue(spell2.spellsCount() == 0);
    }

    /**
     * Test for newInstance method for many.
     */

    @Test
    public void testNewInstanceForMany() {
        SpellBook spell = new SpellBook1L();
        spell.addSpell("Fire", new NaturalNumber1L(10));
        spell.addSpell("Ice", new NaturalNumber1L(20));
        spell.addSpell("Wind", new NaturalNumber1L(30));
        SpellBook spell2 = spell.newInstance();
        assertTrue(spell2.spellsCount() == 0);
    }

    /**
     * Test for clear method for one.
     */

    @Test
    public void testClearForOne() {
        SpellBook spell = new SpellBook1L();
        spell.addSpell("Fire", new NaturalNumber1L(10));
        spell.clear();
        assertTrue(spell.spellsCount() == 0);
    }

    /**
     * Test for clear method for many.
     */

    @Test
    public void testClearForMany() {
        SpellBook spell = new SpellBook1L();
        spell.addSpell("Fire", new NaturalNumber1L(10));
        spell.addSpell("Ice", new NaturalNumber1L(20));
        spell.addSpell("Wind", new NaturalNumber1L(30));
        spell.clear();
        assertTrue(spell.spellsCount() == 0);
    }

    /**
     * Test for transferFrom method for zero.
     */
    @Test
    public void testTransferFromForZero() {
        SpellBook spell = new SpellBook1L();
        SpellBook spell2 = new SpellBook1L();
        spell.transferFrom(spell2);
        assertTrue(spell.spellsCount() == 0 && spell2.spellsCount() == 0);
    }

    /**
     * Test for transferFrom method for one.
     */

    @Test
    public void testTransferFromForOne() {
        SpellBook spell = new SpellBook1L();
        SpellBook spell2 = new SpellBook1L();
        spell2.addSpell("Fire", new NaturalNumber1L(10));
        spell.transferFrom(spell2);
        assertTrue(spell.spellsCount() == 1 && spell2.spellsCount() == 0);
    }

    /**
     * Test for transferFrom method for many.
     */

    @Test
    public void testTransferFromForMany() {
        SpellBook spell = new SpellBook1L();
        SpellBook spell2 = new SpellBook1L();
        spell2.addSpell("Fire", new NaturalNumber1L(10));
        spell2.addSpell("Ice", new NaturalNumber1L(20));
        spell2.addSpell("Wind", new NaturalNumber1L(30));
        spell.transferFrom(spell2);
        assertTrue(spell.spellsCount() == 3 && spell2.spellsCount() == 0);
    }

    /**
     * Test for iterable method for zero.
     */
    @Test
    public void testIterableZero() {
        SpellBook s = new SpellBook1L();

        int count = 0;
        for (Map.Pair<String, NaturalNumber> p : s.pairs()) {
            count++;
        }

        assertEquals(0, count);
    }

    /**
     * Test for iterable method for one.
     */

    @Test
    public void testIterableOne() {
        SpellBook s = new SpellBook1L();
        s.addSpell("Fire", new NaturalNumber1L(10));

        int count = 0;
        for (Map.Pair<String, NaturalNumber> p : s.pairs()) {
            assertEquals("Fire", p.key());
            assertEquals(new NaturalNumber1L(10), p.value());
            count++;
        }

        assertEquals(1, count);
    }

    /**
     * Test for iterable method for many.
     */

    @Test
    public void testIterableMany() {
        SpellBook s = new SpellBook1L();
        s.addSpell("Fire", new NaturalNumber1L(10));
        s.addSpell("Ice", new NaturalNumber1L(20));
        s.addSpell("Wind", new NaturalNumber1L(30));

        Set<String> expected = new Set1L<>();
        expected.add("Fire");
        expected.add("Ice");
        expected.add("Wind");

        int count = 0;
        for (Map.Pair<String, NaturalNumber> p : s.pairs()) {
            assertTrue(expected.contains(p.key()));

            if (p.key().equals("Fire")) {
                assertEquals(new NaturalNumber1L(10), p.value());
            } else if (p.key().equals("Ice")) {
                assertEquals(new NaturalNumber1L(20), p.value());
            } else if (p.key().equals("Wind")) {
                assertEquals(new NaturalNumber1L(30), p.value());
            }

            count++;
        }

        assertEquals(3, count);
    }
}
