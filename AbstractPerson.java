package tb課題;

abstract class AbstractPerson {
	abstract String getGender();

	public void speak() {
		if (getGender().equals("Man")) {
			System.out.println("I'm a man");
		} else if (getGender().equals("Woman")) {
			System.out.println("I'm a woman");
		}
	}
}

class Man extends AbstractPerson {
	@Override
	public String getGender() {
		return "Man";

	}
}

class Woman extends AbstractPerson {
	@Override
	public String getGender() {
		return "Woman";
	}
}
