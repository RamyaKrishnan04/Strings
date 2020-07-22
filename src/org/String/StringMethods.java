package org.String;

public class StringMethods {

	public static void main(String[] args) {
		String d = "  ";
		int length =d.length();
		System.out.println(length);
		int l= d.lastIndexOf("o");
		System.out.println(l);
		int k= d.indexOf("o");
		System.out.println(k);
		boolean h = d.isEmpty();
		System.out.println(h);
		char c  = d.charAt(4);
		System.out.println(c);
		boolean f = d.startsWith("Greens");
		System.out.println(f);
		boolean h1 = d.endsWith("lgy");
		System.out.println(h1);
		boolean p = d.equals("GreensTechnology");
		System.out.println(p);
		boolean t = d.contains("e");
		System.out.println(t);
		String trim = d.trim();
		System.out.println(trim);
		String tr = d.toLowerCase();
		System.out.println(tr);
		String tri = d.toUpperCase();
		System.out.println(tri);
		String y = d.substring(0,6);
		System.out.println(y);
		String e = d.replace("e","#");
		System.out.println(e);
		boolean x = d.equalsIgnoreCase("GreensTechnology");
		System.out.println(x);
		String n = trim.toLowerCase();
		System.out.println(n);
		int m = d.compareToIgnoreCase();
		System.out.println(m);
		
		
		
		
		
	}
	
	
}
