package practice;

public class Chapter12 {
	public static void main(String[] args) {
        NoCapsuleMan woman = new NoCapsuleMan("松村沙友理", 28);
        System.out.println("名前は" + woman.name +  "です。");
        System.out.println("年齢は" + woman.age + "です。");
        woman.age = 28;
        System.out.println("誕生日を迎えたので、年齢が" + woman.age + "になりました。");
    }

}
