import java.util.regex.Pattern;  
import java.util.Scanner;  
import java.util.regex.Matcher;    
public class GenricCode{    
    public static void main(String[] args){    
        Scanner sc=new Scanner(System.in);  
        while (true) {    
            Pattern pattern = Pattern.compile("[a-zA-Z0-9]{11}");
            System.out.println("Enter password:");  
            Matcher matcher = pattern.matcher(sc.nextLine());    
            boolean found = false;    
            while (matcher.find()) {    
                System.out.println("password is match you can login");    
                found = true; 
                //System.out.println(exit(0));
            }    
            if(!found){    
                System.out.println("password is not matched try anagin");    
            }    
        }    
    }

	private static char[] exit(int i) {
		// TODO Auto-generated method stub
		return null;
	}    
}    