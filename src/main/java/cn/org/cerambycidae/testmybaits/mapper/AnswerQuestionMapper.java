package cn.org.cerambycidae.testmybaits.mapper;

import cn.org.cerambycidae.testmybaits.pojo.AnswerQuestion;
import cn.org.cerambycidae.testmybaits.pojo.AnswerQuestionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AnswerQuestionMapper {
    long countByExample(AnswerQuestionExample example);

    int deleteByExample(AnswerQuestionExample example);

    int insert(AnswerQuestion record);

    int insertSelective(AnswerQuestion record);

    List<AnswerQuestion> selectByExample(AnswerQuestionExample example);

    int updateByExampleSelective(@Param("record") AnswerQuestion record, @Param("example") AnswerQuestionExample example);

    int updateByExample(@Param("record") AnswerQuestion record, @Param("example") AnswerQuestionExample example);
}