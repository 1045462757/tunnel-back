package com.example.tunnel.mapper;

import com.example.tunnel.domain.BasicFormationInformation;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 10454
 */
@Mapper
public interface BasicFormationInformationMapper {
    int deleteByPrimaryKey(String id);

    int insert(String id);

    BasicFormationInformation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BasicFormationInformation record);
}