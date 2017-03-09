package mvp.loginmvp.login.interfaces;

import android.support.annotation.StringRes;

/**
 * Created by juanj on 09/03/2017.
 */

public interface SinginView {

    String getUser();
    String getPass();

    void setErrorUser(@StringRes int sId);
    void setErrorPass(@StringRes int sId);
    void setErrorLogin(@StringRes int sId);

    void launchToHome();
}
