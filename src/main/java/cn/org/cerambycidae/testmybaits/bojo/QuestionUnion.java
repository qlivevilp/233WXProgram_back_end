package cn.org.cerambycidae.testmybaits.bojo;

import cn.org.cerambycidae.testmybaits.pojo.AnswerQuestion;
import cn.org.cerambycidae.testmybaits.pojo.Question;
import cn.org.cerambycidae.testmybaits.pojo.User;

//提问和用户和回答联合表
public class QuestionUnion {
    private Question question;
    private User user;
    private AnswerQuestion answerQuestion;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AnswerQuestion getAnswerQuestion() {
        return answerQuestion;
    }

    public void setAnswerQuestion(AnswerQuestion answerQuestion) {
        this.answerQuestion = answerQuestion;
    }
}
