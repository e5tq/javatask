package tb課題;

public class GenderSpeaker {
    public static void main(String[] args) {
        AbstractPerson man = new Man();
        AbstractPerson woman = new Woman();

        doSpeak(man);
        doSpeak(woman);
    }

    static void doSpeak(AbstractPerson person) {
        person.speak();
    }
}