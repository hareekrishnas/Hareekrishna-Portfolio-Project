import components.map.Map;
import components.map.Map1L;
import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber1L;
import components.set.Set;
import components.set.Set1L;

/**
 * Implementation of the SpellBook component using the OSU API.
 */

public class SpellBook1L implements SpellBook {
    /**
     * The SpellBook1L Component.
     *
     * @convention There are no duplicates in SpellBook
     * @correspondence SpellBook only has spells that is inputted along with
     *                 their associated power levels.
     *
     *
     */
    private Map<String, NaturalNumber> spells;

    /**
     * No-argument constructor.
     *
     * @ensures this is initialized to an empty spellbook
     */
    public SpellBook1L() {
        this.spells = this.createNewRep();
    }

    /**
     * Creates a new empty representation of the map.
     *
     * @return a new empty map
     * @ensures createNewRep = an empty map
     */
    private Map<String, NaturalNumber> createNewRep() {
        return new Map1L<>();
    }

    @Override
    public final void addSpell(String spell, NaturalNumber powerLevel) {
        if (this.spells.hasKey(spell)) {
            this.spells.replaceValue(spell, powerLevel);
        } else {
            this.spells.add(spell, powerLevel);
        }
    }

    @Override
    public final String removeSpell(String spell) {
        String removed = "";
        if (this.spells.hasKey(spell)) {
            this.spells.remove(spell);
            removed = spell;
        }
        return removed;
    }

    @Override
    public final NaturalNumber getPower(String spell) {
        NaturalNumber power = new NaturalNumber1L(0);
        if (this.spells.hasKey(spell)) {
            power = this.spells.value(spell);
        }
        return power;
    }

    @Override
    public final int spellsCount() {
        int count = this.spells.size();
        return count;
    }

    @Override
    public final boolean hasSpell(String spell) {
        boolean has = false;
        if (this.spells.hasKey(spell)) {
            has = true;
        }
        return has;
    }

    @Override
    public final Set<String> allSpells() {
        Set<String> names = new Set1L<>();
        for (Map.Pair<String, NaturalNumber> p : this.spells) {
            names.add(p.key());
        }
        return names;
    }

    @Override
    public final SpellBook newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public final void clear() {
        this.spells = this.createNewRep();
    }

    @Override
    public final void transferFrom(SpellBook spell) {
        assert spell != null : "Violation of: spell is not null";
        assert spell != this : "Violation of: spell is not this";
        assert spell instanceof SpellBook1L : "Violation of: spell is of dynamic type SpellBook1L";

        SpellBook1L other = (SpellBook1L) spell;
        this.spells = other.spells;
        other.spells = other.createNewRep();
    }

    @Override
    public final Map<String, NaturalNumber> spellsAbove(int minPowerLevel) {
        Map<String, NaturalNumber> stronger = new Map1L<>();
        NaturalNumber n = new NaturalNumber1L(minPowerLevel);
        for (Map.Pair<String, NaturalNumber> p : this.spells) {
            if (p.value().compareTo(n) > 0) {
                stronger.add(p.key(), p.value());
            }
        }
        return stronger;
    }
}