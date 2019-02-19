package Iterator;
import java.util.ArrayList;
import java.util.List;
public class ItemList {
	private List<Item> items;
	public ItemList() {
		items = new ArrayList<>();
		this.items.add(new Item("zhang",1));
		this.items.add(new Item("kai",2));
	}
	public ItemIterator<Item> iterator(){
		return new ItemListIterator(this);
	}
	public List<Item> getItems() {
		return items;
	}
}
