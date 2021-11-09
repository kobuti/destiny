import java.util.ArrayList;

public class Guardian extends Person {
    private String klass;
    private ArrayList<ItemDestiny> itemsOwned;

    public Guardian(String name, double height, String klass) {
        super(name, height);

        this.klass = klass;
        this.itemsOwned = new ArrayList<ItemDestiny>();
    }

    // Getter
    public String getKlass() {
        return this.klass;
    }

    public ArrayList<ItemDestiny> getItemsOwned() {
        return this.itemsOwned;
    }

    public void addItemOwned(ItemDestiny item) {
        this.itemsOwned.add(item);
    }
}
