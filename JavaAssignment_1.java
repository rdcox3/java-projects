public class JavaAssignment_1{

	public static void main(String[] args) {
	
		String art = """
	 
    J    A   V     V    A  
    J   A A   V   V    A A 
J   J  AAAAA   V V    AAAAA
 J J  A     A   V    A     A 
""";

		for(int i=0; i<art.length(); i++) {
			System.out.print("\u001B[1m" + art.charAt(i));
		}
	}

}



