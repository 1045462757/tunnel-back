package com.example.tunnel.mapper;

import com.example.tunnel.domain.MonitoringInformation;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 10454
 */
@Mapper
public interface MonitoringInformationMapper {
    int deleteByPrimaryKey(String id);

    int insert(String id);

    MonitoringInformation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MonitoringInformation record);
}