package cn.org.cerambycidae.testmybaits.pojo;

import java.util.Date;

public class CommentShare {
    private Integer uId;

    private Integer sId;

    private Date csTime;

    private String csContext;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Date getCsTime() {
        return csTime;
    }

    public void setCsTime(Date csTime) {
        this.csTime = csTime;
    }

    public String getCsContext() {
        return csContext;
    }

    public void setCsContext(String csContext) {
        this.csContext = csContext == null ? null : csContext.trim();
    }
}