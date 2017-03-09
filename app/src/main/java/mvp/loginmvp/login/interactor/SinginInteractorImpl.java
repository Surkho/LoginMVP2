package mvp.loginmvp.login.interactor;

import mvp.loginmvp.api.LoginAPI;
import mvp.loginmvp.login.interfaces.SinginInteractor;
import mvp.loginmvp.login.interfaces.SinginPresenter;

/**
 * Created by juanj on 09/03/2017.
 */

public class SinginInteractorImpl implements SinginInteractor {
    SinginPresenter presenter;
    LoginAPI api;

    public SinginInteractorImpl(SinginPresenter presenter) {
        this.presenter = presenter;
        api = new LoginAPI();
    }

    @Override
    public void checkAutApi(String user, String pass) {


        if(user.isEmpty() && pass.isEmpty()){
            presenter.emptyUser();
            presenter.emptyPass();
            return;
        }
        if(user.isEmpty()){
            presenter.emptyUser();
            return;
        }
        if(pass.isEmpty()){
            presenter.emptyPass();
            return;
        }

        if(api.authAPI(user,pass))
            presenter.userValidate();
        else
            presenter.errorLogin();
    }
}
