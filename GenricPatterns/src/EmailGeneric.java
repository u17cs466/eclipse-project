import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);  
	        while (true) {     
	            //Pattern pattern = Pattern.compile("[a-zA-Z0-9]{11}");
	        	Pattern pattern = Pattern.compile("(?=.*[a-z])(?=.*\\d)(?=.*[@#$%])(?=.*[A-Z]){6,16}");
	            System.out.println("Enter password:");  
	            Matcher matcher = pattern.matcher(sc.nextLine());    
	            boolean found = false;    
	            while (matcher.find()) {    
	                   
	                found = true; 
	            }   
	           
	            if(!found){ 
	            	 System.out.println("password is not matched try anagin");
	            	 
	                  
	            }else {
	            	
	            	 System.out.println("password is match you can login");
	            	 
	            }
	           
	           
	        }
	}

}
