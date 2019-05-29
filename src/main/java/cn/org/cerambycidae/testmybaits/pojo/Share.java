package cn.org.cerambycidae.testmybaits.pojo;

import java.util.Date;

public class Share {
    private Integer sId;

    private String sTitle;

    private String sTag;

    private String sContext;

    private String sPic;

    private Integer sLike;

    private Date sTime;

    private Integer uId;

    private  String uName;

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsTitle() {
        return sTitle;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle == null ? null : sTitle.trim();
    }

    public String getsTag() {
        return sTag;
    }

    public void setsTag(String sTag) {
        this.sTag = sTag == null ? null : sTag.trim();
    }

    public String getsContext() {
        return sContext;
    }

    public void setsContext(String sContext) {
        this.sContext = sContext == null ? null : sContext.trim();
    }

    public String getsPic() {
        return sPic;
    }

    public void setsPic(String sPic) {
        this.sPic = sPic == null ? null : sPic.trim();
    }

    public Integer getsLike() {
        return sLike;
    }

    public void setsLike(Integer sLike) {
        this.sLike = sLike;
    }

    public Date getsTime() {
        return sTime;
    }

    public void setsTime(Date sTime) {
        this.sTime = sTime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}