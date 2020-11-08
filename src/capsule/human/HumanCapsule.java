package capsule.human;

public class HumanCapsule {
	private String member;
    private int age;

    public HumanCapsule(String member, int age) {
        this.member = member;
        this.age = age;
    }

    public String getName() {
        return this.member;
    }

    public void setName(String member) {
        this.member = member;
    }

    public int getAge() {
        return this.age;
    }

}
