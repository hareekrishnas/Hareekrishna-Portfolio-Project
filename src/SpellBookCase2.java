import components.naturalnumber.NaturalNumber1L;

/**
 * Implementation of the SpellBookCase2 component using SpellBook component.
 */

public class SpellBookCase2 {

    /**
     * Variable spells using SpellBook component.
     */
    private SpellBook spells;

    /**
     * Creates SpellBookCase2 using SpellBook component.
     */
    public SpellBookCase2() {
        this.spells = new SpellBook1L();
    }

    /**
     * Creates a way to learn a spell by using addSpell.
     *
     * @param name
     *            The spell name
     * @param power
     *            The power level of the spell
     */
    public final void learnSpell(String name, int power) {
        assert power >= 0 : "Violation of: power >= 0";
        this.spells.addSpell(name, new NaturalNumber1L(power));
    }

    /**
     * Creates a way to forget a spell by using removeSpell.
     *
     * @param name
     *            The spell name
     */
    public void forgetSpell(String name) {
        this.spells.removeSpell(name);
    }

    /**
     * Creates a way to get the spell's name by using getPower.
     *
     * @param name
     *            The spell name
     * @return The power level of the spell casted
     */
    public int getSpellPower(String name) {
        return this.spells.getPower(name).toInt();
    }

    /**
     * Creates a way to see all the spell by toString.
     *
     */
    public void showSpells() {
        System.out.println("Spells: " + this.spells.toString());
    }

    /**
     * Creates a way to learn a spell by using addSpell.
     *
     * @param args
     *            The arguments in main.
     */
    public static void main(String[] args) {
        SpellBookCase2 character = new SpellBookCase2();

        character.learnSpell("Fire", 10);
        character.learnSpell("Ice", 25);
        character.learnSpell("Wind", 40);

        character.showSpells();

        character.forgetSpell("Fire");
        character.showSpells();

        System.out.println(
                "Power of Ice spell: " + character.getSpellPower("Ice"));
    }
}
