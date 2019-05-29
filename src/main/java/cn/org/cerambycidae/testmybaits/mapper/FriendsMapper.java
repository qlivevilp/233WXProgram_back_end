package cn.org.cerambycidae.testmybaits.mapper;

import cn.org.cerambycidae.testmybaits.pojo.Friends;
import cn.org.cerambycidae.testmybaits.pojo.FriendsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FriendsMapper {
    long countByExample(FriendsExample example);

    int deleteByExample(FriendsExample example);

    int insert(Friends record);

    int insertSelective(Friends record);

    List<Friends> selectByExample(FriendsExample example);

    int updateByExampleSelective(@Param("record") Friends record, @Param("example") FriendsExample example);

    int updateByExample(@Param("record") Friends record, @Param("example") FriendsExample example);
}