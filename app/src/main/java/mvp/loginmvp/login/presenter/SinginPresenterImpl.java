package mvp.loginmvp.login.presenter;

import mvp.loginmvp.R;
import mvp.loginmvp.login.interactor.SinginInteractorImpl;
import mvp.loginmvp.login.interfaces.SinginInteractor;
import mvp.loginmvp.login.interfaces.SinginPresenter;
import mvp.loginmvp.login.interfaces.SinginView;

/**
 * Created by juanj on 09/03/2017.
 */

public class SinginPresenterImpl implements SinginPresenter {
    SinginView view;
    SinginInteractor interactor;

    public SinginPresenterImpl(SinginView view) {
        this.view = view;
        interactor = new SinginInteractorImpl(this);
    }


    @Override
    public void onClickButton() {
        String user = view.getUser();
        String pass = view.getPass();
        interactor.checkAutApi(user,pass);
    }

    @Override
    public void emptyUser() {
        view.setErrorUser(R.string.login_error_user);
    }

    @Override
    public void emptyPass() {
        view.setErrorPass(R.string.login_error_password);
    }

    @Override
    public void errorLogin() {
        view.setErrorLogin(R.string.login_error_auth);
    }

    @Override
    public void userValidate() {
        view.launchToHome();
    }


}
