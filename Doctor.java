import java.util.*;

public class Doctor extends Staff{
	public String designation;
	public String qualification;
	public int yearsOfExperience;
	public int roomNo;

	public void getData(Scanner sc){
		super.getData(sc);

		System.out.print("Designation: ");
		designation = sc.next();
		
		System.out.print("Qualification: ");
		qualification = sc.next();
		
		System.out.print("Years of Experience: ");
		yearsOfExperience = sc.nextInt();
		
		System.out.print("Room No: ");
		roomNo = sc.nextInt();
	}

	public void appendData(List<String> data){
        super.appendData(data);
		
		data.add(designation);
		data.add(qualification);
		data.add(Integer.toString(yearsOfExperience));
		data.add(Integer.toString(roomNo));
	}
}