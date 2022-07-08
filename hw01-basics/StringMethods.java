public class StringMethods {
	public static void main(String [] arg) {
		String name = "Kevin";
		System.out.println(name);
		
		name = "A" + name.substring(1,name.length() -1) + "Z";
		System.out.println(name);
		
		String url = "www.gatech.edu";
		System.out.println(url);
		
		name = url.substring(url.indexOf(".")+1,url.lastIndexOf("."))+ "1331";
		System.out.println(name);
		
		
	}
}
