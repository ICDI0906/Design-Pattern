package Singleton;
import java.io.*;
/*
 * 保证序列化和反序列化之后是一个单例,关键是实现readResolve()方法
 */
@SuppressWarnings("serial")
public class SerializableSingleton  implements Serializable{
	private static class InnerClassSingletonHandler{
		private static SerializableSingleton instance = new SerializableSingleton();
	}
	private SerializableSingleton() {
		
	}
	public static SerializableSingleton getInstance() {
		return InnerClassSingletonHandler.instance;
	}
	protected Object readResolve() {
		return InnerClassSingletonHandler.instance;
	}
	public static void main(String args[]) {
		SerializableSingleton singleton = SerializableSingleton.getInstance();
		File file = new File("test.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			try {
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(singleton);
				fos.close();
				oos.close();
				System.out.println(singleton.hashCode());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream(file);
			try {
				ObjectInputStream ois = new ObjectInputStream(fis);
				try {
					SerializableSingleton ss = (SerializableSingleton) ois.readObject();
					System.out.println(ss.hashCode());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fis.close();
				ois.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
