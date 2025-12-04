import components.map.Map;
import components.map.Map1L;
import components.naturalnumber.NaturalNumber;
import components.set.Set;
import components.set.Set1L;

/**
 * Secondary implementation of SpellBook.
 *
 * @author Hareekrishna Shankarganesh
 */
public abstract class SpellBookSecondary implements SpellBook {

    /**
     * Returns all spell names currently in the spellbook.
     *
     * @return a Set containing all spell names
     * @ensures allSpells is a set of all spell names in SpellBook
     */

    @Override
    public final Set<String> allSpells() {
        Set<String> names = new Set1L<>();
        String[] spells = new String[this.spellsCount()];
        int i = 0;
        for (String s : this.allSpells()) {
            spells[i] = s;
            i++;
        }
        for (int x = 0; x < spells.length; x++) {
            names.add(spells[x]);
        }
        return names;
    }

    /**
     * Returns a map of spells stronger than the given level.
     *
     * @param minPowerLevel
     *            the minimum power level
     * @return a map of spells above the given level
     * @ensures spellsAbove = map where powerLevel > the level
     */

    @Override
    public final Map<String, NaturalNumber> spellsAbove(int minPowerLevel) {
        Map<String, NaturalNumber> stronger = new Map1L<>();
        Set<String> names = this.allSpells();
        String[] spells = new String[this.spellsCount()];
        int i = 0;
        for (String s : names) {
            spells[i] = s;
            i++;
        }
        for (int x = 0; x < spells.length; x++) {
            NaturalNumber powerL = this.getPower(spells[x]);
            if (powerL.toInt() > minPowerLevel) {
                stronger.add(spells[x], powerL);
            }
        }
        return stronger;
    }

    /**
     * Checks if this SpellBook is equal to the given object.
     *
     * @param obj
     *            the object to compare
     * @return true if obj is a SpellBook with the same spells and power levels
     */
    @Override
    public final boolean equals(Object obj) {

        boolean result = false;
        if (obj != null) {
            if (this == obj) {
                result = true;
            } else {
                SpellBook object = (SpellBook) obj;
                result = this.allSpells().equals(object.allSpells());
            }
        }

        return result;
    }

    /**
     * Returns a string representation of each spell and its power level.
     *
     * @return a string listing all of the spells
     */
    @Override
    public final String toString() {
        String result = "";
        String s = "{";

        Set<String> names = this.allSpells();
        int count = 0;

        for (String name : names) {
            s = s + name + ": " + this.getPower(name).toString();
            count = count + 1;
            if (count < names.size()) {
                s = s + ", ";
            }
        }
        s = s + "}";
        result = s;

        return result;
    }

}
