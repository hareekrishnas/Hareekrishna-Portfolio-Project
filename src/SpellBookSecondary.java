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
    private Map<String, NaturalNumber> spells;

    /**
     * No-argument constructor.
     */
    public SpellBookSecondary() {
        this.spells = new Map1L<>();
    }

    /**
     * Returns all spell names currently in the spellbook.
     *
     * @return a Set containing all spell names
     * @ensures allSpells is a set of all spell names in SpellBook
     */

    @Override
    public final Set<String> allSpells() {
        Set<String> names = new Set1L<>();
        Map<String, NaturalNumber> temp = this.spells.newInstance();
        temp.transferFrom(this.spells);
        while (temp.size() > 0) {
            Map.Pair<String, NaturalNumber> pair = temp.removeAny();
            names.add(pair.key());
            this.spells.add(pair.key(), pair.value());
        }
        return names;
    }

    /**
     * Returns a map of spells stronger than the given level.
     *
     * @param level
     *            the minimum power level
     * @return a map of spells above the given level
     * @ensures spellsAbove = map where powerLevel > the level
     */

    @Override
    public final Map<String, NaturalNumber> spellsAbove(NaturalNumber level) {
        Map<String, NaturalNumber> stronger = new Map1L<>();
        Map<String, NaturalNumber> temp = this.spells.newInstance();
        temp.transferFrom(this.spells);
        while (temp.size() > 0) {
            Map.Pair<String, NaturalNumber> p = temp.removeAny();
            if (p.value().compareTo(level) > 0) {
                stronger.add(p.key(), p.value());
            }
            this.spells.add(p.key(), p.value());
        }
        return stronger;
    }
}
