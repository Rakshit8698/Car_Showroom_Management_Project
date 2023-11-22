import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility{
    String emp_id;

    String employee_name;

    int employee_age;


    String  employee_department;

   public void set_details(){
       Scanner sc=new Scanner(System.in);
       UUID uuid=UUID.randomUUID();
       emp_id=String.valueOf(uuid);//it is a class of java
       System.out.println("=====================*** ENTER EMPLOYEE  DETAILS ***=====================");
       System.out.println();
       System.out.print("Employee Name: " );
       employee_name=sc.nextLine();
       System.out.print("Employee age: ");
       employee_age=sc.nextInt();
       sc.nextLine();
       System.out.print("Employee department: ");
       employee_department=sc.nextLine();
       System.out.print("SHOWROOM NAME:");
       showroom_name=sc.nextLine();
    }


    @Override
    public void get_details() {
        System.out.println("Employee_ID: " +emp_id);
       System.out.println("Employee Name: " +employee_name);
       System.out.println("Employee age: "+employee_age);
       System.out.println("Employee department: "+employee_department);
       System.out.println("Showroom Name : "+showroom_name);

    }
}


