import java.util.*;

class patient
{
    int pat_age,pat_id;
    String pat_name,pat_disease,pat_gender,pat_admit_date;

    void patient_getData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("patient id ");
        pat_id = sc.nextInt();
        System.out.print("patient name ");
        pat_name = sc.next();
        System.out.print("age of patient ");
        pat_age = sc.nextInt();
        System.out.print("patient gender ");
        pat_gender = sc.next();
        System.out.print("disease of patient ");
        pat_disease = sc.next();
        System.out.print("date of admission ");
        pat_admit_date = sc.next();
    }

    void patient_display()
    {
        System.out.println(pat_id + "\t\t" + pat_name + "\t\t" + pat_age + "\t\t" + pat_gender + "\t\t" + pat_disease + "\t\t" + pat_admit_date);
    }
}