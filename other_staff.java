import java.util.*;

class other_staff extends staff
{
    int other_staff_salary;
    String other_staff_department;

    void other_staff_getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("staff id ");
        staff_id = sc.nextInt();
        System.out.print("staff name ");
        staff_name = sc.next();
        System.out.print("staff gender ");
        staff_gender = sc.next();
        System.out.print("staff salary ");
        other_staff_salary =  sc.nextInt();
        System.out.print("staff department ");
        other_staff_department =  sc.next();
    }

    void other_staff_display()
    {
        System.out.println(staff_id + "\t\t" + staff_name + "\t\t" + staff_gender + "\t\t" + other_staff_salary + "\t\t" + other_staff_department);
    }
}