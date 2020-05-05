package com.example.tunnel.mapper;

import com.example.tunnel.domain.SurroundingEnvironment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 10454
 */
@Mapper
public interface SurroundingEnvironmentMapper {
    int deleteByPrimaryKey(String id);

    int insert(String id);

    SurroundingEnvironment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SurroundingEnvironment record);
}