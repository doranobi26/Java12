package extend.animal;

public class Dog extends Animal {
	public Dog() {
        this.name = "ドーベルマン";
    }

    public void cry() {
        System.out.println(this.name + "が吠えました。ワン！ワン！");
    }

}
