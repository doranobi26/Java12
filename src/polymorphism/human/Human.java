package polymorphism.human;

public class Human {
	private String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    final public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getProfile() {
        return "メンバーの名前は" + this.name + "です。年齢は" + this.age + "です。";
    }

}
