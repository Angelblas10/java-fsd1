package email;
import java.util.regex.*;    
public class Emailvalidation {
		import java.util.*; 
		 public static void main(String args[]){ 
			        ArrayList<String> emails = new ArrayList<String>();  
			        emails.add("ria@gmail.co.in");  
			        emails.add("banu@gmail.com");  
			        emails.add("renu#@gmail.co.in");    
			        emails.add("@yahoo.com");  
			        emails.add("kavi#gmail.com");    
			        String regex = "^(.+)@(.+)$";   
			        Pattern pattern = Pattern.compile(regex);    
			        for(String email : emails){  
			            Matcher matcher = pattern.matcher(email);  
			            System.out.println(email +" : "+ matcher.matches()+"\n");  
			        } 
}
