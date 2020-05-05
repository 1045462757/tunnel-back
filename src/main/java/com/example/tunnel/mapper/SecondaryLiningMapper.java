package com.example.tunnel.mapper;

import com.example.tunnel.domain.SecondaryLining;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 10454
 */
@Mapper
public interface SecondaryLiningMapper {
    int deleteByPrimaryKey(String id);

    int insert(String id);

    SecondaryLining selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SecondaryLining record);
}