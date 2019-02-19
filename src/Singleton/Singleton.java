package Singleton;
public class Singleton {
	private static Singleton instance;
    private Singleton(){}
    public static Singleton getIntance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
    public static void main(String args[]) {
    	Singleton.getIntance();
    }
}