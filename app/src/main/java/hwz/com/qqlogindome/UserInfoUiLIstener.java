package hwz.com.qqlogindome;

import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;

import org.json.JSONObject;

/**获取用户信息
 * Created on 15/7/21.
 * @author nico
 */
public class UserInfoUiLIstener implements IUiListener
{
    @Override
    public void onComplete(Object o)
    {
        System.out.println("获取成功");
        doComplete((JSONObject) o);
    }
    protected void doComplete(JSONObject values)
    {
        try
        {
            System.out.println(values.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @Override
    public void onError(UiError uiError)
    {
        System.out.println("获取失败");
    }

    @Override
    public void onCancel()
    {
        System.out.println("取消");
    }

}