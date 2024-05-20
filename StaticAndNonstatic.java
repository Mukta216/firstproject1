
public class StaticAndNonstatic {
	public static int q=200;// global static var
	public int p=100;//global non static var 
	
	//static fun
	public static void first_fun() {
		int abc=20;//local var to this static fun
	}
	//non static fun
	public void second_fun() {
		int xyz=100;// local var to this non static fun
	}
	/*
	 * public static void main(String[] args) { System.out.println("hiii"); }
	 */
}
