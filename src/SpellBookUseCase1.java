import components.map.Map.Pair;
import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber1L;

public class SpellBookUseCase1 {
    public static void main(String[] args) {
        SpellBook book = new SpellBook1L();

        book.addSpell("Fire", new NaturalNumber1L(10));
        book.addSpell("Ice", new NaturalNumber1L(25));
        book.addSpell("Wind", new NaturalNumber1L(40));

        System.out.println("All spells: " + book.allSpells());
        System.out.println("SpellBook toString: " + book.toString());

        SpellBook strongSpells = new SpellBook1L();
        for (Pair<String, NaturalNumber> p : book.spellsAbove(20)) {
            strongSpells.addSpell(p.key(), p.value());
        }

        System.out.println(
                "Spells with power above 20: " + strongSpells.toString());

        book.removeSpell("Ice");
        System.out.println("After removing Ice: " + book.toString());
    }
}
