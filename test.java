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
		
		String food = "おにぎり";
	    int isHungry = 1;
	    System.out.println("こんにちは");
	    
	    if(isHungry == 0){
	       System.out.println("満腹です。");
	    }
	    else{
	        System.out.println("お腹が空きました。");
	        System.out.println(food + "を食べます。");
	    }
	    System.out.println("ごちそうさまでした");
	    
	    System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更");
	    int selected = new java.util.Scanner(System.in).nextInt();
	    
	    switch(selected){
	        case 1:
	            System.out.println("検索します");
	            break;
	        case 2:
	            System.out.println("登録します");
	            break;
	        case 3:
	            System.out.println("削除します");
	            break;
	        case 4:
	            System.out.println("変更します");
	            break;
	    }
System.out.println("数当てゲーム");
	    
	    int ans = new java.util.Random().nextInt(10);
	    
	    for(int i = 0; i < 5; i++){
	        System.out.println("０〜９の好きな数字を入力してね。ゲーム回数は5回だよ");
	        int num = new java.util.Scanner(System.in).nextInt();
	            if(num == ans){
	            System.out.println("アタリ");
	            System.out.println("お疲れさま。これで終わりだよ");
	            break;
	            }
	            else{ 
	            System.out.println("ハズレ");
	            System.out.println("残念！もう一回！");
	            }
	}
}