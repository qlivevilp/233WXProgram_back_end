package cn.org.cerambycidae.testmybaits.mapper;

import cn.org.cerambycidae.testmybaits.pojo.Share;
import cn.org.cerambycidae.testmybaits.pojo.ShareExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShareMapper {
    long countByExample(ShareExample example);

    int deleteByExample(ShareExample example);

    int insert(Share record);

    int insertSelective(Share record);

    List<Share> selectByExample(ShareExample example);

    int updateByExampleSelective(@Param("record") Share record, @Param("example") ShareExample example);

    int updateByExample(@Param("record") Share record, @Param("example") ShareExample example);
}