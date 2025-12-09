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

    @Override
    public final Set<String> allSpells() {
        Set<String> names = new Set1L<>();
        Map<String, NaturalNumber> all = this.spellsAbove(0);
        for (Map.Pair<String, NaturalNumber> p : all) {
            names.add(p.key());
        }
        return names;
    }

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

    @Override
    public final int hashCode() {
        int hash = 1;
        for (String spell : this.allSpells()) {
            hash = 31 * hash + spell.hashCode();
            hash = 31 * hash + this.getPower(spell).toInt();
        }
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        boolean result = false;
        if (this == obj) {
            result = true;
        } else if (obj instanceof SpellBook) {
            SpellBook spell2 = (SpellBook) obj;
            Set<String> spells = this.allSpells();
            Set<String> names = spell2.allSpells();
            result = spells.equals(names);
            if (result) {
                for (String spell : spells) {
                    if (!this.getPower(spell).equals(spell2.getPower(spell))) {
                        result = false;
                    }
                }
            }
        }
        return result;
    }

    @Override
    public final String toString() {
        String result = "{";
        Set<String> names = this.allSpells();
        int i = 0;
        for (String spell : names) {
            result += spell + ": " + this.getPower(spell).toString();
            i++;
            if (i < names.size()) {
                result += ", ";
            }
        }
        result += "}";
        return result;
    }

}