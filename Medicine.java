import java.util.*;

public class Medicine extends Printable{
	public String name;
	public String expiryDate;
	public String type;
	public int cost;
	public int units;

    public void getData(Scanner sc){
        System.out.print("name ");
        name = sc.next();
		
		System.out.print("cost ");
        cost = sc.nextInt();
		
		System.out.print("units ");
        units = sc.nextInt();
		
		System.out.print("type ");
        type = sc.next();
		
		System.out.print("expiry date ");
        expiryDate = sc.next();
    }

	public void appendData(List<String> data){
        super.appendData(data);

		data.add(name);
		data.add(expiryDate);
		data.add(type);
		data.add(Integer.toString(cost));
		data.add(Integer.toString(units));
	}
}