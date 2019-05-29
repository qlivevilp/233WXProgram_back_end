package cn.org.cerambycidae.testmybaits.mapper;

import cn.org.cerambycidae.testmybaits.pojo.LikeShare;
import cn.org.cerambycidae.testmybaits.pojo.LikeShareExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LikeShareMapper {
    long countByExample(LikeShareExample example);

    int deleteByExample(LikeShareExample example);

    int insert(LikeShare record);

    int insertSelective(LikeShare record);

    List<LikeShare> selectByExample(LikeShareExample example);

    int updateByExampleSelective(@Param("record") LikeShare record, @Param("example") LikeShareExample example);

    int updateByExample(@Param("record") LikeShare record, @Param("example") LikeShareExample example);
}