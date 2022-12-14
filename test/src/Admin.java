import java.time.LocalDate;

public class Admin extends User{
    @Override
    public void doSomething() {
        doSomething(1);
    }

    public void doSomething(int count) {
        while (count >= 1) {
            System.out.println("Hello admin " + super.getName() + "!");
            count = count -1;
        }
    }
    public void doExtra(){
        if(LocalDate.now().equals(super.getDate())){
            System.out.println("Happy birthday Admin!");
        }
    }
}
