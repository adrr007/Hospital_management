import java.util.*;

class doctor extends staff
{
    public String doctor_designation;
    public int doctor_fees;
    public int doctor_experience;

    void staff_getData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("staff id ");
        staff_id = sc.nextInt();
        System.out.print("staff name ");
        staff_name = sc.next();
        System.out.print("staff gender ");
        staff_gender = sc.next();
        System.out.print("staff designation ");
        doctor_designation= sc.next();
        System.out.print("doctor fees per visit ");
        doctor_fees = sc.nextInt();
        System.out.print("staff years of experience ");
        doctor_experience = sc.nextInt();
    }

    void staff_display()
    {
        System.out.println(staff_id + "\t\tDr." + staff_name + "\t\t" + staff_gender + "\t\t" + doctor_experience + "\t\t" + doctor_fees + "\t\t" +  doctor_designation);
    }
}
