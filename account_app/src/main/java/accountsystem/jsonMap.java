package accountsystem;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;


public class jsonMap {
	


public static void main (String[] args)  {
	 
	ObjectMapper mapperObj = new ObjectMapper();
	Accountservices hash = new Accountservices();
	   hash.addaccounts(new Accountdetails("bob","dylan","3255" ));
	   hash.addaccounts(new Accountdetails("Mike","Mathers","54545"));
	 
	try {
		String jsonStr = mapperObj.writerWithDefaultPrettyPrinter().writeValueAsString(hash); 
		System.out.println(jsonStr);
	} catch (IOException  e) {
		
		e.printStackTrace();
	
	}
	
	   
	
	
}

}
