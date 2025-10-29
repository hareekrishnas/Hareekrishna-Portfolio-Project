import components.naturalnumber.NaturalNumber;
import components.standard.Standard;

/**
 * Kernel interface for my SpellBook component.
 *
 * @author Hareekrishna Shankarganesh
 */
public interface SpellBookKernel extends Standard {

    /**
     * Adds a spell with the given power level to this SpellBook. If the spell
     * already exists, its power level is updated.
     *
     * @param spellName
     *            the name of the spell
     * @param powerLevel
     *            the power level of the spell
     * @updates this
     */
    void addSpell(String spellName, NaturalNumber powerLevel);

    /**
     * Removes the given spell from this SpellBook and returns the spell name.
     * If the spell does not exist, return an empty string.
     *
     * @param spellName
     *            the name of the spell to remove
     * @return the spell name if removed, otherwise an empty string
     * @updates this
     */
    String removeSpell(String spellName);

    /**
     * Returns the power level of the given spell. If the spell is not found,
     * returns 0.
     *
     * @param spellName
     *            the spell to look up
     * @return the power level, or 0 if not found
     */
    NaturalNumber getPower(String spellName);

    /**
     * Reports the number of spells in this SpellBook.
     *
     * @return number of spells stored
     */
    int spellsCount();

    /**
     * Reports whether the given spell exists in this SpellBook.
     *
     * @param spellName
     *            the spell to check
     * @return true if the spell exists, false when it is not
     */
    boolean hasSpell(String spellName);

}
