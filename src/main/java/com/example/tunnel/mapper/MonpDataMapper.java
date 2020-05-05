package com.example.tunnel.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 10454
 */
@Mapper
public interface MonpDataMapper {

    List<Map<String, String>> listMonpData(@Param("monpId") String monpId, @Param("startTime") String startTime, @Param("endTime") String endTime);
}