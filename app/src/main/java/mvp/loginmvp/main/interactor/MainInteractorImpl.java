package mvp.loginmvp.main.interactor;

import mvp.loginmvp.api.LoginAPI;
import mvp.loginmvp.main.interfaces.MainInteractor;
import mvp.loginmvp.main.interfaces.MainPresenter;

/**
 * Created by juanj on 09/03/2017.
 */

public class MainInteractorImpl implements MainInteractor {

    MainPresenter presenter;
    LoginAPI api;

    public MainInteractorImpl(MainPresenter presenter) {
        this.presenter = presenter;
        api = new LoginAPI();
    }

    @Override
    public void launch() {
        presenter.goToLaunch();
    }
}



