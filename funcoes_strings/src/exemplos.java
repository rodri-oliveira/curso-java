
public class exemplos {

	public static void main(String[] args) {
		
		String original = "abcde FGLI ABC abc DEGF";
		
		String s01 = original.toLowerCase();
		System.out.println(s01);
		
		String s02 = original.toUpperCase();
		System.out.println(s02);
		
		String s03 = original.trim(); // elimina os espaços das extremidades
		System.out.println(s03);
		
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		System.out.println(s04);
		System.out.println(s05);
		
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abcd", "rodrigo");
		System.out.println(s06);
		System.out.println(s07);
		
		int i = original.indexOf("de");
		System.out.println(i);
		
		int j = original.lastIndexOf("bc");
		System.out.println(j);
		
		String s = "potato apple lemon";
		String[] vec = s.split(" ");
		System.out.println(vec[2]);

	}

}
