package Iterator;

public class test {
	public static void main(String args[]) {
		ItemIterator<Item> iterator =  new ItemList().iterator();
		System.out.println(iterator.next());
	}
}
