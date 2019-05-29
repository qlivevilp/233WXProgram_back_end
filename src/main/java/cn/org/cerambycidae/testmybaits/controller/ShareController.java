package cn.org.cerambycidae.testmybaits.controller;

import cn.org.cerambycidae.testmybaits.bojo.ShareUnion;
import cn.org.cerambycidae.testmybaits.mapper.*;
import cn.org.cerambycidae.testmybaits.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class ShareController {
    @Autowired
    UserMapper userMapper;

    @Autowired
    FriendsMapper friendsMapper;

    @Autowired
    ShareMapper shareMapper;

    @Autowired
    CommentShareMapper commentShareMapper;

    @Autowired
    LikeShareMapper likeShareMapper;

    //推文联合类List
    List<Share> shares= new ArrayList<Share>();
    List<User> users= new ArrayList<User>();
    List<Friends> friends=new ArrayList<Friends>();
    List<CommentShare> commentShares= new ArrayList<CommentShare>();
    List<LikeShare> likeShares= new ArrayList<LikeShare>();
    //分表查询
    UserExample userExample = new UserExample();
    UserExample.Criteria criteriaU=userExample.createCriteria();

    FriendsExample friendsExample=new FriendsExample();
    FriendsExample.Criteria criteriaF=friendsExample.createCriteria();

    ShareExample shareExample=new ShareExample();
    ShareExample.Criteria criteriaS=shareExample.createCriteria();

    CommentShareExample commentShareExample=new CommentShareExample();
    CommentShareExample.Criteria criteria=commentShareExample.createCriteria();

    LikeShareExample likeShareExample =new LikeShareExample();
    LikeShareExample.Criteria criteriaL=likeShareExample.createCriteria();
    //首先实现的按热度排名推荐推文
    @ResponseBody
    @RequestMapping("/selectShareByLike")
    public List<Share>selectShareByLike() {
        shareExample.setOrderByClause("s_like DESC");
        shares=shareMapper.selectByExample(shareExample);
        return  shares;
    }
    //搜索好友推文
    @ResponseBody
    @RequestMapping("/selectFromFriends")
    public List<Share>selectFromFriends(@RequestParam(value="name",defaultValue="1")int uId){
        criteriaF.andUIdEqualTo(uId);
        friends=friendsMapper.selectByExample(friendsExample);
        for(int i = 0 ; i < friends.size() ; i++) {
            shareExample.or().andUIdEqualTo(friends.get(i).getuId());
            shares=shareMapper.selectByExample(shareExample);
        }
        return shares;
    }


    //进入推文share详情界面，展示评论
    @ResponseBody
    @RequestMapping("/selectShareComment")
    public List<CommentShare> selectShareComment(@RequestParam(value="sId" ,required =false,defaultValue = "1") int sId){

            criteriaS.andSIdEqualTo(sId);
            commentShares=commentShareMapper.selectByExample(commentShareExample);
            return commentShares;
    }


    //根据条件模糊查询推文
    @ResponseBody
    @RequestMapping("/searchShare")
    public List<Share> searchShare(@RequestParam(value="condition",defaultValue = "" )String condition){
//        String condition="123";
        shareExample.or().andSContextLike("%"+condition+"%");
        shareExample.or().andSTitleLike("%"+condition+"%");
        shareExample.or().andSTagLike("%"+condition+"%");
        shares=shareMapper.selectByExample(shareExample);
//        System.out.println(condition);
//        System.out.println(shares.get(0).getsContext());
        return  shares;
    }

    //修改推文根据用户id修改推文，用户只能修改自己的推文
    //前端在用户全部推文页面进入修改
    @ResponseBody
    @RequestMapping("/modifyShare")
    public String modifyShare(@RequestBody Share share){
        try {
            criteriaS.andSIdEqualTo(share.getsId());
            shareMapper.updateByExampleSelective(share,shareExample);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "success";
    }

    //添加推文
    @ResponseBody
    @RequestMapping("/addShare")
    public String addShare(@RequestBody Share share) {
        try {
            shareMapper.insertSelective(share);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "success";
    }
    @ResponseBody
    @RequestMapping("/deleteShare")
    public String deleteShare(@RequestParam (value="sId")int sId) {
        try {
            criteriaS.andSIdEqualTo(sId);
            shareMapper.deleteByExample(shareExample);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "success";
    }

}
