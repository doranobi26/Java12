package polymorphism.human;

public class Polymorphism01 {
	public static void main(String[] args) {
        Human human1 = new Student("松村沙友理", 28, 8);
        System.out.println("プロフィールを紹介します。" + human1.getProfile());

        Human human2 = new Employee("原辰徳", 62, "一軍監督");
        System.out.println("プロフィールを紹介します。" + human2.getProfile());
    }

}
