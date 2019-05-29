package cn.org.cerambycidae.testmybaits.pojo;

import java.util.Date;
import java.util.List;

public class Question {
    private Integer qId;

    private String qTitle;

    private String qTag;

    private String qContext;

    private String qPic;

    private Integer qLike;

    private Date qTime;

    private Integer uId;




    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public String getqTitle() {
        return qTitle;
    }

    public void setqTitle(String qTitle) {
        this.qTitle = qTitle == null ? null : qTitle.trim();
    }

    public String getqTag() {
        return qTag;
    }

    public void setqTag(String qTag) {
        this.qTag = qTag == null ? null : qTag.trim();
    }

    public String getqContext() {
        return qContext;
    }

    public void setqContext(String qContext) {
        this.qContext = qContext == null ? null : qContext.trim();
    }

    public String getqPic() {
        return qPic;
    }

    public void setqPic(String qPic) {
        this.qPic = qPic == null ? null : qPic.trim();
    }

    public Integer getqLike() {
        return qLike;
    }

    public void setqLike(Integer qLike) {
        this.qLike = qLike;
    }

    public Date getqTime() {
        return qTime;
    }

    public void setqTime(Date qTime) {
        this.qTime = qTime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}