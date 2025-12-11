import components.naturalnumber.NaturalNumber1L;

/**
 * Implementation of SpellBookCase1 component using SpellBook component.
 */
public class VideoGameShop {

    /**
     * Variable spells using SpellBook component.
     */
    private SpellBook spells;

    /**
     * Creates a video game shop using SpellBook component.
     */
    public VideoGameShop() {
        this.spells = new SpellBook1L();
    }

    /**
     * Adds spell to VideoGameShop.
     *
     * @param name
     *            the name of the spell
     * @param power
     *            the spell's power
     */
    public final void addSpell(String name, int power) {
        this.spells.addSpell(name, new NaturalNumber1L(power));
    }

    /**
     * Creates a video game shop using SpellBook component.
     *
     * @param name
     *            the spell name
     */
    public final void sellSpell(String name) {
        this.spells.removeSpell(name);
    }

    /**
     * Shows the current inventory in the VideoGameShop.
     */
    public final void inventory() {
        System.out.println("Shop Inventory: " + this.spells);
    }

    /**
     * Shows the strong spells that are above minPower.
     *
     * @param minPower
     *            the power threshold of the spell
     */
    public final void strongSpells(int minPower) {
        System.out.println("Strong Spells (> " + minPower + "): "
                + this.spells.spellsAbove(minPower));
    }

    /**
     * Creates a video game shop using SpellBook component.
     *
     * @param args
     *            the arguments for main
     */
    public static void main(String[] args) {

        VideoGameShop shop = new VideoGameShop();

        shop.addSpell("Fire", 15);
        shop.addSpell("Water", 20);
        shop.addSpell("Lightning", 75);
        shop.addSpell("Earthquake", 90);

        shop.inventory();

        shop.strongSpells(50);

        shop.sellSpell("Water");
        System.out.println("After selling Water:");
        shop.inventory();
    }
}
