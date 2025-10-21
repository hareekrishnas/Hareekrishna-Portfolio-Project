import components.map.Map;
import components.map.Map1L;
import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber1L;

public class SpellBook {
    private Map<String, NaturalNumber> spells = new Map1L<>();

    //No args Constructor
    public SpellBook() {
        this.spells = new Map1L<>();
    }

    //Add Kernel Method
    public final void addSpell(String spellName, NaturalNumber powerLevel) {
        if (this.spells.hasKey(spellName)) {
            this.spells.replaceValue(spellName, powerLevel);
        } else {
            this.spells.add(spellName, powerLevel);
        }
    }

    //Remove Kernel Method; Returns the spell name
    public final String removeSpell(String spell) {
        String str = "";
        if (this.spells.hasKey(spell)) {
            this.spells.remove(spell);
            str = spell;
        }
        return str;
    }

    // getPower Kernel Method; Returns the powerl level of the spell or 0
    //if not found
    public final NaturalNumber getPower(String spell) {
        NaturalNumber powerLevel = new NaturalNumber1L(0);
        if (this.spells.hasKey(spell)) {
            powerLevel = this.spells.value(spell);
        }
        return powerLevel;
    }

    //spellsCount Kernel Method; Returns the number of spells in the SpellBook
    public final int spellsCount() {
        int count = this.spells.size();
        return count;
    }

    //Main Method
    public static void main(String[] args) {
        SpellBook spell = new SpellBook();
        spell.addSpell("Fire", new NaturalNumber1L(10));
        spell.addSpell("Water", new NaturalNumber1L(5));
        spell.addSpell("Rock", new NaturalNumber1L(7));
        //CHeck to see if it replaces the power level for fire spell
        spell.addSpell("Fire", new NaturalNumber1L(6));

        NaturalNumber powerLevel = spell.getPower("Fire");
        //Not letting me do out.print so I will be doing System.out
        System.out
                .println("The power level of the fire spell is: " + powerLevel);

        NaturalNumber powerLevel2 = spell.getPower("Water");
        //Not letting me do out.print so I will be doing System.out
        System.out.println(
                "The power level of the water spell is: " + powerLevel2);

        NaturalNumber powerLevel3 = spell.getPower("Rock");
        //Not letting me do out.print so I will be doing System.out
        System.out.println(
                "The power level of the rock spell is: " + powerLevel3);

        String removeSpell = spell.removeSpell("Rock");
        System.out.println("The removed spell is: " + removeSpell);

        int countSpells = spell.spellsCount();
        System.out.println(
                "The number of current Spellbook spells are: " + countSpells);

        NaturalNumber power = spell.getPower("Fire");
        System.out.println("The power level of the fire spell is: " + power);
    }
}
