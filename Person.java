import java.util.*;

public abstract class Person extends Printable{
    public int id;
	public String name;
	public String gender;

	public void getData(Scanner sc){
		System.out.print("Id: ");
		id = sc.nextInt();
		
		System.out.print("Name: ");
		name = sc.next();
		
		System.out.print("Gender: ");
		gender = sc.next();
	}

	public void appendData(List<String> data){
		super.appendData(data);
		
		data.add(Integer.toString(id));
		data.add(name);
		data.add(gender);
	}
}