import java.util.Scanner;

public class Showroom implements utility {
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stock=0;
    String manager_name;

    @Override
    public void get_details() {
        System.out.println("Showroom_name:"+showroom_name);
        System.out.println("Showroom_address:"+showroom_address);
        System.out.println("Manager_name:"+manager_name);
        System.out.println("Total_employee:"+total_employees);
        System.out.println("Total_cars_in_stock:"+total_cars_in_stock);

    }

    @Override
    public void set_details() {
        Scanner sc=new Scanner(System.in);
        System.out.println("=====================*** ENTER SHOWROOM DETAILS ***=====================");
        System.out.println();
        System.out.print("Showroom_name:");
        showroom_name=sc.nextLine();
        System.out.print("Showroom_address:");
        showroom_address=sc.nextLine();
        System.out.print("Manager_name:");
        manager_name=sc.nextLine();
        System.out.print("Total_employee:");
        total_employees=sc.nextInt();
        System.out.print("Total_cars_in_stock:");
        total_cars_in_stock=sc.nextInt();

    }
}
