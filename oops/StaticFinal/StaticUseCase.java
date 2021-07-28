import java.util.Calendar;

class Student {
    private String rollNumber;
    private String name;
    static int count = 0;

    Student(String name){
        this.name = name;
        this.rollNumber = generateRollNo();
    }

    public String generateRollNo(){
        StringBuilder s = new StringBuilder("Univ-");
        Calendar c = Calendar.getInstance();
        s.append(c.get(c.YEAR));
        s.append("-");
        s.append(++count);
        return s.toString();
    }

    public String getRollNumber(){
        return rollNumber;
    }
    public String getName(){
        return name;
    }
}




public class StaticUseCase {
    public static void main(String[] args){
        Student s1 = new Student("Sachin CV");
        Student s2 = new Student("Suranjan CV");
        System.out.println(s1.getRollNumber());
        System.out.println(s2.getRollNumber());
    }
}
