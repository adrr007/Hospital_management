import java.util.*;

public abstract class Staff extends Person{
    public int id;
	public String name;
	public String gender;
	public int salary;

	public void getData(Scanner sc){
		super.getData(sc);
		
		System.out.print("Salary: ");
		salary = sc.nextInt();
	}

	public void appendData(List<String> data){
        super.appendData(data);

		data.add("₹" + Integer.toString(salary));
	}
}