package hwz.com.qqlogindome;

import android.content.Context;

import com.tencent.connect.UserInfo;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;

import org.json.JSONObject;

/**
 * Created by jan on 15/7/9.
 */
public class BaseUiListener implements IUiListener
{
    private Context context;
    //V2.0版本，参数类型由JSONObject 改成了Object,具体类型参考api文档
    public BaseUiListener (Context context)
    {
        this.context = context;
    }
    @Override
    public void onComplete(Object o)
    {
        JSONObject object = (JSONObject)o;
        doComplete(object);
        System.out.println("登陆成功");
    }
    //在这里可以做一些登录成功的处理
    protected void doComplete(JSONObject values)
    {
        //获取用户资料
        com.tencent.connect.UserInfo userInfo = new UserInfo(context,MainActivity.mTencent.getQQToken());
        userInfo.getUserInfo(new UserInfoUiLIstener());
    }
    //在这里可以做登录失败的处理
    @Override
    public void onError(UiError e)
    {
        System.out.println("登陆失败");
    }
    //在这里可以做登录被取消的处理
    @Override
    public void onCancel()
    {
        System.out.println("取消登陆");
    }
}

