package cn.org.cerambycidae.testmybaits.controller;

import cn.org.cerambycidae.testmybaits.mapper.*;
import cn.org.cerambycidae.testmybaits.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @Autowired
    FriendsMapper friendsMapper;

    @Autowired
    ShareMapper shareMapper;

    @Autowired
    QuestionMapper questionMapper;

    @Autowired
    AnswerQuestionMapper answerQuestionMapper;

    @Autowired
    CommentShareMapper commentShareMapper;

    @Autowired
    LikeShareMapper likeShareMapper;


    //添加用户信息，接收前端传来的json格式参数，@RequetBody转换为用户对象
    @ResponseBody
    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user) {
//        UserExample.Criteria criteria=userExample.createCriteria();
//        User newUser=new User();
//        newUser.setuName("addUser");
//        newUser.setuSign("addUser");
//        newUser.setWxId("addUser");
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        try {
            userMapper.insertSelective(user);
        } catch (Exception e) {
           return e.getMessage();
        }
        return "success";
    }

    //修改用户信息，接收前端传来的json格式参数，@RequetBody转换为用户对象
    @ResponseBody
    @RequestMapping("/modifyUser")
    public  String modifyUser(@RequestBody User user){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        try {
            criteria.andUIdEqualTo(user.getuId());
            userMapper.updateByExampleSelective(user,userExample);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "success";
    }

    //查询用户好友信息，返回好友信息表
    @ResponseBody
    @RequestMapping("/selectFriends")
    public List<User> selectFriends(@RequestParam(value="uId" ,required =false,defaultValue = "1") int uId){
        FriendsExample friendsExample = new FriendsExample();
        UserExample userExample = new UserExample();
        FriendsExample.Criteria criteria=friendsExample.createCriteria();
        criteria.andUIdEqualTo(uId);
        List<Friends> friends =friendsMapper.selectByExample(friendsExample);
        List<User> users=new ArrayList<>();
        for(int i = 0 ; i < friends.size() ; i++) {
            userExample.or().andUIdEqualTo(friends.get(i).getuId());
            users=userMapper.selectByExample(userExample);
        }
        return users;
    }

    //查询提问，用户可以看过自己的历史提问,根据用户的uid查询
    //待补全回答！
    @ResponseBody
    @RequestMapping("/selectOwnQuestion")
    public List<Question>selectOwnQuestion(@RequestParam(value="uId" ,required =false,defaultValue = "1") int uId){
        QuestionExample questionExample=new QuestionExample();
        QuestionExample.Criteria criteria=questionExample.createCriteria();
        criteria.andUIdEqualTo(uId);
        List<Question> questions=questionMapper.selectByExample(questionExample);
        return questions;
    }
    //查询分享，用户可以看过自己的历史提问,根据用户的uid查询
    //待补全回答！
    @ResponseBody
    @RequestMapping("/selectOwnShare")
    public List<Share>selectOwnShare(@RequestParam(value="uId" ,required =false,defaultValue = "1") int uId){
        ShareExample shareExample=new ShareExample();
        ShareExample.Criteria criteria=shareExample.createCriteria();
        criteria.andUIdEqualTo(uId);
        List<Share> shares=shareMapper.selectByExample(shareExample);
        return shares;
    }

    //添加评论，用户可以对share添加自己的评论
    @ResponseBody
    @RequestMapping("/addComment")
    public String addComment(@RequestBody CommentShare commentShare){
        CommentShareExample commentShareExample=new CommentShareExample();
        CommentShareExample.Criteria criteria=commentShareExample.createCriteria();
        try {
            commentShareMapper.insertSelective(commentShare);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "success";
    }

    //添加回答，用户可以对question添加自己的回答
    @ResponseBody
    @RequestMapping("/addAnswer")
    public String selectOwnShare(@RequestBody AnswerQuestion answerQuestion){
        AnswerQuestionExample answerQuestionExample=new AnswerQuestionExample();
        AnswerQuestionExample.Criteria criteria=answerQuestionExample.createCriteria();
        try {
            answerQuestionMapper.insertSelective(answerQuestion);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "success";
    }



    }
