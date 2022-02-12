public class test{
	public static void main(String[]args){
		System.out.println("ようこそ占いの館へ");
		System.otu.prinln("あなたの名前は？");
		String name = new java.util.Scanner(System.in).nextLine();
		
		System.out.println("年齢は？"）;
		String stringage = new java.util.Scanner(System.in).nextLine();
		
		int age = Integer.parseInt(stringage);
		int fortune = new java.util.Ramdom(System.in).nextInt(4);
		fortune++;
		
		System.out.println("占いの結果が出ました");
		System.out.println(age + "才の" + name + "さん。" + "あなたの運気番号は" + fortune + "です");
	}
}