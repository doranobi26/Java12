package classMethod;
import classMethod.human.Human02;

public class ClassMethod02 {
	public static void main(String[] args) {
        Human02 matumura = new Human02();  
        System.out.println("名前は" + matumura.name + "で、年齢は" + matumura.age + "です。");

        Human02 shiraishi = new Human02("白石麻衣", 25); 
        System.out.println("名前は" + shiraishi.name + "で、年齢は" + shiraishi.age + "です。");
    }
	

}
