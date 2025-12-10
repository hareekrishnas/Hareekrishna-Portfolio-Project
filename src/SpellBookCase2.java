import components.naturalnumber.NaturalNumber1L;

public class SpellBookCase2 {
    public static class SpellsCase {

        private SpellBook spells;

        public SpellsCase() {
            this.spells = new SpellBook1L();
        }

        public void learnSpell(String name, int power) {
            assert power >= 0 : "Violation of: power >= 0";
            this.spells.addSpell(name, new NaturalNumber1L(power));
        }

        public void forgetSpell(String name) {
            this.spells.removeSpell(name);
        }

        public int getSpellPower(String name) {
            return this.spells.getPower(name).toInt();
        }

        public void showSpells() {
            System.out.println("Spells: " + this.spells.toString());
        }
    }

    public static void main(String[] args) {
        SpellsCase character = new SpellsCase();

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
