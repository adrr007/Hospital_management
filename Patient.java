import java.util.*;

public class Patient extends Person{
    public int ageInYears;
	public String disease;
	public String admissionDate;

    public void getData(Scanner sc){
		super.getData(sc);

        System.out.print("Age: ");
        ageInYears = sc.nextInt();
		
		System.out.print("Disease: ");
        disease = sc.next();
		
		System.out.print("Admission Date: ");
		admissionDate = sc.next();
    }

	public void appendData(List<String> data){
        super.appendData(data);

		data.add(Integer.toString(ageInYears));
		data.add(disease);
		data.add(admissionDate);
	}
}