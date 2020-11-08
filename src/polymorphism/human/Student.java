package polymorphism.human;

public class Student extends Human {
	private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public String getProfile() {
        String profile = "年齢は" + super.age + "です。";
        profile += "乃木坂４６の中で人気のランキングは" + this.score + "位です。";
        return profile;
    }

}
