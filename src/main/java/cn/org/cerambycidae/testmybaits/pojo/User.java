package cn.org.cerambycidae.testmybaits.pojo;

public class User {
    private Integer uId;

    private String wxId;

    private String uName;

    private String uSign;

    private String uImg;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId == null ? null : wxId.trim();
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuSign() {
        return uSign;
    }

    public void setuSign(String uSign) {
        this.uSign = uSign == null ? null : uSign.trim();
    }

    public String getuImg() {
        return uImg;
    }

    public void setuImg(String uImg) {
        this.uImg = uImg == null ? null : uImg.trim();
    }
}