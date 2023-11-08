package Expiriance;

public class static_nonstatic {
 static int a=20;
        float b=30;
	public static void main(String[] args) {
		System.out.println(a);
		
		// non static
		static_nonstatic obj = new static_nonstatic();
		System.out.println(obj.b);
		

	}

}
