import java.util.*;

class lab
{
    String lab_facility,lab_status;
    int lab_cost,lab_room_no,lab_seat;
    void lab_getData()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("facility ");
        lab_facility = sc.next();
        System.out.print("status ");
        lab_status = sc.next();
        System.out.print("cost ");
        lab_cost = sc.nextInt();
        System.out.print("room ");
        lab_room_no = sc.nextInt();
    }
    void lab_display()
    {
        System.out.println(lab_facility + "\t\t" + lab_cost + "\t\t" + lab_seat + "\t\t" + lab_room_no + "\t\t" + lab_status);
    }
}
