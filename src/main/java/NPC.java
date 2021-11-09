import java.util.ArrayList;

public class NPC extends Person {
    private ArrayList<ItemDestiny> itemsToSell;

    public NPC(String name, double height) {
        super(name, height);
        this.itemsToSell = new ArrayList<>();
    }

    public ArrayList<ItemDestiny> getItemsToSell() {
        return this.itemsToSell;
    }

    public void addItemToSell(String name, double value) {
        ItemDestiny item = new ItemDestiny(name, value);
        this.itemsToSell.add(item);
    }

    public ItemDestiny buyItem(String name) {
        ItemDestiny itemFound = null;

        for (ItemDestiny item : this.itemsToSell) {
            if (item.getName().equals(name)) {
                itemFound = item;
            }
        }

        return itemFound;
    }
}
