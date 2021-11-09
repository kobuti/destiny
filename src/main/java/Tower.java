import sun.security.x509.OtherName;

public class Tower {
    public static void main(String[] args) {
        NPC npc = new NPC("Banshee", 1.80);
        npc.addItemToSell("Fome Voraz", 200);
        npc.addItemToSell("Promessa Terrível", 260);

        ItemDestiny item = npc.buyItem("Vex Mitoclasta");

        Guardian guardian = new Guardian("timber", 1.75, "Titan");
        System.out.println(guardian.getItemsOwned());
        guardian.addItemOwned(item);

        for (ItemDestiny itemowned : guardian.getItemsOwned()) {
            System.out.println(itemowned.getName());
        }
    }
}
