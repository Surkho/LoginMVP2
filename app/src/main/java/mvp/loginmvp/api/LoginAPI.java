package mvp.loginmvp.api;

/**
 * Created by juanj on 08/03/2017.
 */

public class LoginAPI {
    private final String userName = "username";
    private final String password = "password";

    public boolean authAPI(String user,String pass){
        if(user.equals(userName) && pass.equals(password))
            return true;
        else
            return false;
    }
}
