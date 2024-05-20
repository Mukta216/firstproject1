
public class Method_calling {
	public static void main(String[] args) {

		Method_calling m = new Method_calling();
		m.go();
		/*
		 * m.go1(); m.go2();
		 * 
		 * go(); go1(); go2(); go3();
		 */
	}

	public void go() {
		System.out.println("inside go method");
		go2();
		System.out.println("after calling go1 method");
	}

		
		  public void go1() { System.out.println("inside go1 method"); go();
		  System.out.println("after calling go method"); }
			 
		  public void go2() { System.out.println("inside go2 method"); go3();
		  System.out.println("after calling go3 method"); }
		  
		  public void go3() { System.out.println("inside go3 method"); go2();
		  System.out.println("after calling go2 method"); }
		 
		 
}
