package hwz.com.qqlogindome;

/**
 * Created by jan on 15/7/13.
 */
public class UserInfo
{
    private int ret;
    private String pay_token;
    private String pf;
    private String expires_in;
    private String openid;
    private String pfkey;
    private String msg;
    private String access_token;

    public UserInfo()
    {

    }

    public int getRet()
    {
        return ret;
    }

    public void setRet(int ret)
    {
        this.ret = ret;
    }

    public String getPay_token()
    {
        return pay_token;
    }

    public void setPay_token(String pay_token)
    {
        this.pay_token = pay_token;
    }

    public String getPf()
    {
        return pf;
    }

    public void setPf(String pf)
    {
        this.pf = pf;
    }

    public String getExpires_in()
    {
        return expires_in;
    }

    public void setExpires_in(String expires_in)
    {
        this.expires_in = expires_in;
    }

    public String getOpenid()
    {
        return openid;
    }

    public void setOpenid(String openid)
    {
        this.openid = openid;
    }

    public String getPfkey()
    {
        return pfkey;
    }

    public void setPfkey(String pfkey)
    {
        this.pfkey = pfkey;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public String getAccess_token()
    {
        return access_token;
    }

    public void setAccess_token(String access_token)
    {
        this.access_token = access_token;
    }
}
