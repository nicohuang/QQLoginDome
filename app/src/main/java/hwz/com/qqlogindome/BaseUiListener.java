package hwz.com.qqlogindome;

import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;

import org.json.JSONObject;

/**
 * Created by jan on 15/7/9.
 */
public class BaseUiListener implements IUiListener
{
    //V2.0版本，参数类型由JSONObject 改成了Object,具体类型参考api文档
    @Override
    public void onComplete(Object o)
    {
        JSONObject object = (JSONObject)o;
        doComplete(object);
        System.out.println("进来");
    }
    //在这里可以做一些登录成功的处理
    protected void doComplete(JSONObject values)
    {
        UserInfo userInfo = new UserInfo();
        try
        {
            userInfo.setRet(values.getInt("ret"));
            userInfo.setPay_token(values.getString("pay_token"));
            userInfo.setPf(values.getString("pf"));
            userInfo.setExpires_in(values.getString("expires_in"));
            userInfo.setOpenid(values.getString("openid"));
            userInfo.setPfkey(values.getString("pfkey"));
            userInfo.setMsg(values.getString("msg"));
            userInfo.setAccess_token(values.getString("access_token"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(userInfo.getOpenid());
        System.out.println(userInfo.getExpires_in());
        System.out.println(userInfo.getMsg());
    }
    //在这里可以做登录失败的处理
    @Override
    public void onError(UiError e)
    {

    }
    //在这里可以做登录被取消的处理
    @Override
    public void onCancel()
    {

    }
}

