
package midtermreviewcodeforpartc;


public class PasswordValidator {
  
    public static void validPassword(String password){
        boolean validPassword=false;
        while(!validPassword)
        {
                                  
            int specialCharCount=0;
            
            for(int i=0;i<password.length(); i++)
            {
                if(!(Character.isLetterOrDigit(password.charAt(i))))
                {
                    specialCharCount++;
                    
                }
            }
            if(specialCharCount>0 &&password.length()>7)
            {
                validPassword=true;
            }
        }
        
    }
    
}
