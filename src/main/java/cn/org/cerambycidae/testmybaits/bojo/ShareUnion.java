package cn.org.cerambycidae.testmybaits.bojo;

import cn.org.cerambycidae.testmybaits.pojo.CommentShare;
import cn.org.cerambycidae.testmybaits.pojo.LikeShare;
import cn.org.cerambycidae.testmybaits.pojo.Share;
import cn.org.cerambycidae.testmybaits.pojo.User;

//推文，评论，用户，喜欢联合表
public class ShareUnion {
    private Share share;
    private User user;
    private LikeShare likeShare;
    private CommentShare commentShare;

    public Share getShare() {
        return share;
    }

    public void setShare(Share share) {
        this.share = share;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LikeShare getLikeShare() {
        return likeShare;
    }

    public void setLikeShare(LikeShare likeShare) {
        this.likeShare = likeShare;
    }

    public CommentShare getCommentShare() {
        return commentShare;
    }

    public void setCommentShare(CommentShare commentShare) {
        this.commentShare = commentShare;
    }
}
