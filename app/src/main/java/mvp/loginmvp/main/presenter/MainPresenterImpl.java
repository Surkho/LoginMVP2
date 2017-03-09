package mvp.loginmvp.main.presenter;

import mvp.loginmvp.main.interactor.MainInteractorImpl;
import mvp.loginmvp.main.interfaces.MainInteractor;
import mvp.loginmvp.main.interfaces.MainPresenter;
import mvp.loginmvp.main.interfaces.MainView;

/**
 * Created by juanj on 09/03/2017.
 */

public class MainPresenterImpl implements MainPresenter {
    MainView view;
    MainInteractor interactor;

    public MainPresenterImpl(MainView view) {
        this.view = view;
        interactor = new MainInteractorImpl(this);
    }

    @Override
    public void checkToLaunch() {
       interactor.launch();

    }

    @Override
    public void goToLaunch() {
        view.goToSing();
    }
}
