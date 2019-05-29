package cn.org.cerambycidae.testmybaits.bojo;

import cn.org.cerambycidae.testmybaits.pojo.Friends;
import cn.org.cerambycidae.testmybaits.pojo.User;

//用户类和好友类的联合表，负责好友关系
public class UserUnion {
    private User user;
    private Friends friends;

    public User getUser() {
        return user;
    }

    public Friends getFriends() {
        return friends;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setFriends(Friends friends) {
        this.friends = friends;
    }
}
