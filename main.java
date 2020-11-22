import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n----------------------------------------------------------------------------------------------------------------");
        System.out.println("                                     *** Welcome to BHAKTI VEDANTA Hospital***                                    ");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        staff s[] = new staff[10];
        doctor d[] = new doctor[10];
        other_staff o[] = new other_staff[10];
        patient p[] = new patient[10];
        medicine m[] = new medicine[10];
        lab l[] = new lab[10];

        for(int i=0;i<10;i++)
        s[i] = new staff();
        for(int i=0;i<10;i++)
        d[i] = new doctor();
        for(int i=0;i<10;i++)
        o[i] = new other_staff();
        for(int i=0;i<10;i++)
        p[i] = new patient();
        for(int i=0;i<10;i++)
        m[i] = new medicine();
        for(int i=0;i<10;i++)
        l[i] = new lab();

        
        d[0].staff_id=1;
        d[0].staff_name="Ram";
        d[0].staff_gender="male"; 
        d[0].doctor_designation="ENT"; 
        d[0].doctor_experience=5;
        d[0].doctor_fees = 300;
        d[1].staff_id=2;
        d[1].staff_name="Om";
        d[1].staff_gender="male"; 
        d[1].doctor_designation="cardiologist";
        d[1].doctor_experience=2;
        d[1].doctor_fees = 900;
        d[2].staff_id=3;
        d[2].staff_name="Rita";
        d[2].staff_gender="female"; 
        d[2].doctor_designation="neurologist"; 
        d[2].doctor_experience=8;
        d[2].doctor_fees =450;
        d[3].staff_id=4;
        d[3].staff_name="Kher";
        d[3].staff_gender="male"; 
        d[3].doctor_designation="physian"; 
        d[3].doctor_experience=2;
        d[3].doctor_fees = 200;
        d[4].staff_id=5;
        d[4].staff_name="Lisa";
        d[4].staff_gender="female"; 
        d[4].doctor_designation="dermatologist"; 
        d[4].doctor_experience=13;
        d[4].doctor_fees = 700;


        o[0].staff_id=1;
        o[0].staff_name="Ram";
        o[0].staff_gender="male"; 
        o[0].other_staff_salary = 2000;
        o[0].other_staff_department = "ward staff";
        o[1].staff_id=2;
        o[1].staff_name="Roshni";
        o[1].staff_gender="female"; 
        o[1].other_staff_salary = 3000;
        o[1].other_staff_department = "reception";
        o[2].staff_id=3;
        o[2].staff_name="Keshav";
        o[2].staff_gender="male"; 
        o[2].other_staff_salary = 1500;
        o[2].other_staff_department = "security";
        o[3].staff_id=4;
        o[3].staff_name="Diya";
        o[3].staff_gender="female"; 
        o[3].other_staff_salary = 4500;
        o[3].other_staff_department = "nurse";
        o[4].staff_id=5;
        o[4].staff_name="Saish";
        o[4].staff_gender="male"; 
        o[4].other_staff_salary = 3000;
        o[4].other_staff_department = "lab assistant";

        p[0].pat_id=1;
        p[0].pat_age=34;
        p[0].pat_name="riya";
        p[0].pat_disease="viral";
        p[0].pat_gender="female";
        p[0].pat_admit_date="30/4/2020";
        p[1].pat_id=2;
        p[1].pat_age=52;
        p[1].pat_name="anup";
        p[1].pat_disease="cancer";
        p[1].pat_gender="male";
        p[1].pat_admit_date="15/3/2020";
        p[2].pat_id=3;
        p[2].pat_age=50;
        p[2].pat_name="Arjun";
        p[2].pat_disease="dengue";
        p[2].pat_gender="male";
        p[2].pat_admit_date="1/9/2020";
        p[3].pat_id=4;
        p[3].pat_age=20;
        p[3].pat_name="Rupali";
        p[3].pat_disease="Covid";
        p[3].pat_gender="female";
        p[3].pat_admit_date="18/10/2020";
        p[4].pat_id=5;
        p[4].pat_age=41;
        p[4].pat_name="Sagar";
        p[4].pat_disease="Malaria";
        p[4].pat_gender="male";
        p[4].pat_admit_date="3/11/2020";

        m[0].med_name="Amino";
        m[0].med_exp_date="12/3/2021";
        m[0].med_type="tablet";
        m[0].med_cost=30;
        m[0].med_units=12;
        m[1].med_name="digene";
        m[1].med_exp_date="10/5/2022";
        m[1].med_type="syrup";
        m[1].med_cost=150;
        m[1].med_units=15;
        m[2].med_name="coronil";
        m[2].med_exp_date="2/6/2021";
        m[2].med_type="powder";
        m[2].med_cost=350;
        m[2].med_units=12;
        m[3].med_name="Ambien";
        m[3].med_exp_date="15/10/2023";
        m[3].med_type="tablet";
        m[3].med_cost=190;
        m[3].med_units=9;
        m[4].med_name="Diamox";
        m[4].med_exp_date="29/12/2022";
        m[4].med_type="syrup";
        m[4].med_cost=870;
        m[4].med_units=5;

        l[0].lab_facility="Sonography";
        l[0].lab_status="available";
        l[0].lab_cost=3000;
        l[0].lab_room_no=101;
        l[0].lab_seat=23;
        l[1].lab_facility="Chemotherapy";
        l[1].lab_status="full";
        l[1].lab_cost=3000;
        l[1].lab_room_no=102;
        l[1].lab_seat=25;
        l[2].lab_facility="Radiology";
        l[2].lab_status="available";
        l[2].lab_cost=900;
        l[2].lab_room_no=103;
        l[2].lab_seat=5;
        l[3].lab_facility="Pathology";
        l[3].lab_status="full";
        l[3].lab_cost=2500;
        l[3].lab_room_no=104;
        l[3].lab_seat=7;
        l[4].lab_facility="OP theatre";
        l[4].lab_status="available";
        l[4].lab_cost=600;
        l[4].lab_room_no=105;
        l[4].lab_seat=30;
 

        Scanner sc = new Scanner(System.in);
        int op;
        do
        {
         System.out.println("------------------------------------------------------------------------------------------------------------");
         System.out.println("                                           **MAIN MENU**                                                    ");
         System.out.println("------------------------------------------------------------------------------------------------------------");
         System.out.println("1.Staff  2. Patients  3.Medicines  4.Laboratories 5.Exit");
         System.out.print("enter your choice ");
         op = sc.nextInt();
         switch(op)
         {
             case 1:
             System.out.println("---------------------------------------------------------------------------------------------------------");
             System.out.println("                                               **STAFF SECTION**                                         ");
             System.out.println("---------------------------------------------------------------------------------------------------------");
             System.out.println("1.Doctors  2. Other staff ");
             System.out.print("enter your choice ");
             Scanner lo = new Scanner(System.in);
             int ch = lo.nextInt();
             switch(ch)
             {
             case 1:
             System.out.println("---------------------------------------------------------------------------------------------------------");
             System.out.println("                                                **DOCTOR SECTION**                                       ");
             System.out.println("---------------------------------------------------------------------------------------------------------"); 
             System.out.println("1.Check Existing  2. Add new ");
             System.out.print("enter your choice ");
             Scanner in = new Scanner(System.in);
             int choice = in.nextInt();
             switch(choice)
             {
                 case 1: 
                 System.out.println("id" + "\t\t" + "name" + "\t\t" + "gender" + "\t\t" + "exp" + "\t\t" + "fees" + "\t\t" +  "designation");
                 System.out.println("------------------------------------------------------------------------------------------------------------");
                 for(int i=0;i<10;i++)
                 {
                     d[i].staff_display();
                 }
                 break;                      
                 case 2:
                 System.out.print("enter number of details to be uploaded (max 5) ");
                 Scanner on = new Scanner(System.in);
                 int x = on.nextInt();
                 for(int i=0;i<x;i++)
                 {
                     d[i+5].staff_getData();
                 }
                  System.out.println("id" + "\t\t" + "name" + "\t\t" + "gender" + "\t\t" + "exp" + "\t\t" + "fees" + "\t\t" +  "designation");
                  System.out.println("------------------------------------------------------------------------------------------------------------");
                  for(int i=0;i<x;i++)
                 {
                     d[i+5].staff_display();
                 }
                 break;
                }
                break;
              case 2:
             System.out.println("-----------------------------------------------------------------------------------------------------------------");
             System.out.println("                                              **OTHER STAFF SECTION**                                            ");
             System.out.println("-----------------------------------------------------------------------------------------------------------------");
             System.out.println("1.Check Existing  2. Add new ");
             System.out.print("enter your choice ");
             Scanner ds = new Scanner(System.in);
             int cha = ds.nextInt();
             switch(cha)
             {
                 case 1: 
                 System.out.println("id" + "\t\t" + "name" + "\t\t" + "gender" + "\t\t" + "salary" + "\t\t" + "department");
                 System.out.println("--------------------------------------------------------------------------------");
                 for(int i=0;i<10;i++)
                 {
                     o[i].other_staff_display();
                 }
                 break;                      
                 case 2:
                 System.out.print("enter number of details to be uploaded (max 5) ");
                 Scanner on = new Scanner(System.in);
                 int x = on.nextInt();             
                 for(int i=0;i<x;i++)
                 {
                     o[i+5].other_staff_getData();
                 }
                 System.out.println("id" + "\t\t" + "name" + "\t\t" + "gender" + "\t\t" + "salary" + "\t\t" + "department");
                 System.out.println("--------------------------------------------------------------------------------");
                 for(int i=0;i<x;i++)
                 {
                     o[i+5].other_staff_display();
                 }
                 break;
              }
               break;      
            }
             break;
             case 2:
             System.out.println("--------------------------------------------------------------------------------");
             System.out.println("                      **PATIENT SECTION**                                       ");
             System.out.println("--------------------------------------------------------------------------------");
             System.out.println("1.Check Existing  2. Add new ");
             System.out.print("enter your choice ");
             Scanner sh = new Scanner(System.in);
             int choice1 = sh.nextInt();
             switch(choice1)
             {
                 case 1: 
                 System.out.println("id" + "\t\t" + "name" + "\t\t" + "age" + "\t\t" + "gender" + "\t\t" + "disease" + "\t\t" + "admit date");
                 System.out.println("--------------------------------------------------------------------------------------------------");
                 for(int i=0;i<10;i++)
                 {
                     p[i].patient_display();
                 }
                 break;
                 case 2:
                 System.out.print("enter number of details to be uploaded (max 5) ");
                 Scanner ro = new Scanner(System.in);
                 int x = ro.nextInt(); 
                 for(int i=0;i<x;i++)
                 {
                     p[i+5].patient_getData();
                 }
                 System.out.println("id" + "\t\t" + "name" + "\t\t" + "age" + "\t\t" + "gender" + "\t\t" + "disease" + "\t\t" + "admit date");
                 System.out.println("--------------------------------------------------------------------------------------------------");
                 for(int i=0;i<x;i++)
                 {
                     p[i+5].patient_display();
                 }
                 break;
               }
             break;
             case 3:
             System.out.println("--------------------------------------------------------------------------------");
             System.out.println("                      **MEDICINE SECTION**");
             System.out.println("--------------------------------------------------------------------------------");
             System.out.println("1.Check Existing  2. Add new ");
             System.out.print("enter your choice ");
             Scanner mo = new Scanner(System.in);
             int choice2 = mo.nextInt();
             switch(choice2)
             {
                 case 1: 
                 System.out.println("name" + "\t\t" + "cost" + "\t\t" + "units" + "\t\t" + "type" + "\t\t" + "expiry_date");
                 System.out.println("--------------------------------------------------------------------------------");
                 for(int i=0;i<10;i++)
                 {
                     m[i].medicine_display();
                 }
                 break;
                 case 2:
                 System.out.print("enter number of details to be uploaded (max 5) ");
                 Scanner ik = new Scanner(System.in);
                 int x = ik.nextInt(); 
                 for(int i=0;i<x;i++)
                 {
                     m[i+5].medicine_getData();
                 }
                 System.out.println("name" + "\t\t" + "cost" + "\t\t" + "units" + "\t\t" + "type" + "\t\t" + "expiry_date");
                 System.out.println("--------------------------------------------------------------------------------");
                 for(int i=0;i<x;i++)
                 {
                     m[i+5].medicine_display();
                 }
                 break;
                }
             break;
             case 4:
             System.out.println("--------------------------------------------------------------------------------");
             System.out.println("                      **LABORATORY SECTION**");
             System.out.println("--------------------------------------------------------------------------------");
             System.out.println("1.Check Existing  2. Add new ");
             System.out.print("enter your choice ");
             Scanner po = new Scanner(System.in);
             int choice3 = po.nextInt();
             switch(choice3)
             {
                 case 1: 
                 System.out.println("facility" + "\t\t" + "cost" + "\t\t" + "seats" + "\t\t" + "room no" + "\t\t" + "status");
                 System.out.println("----------------------------------------------------------------------------------------");
                 for(int i=0;i<10;i++)
                 {
                     l[i].lab_display();
                 }
                 break;
                 case 2:
                 System.out.print("enter number of details to be uploaded (max 5) ");
                 Scanner we = new Scanner(System.in);
                 int x = we.nextInt(); 
                 for(int i=0;i<x;i++)
                 {
                     l[i+5].lab_getData();
                 }
                 System.out.println("facility" + "\t\t" + "cost" + "\t\t" + "seats" + "\t\t" + "room no" + "\t\t" + "status");
                 System.out.println("-------------------------------------------------------------------------------------------");
                 for(int i=0;i<x;i++)
                 {
                     l[i+5].lab_display();
                 }
                 break;
               }
             break;
             case 5:
             System.out.println("the program is terminated");
            }
        }
        while(op!=5);
    }
}