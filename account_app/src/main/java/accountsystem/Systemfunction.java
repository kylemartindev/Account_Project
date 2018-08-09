package accountsystem;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
public class Systemfunction {
	private Accountservices program;
	
	public  Systemfunction() {
		
		ObjectMapper mapperObj = new ObjectMapper();
		program = new Accountservices();
	    program.addaccounts(new Accountdetails("bob","dylan","3255" ));
		program.addaccounts(new Accountdetails("Mike","Mathers","54545"));
		try {
			String jsonStr = mapperObj.writerWithDefaultPrettyPrinter().writeValueAsString(program); 
			System.out.println(jsonStr);
		} catch (IOException  e) {
			
			e.printStackTrace();
		
		}
		
		
	  
		
	}
	public void printbyKey(String key) {
		ObjectMapper mapperObj = new ObjectMapper();
		Accountdetails accountd = program.getAccount();
		try {
			String jsonStr = mapperObj.writerWithDefaultPrettyPrinter().writeValueAsString(accountd); 
			System.out.println(jsonStr);
		} catch (IOException  e) {
			
			e.printStackTrace();
		
		}
		
		
		
	}


	
	public static void main (String[] args) {
		
	new Systemfunction().printbyKey("2");
		
		
	
		
	}

}
