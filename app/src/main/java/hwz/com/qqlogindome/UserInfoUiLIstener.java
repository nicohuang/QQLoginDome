package hwz.com.qqlogindome;

import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;

import org.json.JSONObject;

/**
 * Created by jan on 15/7/21.
 */
public class UserInfoUiLIstener implements IUiListener
{
    @Override
    public void onComplete(Object o)
    {
        System.out.println("jinlai");
        doComplete((JSONObject) o);
    }
    protected void doComplete(JSONObject values)
    {
        try
        {
            values.getString("figureurl");
            System.out.println(values.toString());
            System.out.println(values.getString("figureurl"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @Override
    public void onError(UiError uiError)
    {

    }

    @Override
    public void onCancel()
    {

    }
    /**
     {"ret":0,
     "msg":"",
     "is_lost":0,
     "nickname":"H_文增",
     "gender":"男",
     "province":"广东",
     "city":"广州",
     "figureurl":"http:\/\/qzapp.qlogo.cn\/qzapp\/1104701805\/88B234ABD25247B632DEBA9EDA00612D\/30",
     "figureurl_1":"http:\/\/qzapp.qlogo.cn\/qzapp\/1104701805\/88B234ABD25247B632DEBA9EDA00612D\/50",
     "figureurl_2":"http:\/\/qzapp.qlogo.cn\/qzapp\/1104701805\/88B234ABD25247B632DEBA9EDA00612D\/100",
     "figureurl_qq_1":"http:\/\/q.qlogo.cn\/qqapp\/1104701805\/88B234ABD25247B632DEBA9EDA00612D\/40",
     "figureurl_qq_2":"http:\/\/q.qlogo.cn\/qqapp\/1104701805\/88B234ABD25247B632DEBA9EDA00612D\/100",
     "is_yellow_vip":"0",
     "vip":"0",
     "yellow_vip_level":"0",
     "level":"0",
     "is_yellow_year_vip":"0"
     }
     */
}