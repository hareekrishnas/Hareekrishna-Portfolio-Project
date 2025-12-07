import components.map.Map;
import components.naturalnumber.NaturalNumber;
import components.set.Set;

/**
 * Secondary Methods Interface for my SpellBook component.
 *
 * @author Hareekrishna Shankarganesh
 */
public interface SpellBook extends SpellBookKernel {
    /**
     * Returns a set of all spell names currently in the SpellBook.
     *
     *
     * @return a set containing all spell names
     * @ensures allSpells has every spell name in this
     * @ensures this will not be changed
     */
    Set<String> allSpells();

    /**
     * Returns a map of spells whose power level is greater than or equal to the
     * given minimum power level.
     *
     * @param minPowerLevel
     *            the minimum power level to filter spells
     * @return a map of spell names to their power levels meeting the threshold
     * @requires minPowerLevel >= 0
     * @ensures SpellBook will not change
     * @ensures returns the spells that are greater than or equal to the given
     *          minimum powerl level.
     */
    Map<String, NaturalNumber> spellsAbove(int minPowerLevel);

}