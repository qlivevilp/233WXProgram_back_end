package cn.org.cerambycidae.testmybaits.pojo;

import java.util.Date;

public class AnswerQuestion {
    private Integer uId;

    private Integer qId;

    private String aqContext;

    private Date aqTime;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public String getAqContext() {
        return aqContext;
    }

    public void setAqContext(String aqContext) {
        this.aqContext = aqContext == null ? null : aqContext.trim();
    }

    public Date getAqTime() {
        return aqTime;
    }

    public void setAqTime(Date aqTime) {
        this.aqTime = aqTime;
    }
}