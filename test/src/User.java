import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob;
    public void doSomething(){
        System.out.println("Hello "+this.name+" who was born on "+this.dob+"!");
    }
    public User(){
        //this(null,LocalDate.now().getYear(),LocalDate.now().getMonthValue(),LocalDate.now().getDayOfMonth());
        this.name = null;
        this.dob = LocalDate.now();
    }
    public User(String name,int year,int month,int day){
        this.name = name;
        this.dob = LocalDate.of(year,month,day);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
            this.name = name;
    }
    public LocalDate getDate(){
        return dob;
    }
    public void setDate(int year,int month,int day){
        this.dob = LocalDate.of(year,month,day);
    }
}
