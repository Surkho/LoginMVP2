package mvp.loginmvp.main.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mvp.loginmvp.R;
import mvp.loginmvp.login.view.SingInActivity;
import mvp.loginmvp.main.presenter.MainPresenterImpl;
import mvp.loginmvp.main.interfaces.MainPresenter;
import mvp.loginmvp.main.interfaces.MainView;

public class MainActivity extends AppCompatActivity implements MainView {
    Button btnSingIn;
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSingIn = (Button) findViewById(R.id.btnSingIn);
        btnSingIn.setOnClickListener(btnSinInClick);
        presenter = new MainPresenterImpl(this);


    }

    private View.OnClickListener btnSinInClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            presenter.checkToLaunch();
        }
    };

    @Override
    public void goToSing() {
        startActivity(new Intent(getApplicationContext(),SingInActivity.class));
    }
}
