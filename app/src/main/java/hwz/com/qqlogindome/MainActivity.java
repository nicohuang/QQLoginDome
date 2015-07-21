package hwz.com.qqlogindome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tencent.connect.common.Constants;
import com.tencent.tauth.Tencent;


public class MainActivity extends Activity
{
    public static Tencent mTencent;
    //这里的APP_ID请换成你应用申请的APP_ID
    private String APPID = "1104701805";
    private Button btnLogin;
    BaseUiListener baseUiListener;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button)findViewById(R.id.btn_login);
        baseUiListener = new BaseUiListener(this);
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
            mTencent.login(this,"all",baseUiListener);
        }
    }

    public void logout()
    {
        mTencent.logout(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if(requestCode == Constants.REQUEST_API)
        {
            if (resultCode == Constants.RESULT_LOGIN)
            {
                mTencent.handleLoginData(data, baseUiListener);
            }
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
