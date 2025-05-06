package tb課題;

public class Person {
	public enum Gender {
		MAN, WOMAN
	}

	private Gender gender;

	public Person(Gender gender) {
		this.gender = gender;
	}

	public void speak() {
		if (gender == Gender.MAN) {
			System.out.println("I'm a man");
		} else if (gender == Gender.WOMAN) {
			System.out.println("I'm a woman");
		}
	}

	public static void main(String[] args) {
		Person man = new Person(Gender.MAN);
		Person woman = new Person(Gender.WOMAN);

		man.speak();
		woman.speak();
	}
}