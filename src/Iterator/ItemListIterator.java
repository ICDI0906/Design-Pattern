package Iterator;
public class ItemListIterator implements ItemIterator<Item>{
	private ItemList itemList;
	public ItemListIterator( ItemList list) {
		this.itemList = list;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return itemList.getItems().iterator().hasNext();
	}

	@Override
	public Item next() {
		// TODO Auto-generated method stub
		return itemList.getItems().iterator().next();
	}

}
