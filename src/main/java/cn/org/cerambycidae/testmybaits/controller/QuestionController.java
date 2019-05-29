package cn.org.cerambycidae.testmybaits.controller;

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
public class QuestionController {
    @Autowired
    UserMapper userMapper;

    @Autowired
    QuestionMapper questionMapper;

    @Autowired
    AnswerQuestionMapper answerQuestionMapper;


    //推文联合类List
    List<User> users= new ArrayList<User>();
    List<Question> questions=new ArrayList<Question>();
    List<AnswerQuestion> answerQuestions=new ArrayList<AnswerQuestion>();
    //分表查询
    UserExample userExample = new UserExample();
    UserExample.Criteria criteriaU=userExample.createCriteria();

    QuestionExample questionExample=new QuestionExample();
    QuestionExample.Criteria criteriaQ=questionExample.createCriteria();

    AnswerQuestionExample answerQuestionExample =new AnswerQuestionExample();
    AnswerQuestionExample.Criteria criteriaA=answerQuestionExample.createCriteria();

    //首先实现的按热度排名推荐展示问题
    @ResponseBody
    @RequestMapping("/selectQuestionByLike")
    public List<Question>selectQuestionByLike() {
        questionExample.setOrderByClause("q_like DESC");
        questions=questionMapper.selectByExample(questionExample);
        return  questions;
    }
    //进入提问详情页面详情界面，展示回答
    @ResponseBody
    @RequestMapping("/selectQuestionAnswer")
    public List<AnswerQuestion> selectQuestionAnswer(@RequestParam(value="qId" ,required =false,defaultValue = "1") int qId){
        criteriaA.andQIdEqualTo(qId);
        answerQuestions=answerQuestionMapper.selectByExample(answerQuestionExample);
        return answerQuestions;
    }

    //根据条件模糊查询提问
    @ResponseBody
    @RequestMapping("/searchQuestion")
    public List<Question> searchQuestion(@RequestParam(value="condition",defaultValue = "") String condition){
        questionExample.or().andQContextLike("%"+condition+"%");
        questionExample.or().andQTitleLike("%"+condition+"%");
        questionExample.or().andQTagLike("%"+condition+"%");
        questions=questionMapper.selectByExample(questionExample);
        return  questions;
    }
    //修改推文根据用户id修改提问，用户只能修改自己的提问
    //前端在用户全部提问页面进入修改
    @ResponseBody
    @RequestMapping("/modifyQuestion")
    public String modifyQuestion(@RequestBody Question question){
        try {
            criteriaQ.andQIdEqualTo(question.getqId());
            questionMapper.updateByExampleSelective(question,questionExample);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "success";
    }

    //添加提问
    @ResponseBody
    @RequestMapping("/addQuestion")
    public String addQuestion(@RequestBody User user) {
        try {
            userMapper.insertSelective(user);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "success";
    }

    //删除提问
    @ResponseBody
    @RequestMapping("/deleteQuestion")
    public String deleteQuestion(@RequestParam (value="qId")int qId) {
        try {
            criteriaQ.andQIdEqualTo(qId);
            questionMapper.deleteByExample(questionExample);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "success";
    }
}
