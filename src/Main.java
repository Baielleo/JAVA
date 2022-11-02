import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Student student=new Student();
student.id=1;
student.fullName="Dastan Akbaraliev";
student.age=20;
student.group="Java 8-ewening";
Student student1=new Student();
student.id=2;
student1.fullName="Kanaibek uulu Baiel";
student1.age=20;
student1.group="Java 8-ewening";
Student student2=new Student();
student2.id=3;
student2.fullName="Amangeldieva Ainazik";
student2.age=18;
student2.group="Java 8-ewening";
Student student3=new Student();
student3.id=4;
student3.fullName="Janybekov Arun";
student3.age=19;
student3.group="Java 8-dey";
 Student student4=new Student();
student4.id=5;
student4.fullName="Madina Halikova";
student4.age=17;
student4.group="Java 8-dey";
        System.out.println("ID jazynyz  :");
        Scanner scanner=new Scanner(System.in);
        byte at=scanner.nextByte();
        switch (at)
        {case 1:
            System.out.println(at+"\n"+student.fullName
            +"\n"+student.age+"\n"+student.group);
            case 2:
                System.out.println(at+"\n"+student1.fullName
               +"\n"+ student1.age +"\n"+student1.group);
                break;
            case 3:
                System.out.println(at+"\n"+student2.fullName
                        +"\n"+ student2.age +"\n"+student2.group);
                break;
            case 4:
                System.out.println(at+"\n"+student3.fullName
                        +"\n"+ student3.age +"\n"+student3.group);
                break;
            case 5:
                System.out.println(at+"\n"+student4.fullName
                        +"\n"+ student4.age +"\n"+student4.group);
        }

    }
}