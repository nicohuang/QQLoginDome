package hwz.com.qqlogindome;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tencent.tauth.Tencent;


public class MainActivity extends Activity
{
    private Tencent mTencent;
    //这里的APP_ID请换成你应用申请的APP_ID
    private String APPID = "222222";
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button)findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                login();
            }
        });
        findViewById(R.id.btn_logout).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                logout();
            }
        });
    }

    public void login()
    {
        mTencent = Tencent.createInstance(APPID, this.getApplicationContext());
        if (!mTencent.isSessionValid())
        {
            mTencent.login(this,"all",new BaseUiListener());
        }
    }

    public void logout()
    {
        mTencent.logout(this);
    }
}
