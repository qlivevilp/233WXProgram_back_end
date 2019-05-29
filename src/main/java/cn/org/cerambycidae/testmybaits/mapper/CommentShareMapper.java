package cn.org.cerambycidae.testmybaits.mapper;

import cn.org.cerambycidae.testmybaits.pojo.CommentShare;
import cn.org.cerambycidae.testmybaits.pojo.CommentShareExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommentShareMapper {
    long countByExample(CommentShareExample example);

    int deleteByExample(CommentShareExample example);

    int insert(CommentShare record);

    int insertSelective(CommentShare record);

    List<CommentShare> selectByExample(CommentShareExample example);

    int updateByExampleSelective(@Param("record") CommentShare record, @Param("example") CommentShareExample example);

    int updateByExample(@Param("record") CommentShare record, @Param("example") CommentShareExample example);
}