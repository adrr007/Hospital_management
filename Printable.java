import java.util.*;

public abstract class Printable{
	public List<String> getDataList(){
		List<String> data = new ArrayList<>();
		appendData(data);
		return data;
	}

	public void appendData(List<String> data){
		
	}

	public String toString(){
		String data = "";
		for(String s:getDataList())
			data += s + "\t";

		return data.trim();
	}
}