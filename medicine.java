import java.util.*;

class medicine
{
    String med_name,med_exp_date,med_type;
    int med_cost,med_units;
    void medicine_getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("name ");
        med_name = sc.next();
        System.out.print("cost ");
        med_cost = sc.nextInt();
        System.out.print("units ");
        med_units = sc.nextInt();
        System.out.print("type ");
        med_type = sc.next();
        System.out.print("expiry date ");
        med_exp_date = sc.next();
    }

    void medicine_display()
    {
        System.out.println(med_name + "\t\t" + med_cost + "\t\t" + med_units + "\t\t" + med_type + "\t\t" + med_exp_date);
    }
}
