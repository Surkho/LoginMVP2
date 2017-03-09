package mvp.loginmvp.login.view;

import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import mvp.loginmvp.HomeActivity;
import mvp.loginmvp.R;
import mvp.loginmvp.api.LoginAPI;
import mvp.loginmvp.login.presenter.SinginPresenterImpl;
import mvp.loginmvp.login.interfaces.SinginPresenter;
import mvp.loginmvp.login.interfaces.SinginView;

public class SingInActivity extends AppCompatActivity implements SinginView {
    private EditText user,pass;

    private SinginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        initUI();
        presenter = new SinginPresenterImpl(this);

    }

    private void initUI() {
        user = (EditText) findViewById(R.id.etUserName);
        pass = (EditText) findViewById(R.id.etPass);
    }

    @Override
    public String getUser() {
        return user.getText().toString();
    }

    @Override
    public String getPass() {
        return pass.getText().toString();
    }

    @Override
    public void setErrorUser(@StringRes int sId) {
        user.setError(getString(sId));
    }

    @Override
    public void setErrorPass(@StringRes int sId) {
        pass.setError(getString(sId));
    }

    @Override
    public void setErrorLogin(@StringRes int sId) {
        Toast.makeText(getApplicationContext(),getString(sId),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void launchToHome() {
        startActivity(new Intent(SingInActivity.this,HomeActivity.class));
        finish();
        return;
    }
    public void click(View v){
        presenter.onClickButton();
    }
}
