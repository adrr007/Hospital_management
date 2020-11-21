import java.util.*;

public class Lab extends Printable{
    public String facility;
    public String status;
    public int cost;
    public int roomNo;

    public void getData(Scanner sc){
        System.out.print("Facility: ");
        facility = sc.next();
        
        System.out.print("Status: ");
        status = sc.next();
        
        System.out.print("Cost: ");
        cost = sc.nextInt();
        
        System.out.print("Room No: ");
        roomNo = sc.nextInt();
    }

	public void appendData(List<String> data){
        super.appendData(data);

		data.add(facility);
		data.add(status);
		data.add(Integer.toString(cost));
		data.add(Integer.toString(roomNo));
	}
}