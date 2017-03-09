package mvp.loginmvp.login.interfaces;

/**
 * Created by juanj on 09/03/2017.
 */

public interface SinginPresenter {
    void onClickButton();

    void emptyUser();

    void emptyPass();

    void userValidate();

    void errorLogin();
}
