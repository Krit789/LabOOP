
/**
 *
 * @author Jarukrit
 */
public class Gryffindor extends Houses implements Magicable {

    public Gryffindor() {
        super("Gryffindor", "RED");
    }

    @Override
    public void attackSpell(Player player, Player target, Spell spell) {
        if (spell.getName().equals("Incendio")) {
            player.setMana(player.getMana() - 4);
        } else if (spell.getName().equals("Expelliarmus")) {
            player.setMana(player.getMana() - 3);
        }
        target.setHP(target.getHP() - (spell.getDamage() + player.getAttackDamage()));
        System.out.println("[" + player.getName() + "]: use spell (" + spell.getName() + ")!");
    }

    @Override
    public void defense(Player player, Player damager) {
        player.setHP(player.getHP() + 3);
        player.setMana(player.getMana() + 4);
        System.out.println("[" + player.getName() + "]: Episkey !");
    }
}
