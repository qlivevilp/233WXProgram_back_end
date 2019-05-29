package cn.org.cerambycidae.testmybaits.controller;

import cn.org.cerambycidae.testmybaits.mapper.ShareMapper;
import cn.org.cerambycidae.testmybaits.mapper.UserMapper;
import cn.org.cerambycidae.testmybaits.pojo.Share;
import cn.org.cerambycidae.testmybaits.pojo.ShareExample;
import cn.org.cerambycidae.testmybaits.pojo.User;
import cn.org.cerambycidae.testmybaits.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class HelloWorldController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    ShareMapper shareMapper;

    @ResponseBody
    @RequestMapping("/helloworld")
    public String HelloWorld() {
        // 查询一个用户
        // 1. 设置查询结果集
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUIdEqualTo(1);
        criteria.andUNameEqualTo("Tang");
        // 2. 执行查询结果
        List<User> users = userMapper.selectByExample(userExample);
        User userTang = users.get(0);
        // 插入数据
        User userInstert = new User();
        userInstert.setWxId("112233");
        userInstert.setuName("hello");
        userInstert.setuSign("hello world");
        int line = userMapper.insertSelective(userInstert);
        return userTang.getWxId();
    }
    @ResponseBody
    @RequestMapping("/selectShare")
    public List<User> selectShare(){
        ShareExample shareExample = new ShareExample();
        ShareExample.Criteria criteria = shareExample.createCriteria();
        List<Share> shares=shareMapper.selectByExample(shareExample);
//        Share share1=shares.get(0);
        //联合查询.联合单查询
//        UserExample userExample = new UserExample();
//        UserExample.Criteria criteriaU = userExample.createCriteria();
//        criteriaU.andUIdEqualTo(shares.get(0).getuId());
//        List<User> user1=userMapper.selectByExample(userExample);
        //根据前表信息查询后表
        UserExample userExample = new UserExample();
        List<User> list1=new ArrayList<User>();
//        List<Integer>  listin=new ArrayList<Integer>();
        for(int i = 0 ; i < shares.size() ; i++) {
            userExample.or().andUIdEqualTo(shares.get(i).getuId());
            list1=userMapper.selectByExample(userExample);
        }
//        List<User> user1=userMapper.selectByExample(userExample);
//        return user1.get(0).getuSign();
        return list1;
    }
}
