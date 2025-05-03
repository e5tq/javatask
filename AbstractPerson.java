package tb課題;

public abstract class AbstractPerson {
 public abstract String getGender();

 public void speak() {
     if ("Man".equals(getGender())) {
         System.out.println("I'm a man");
     } else if ("Woman".equals(getGender())) {
         System.out.println("I'm a woman");
     }
 }
}