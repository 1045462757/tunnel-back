package com.example.tunnel.mapper;

import com.example.tunnel.domain.ConstructionInformation;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 10454
 */
@Mapper
public interface ConstructionInformationMapper {
    int deleteByPrimaryKey(String id);

    int insert(String id);

    ConstructionInformation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ConstructionInformation record);
}