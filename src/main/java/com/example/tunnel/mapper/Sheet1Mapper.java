package com.example.tunnel.mapper;

import com.example.tunnel.domain.Sheet1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Sheet1Mapper {

    List<Sheet1> select(@Param("deviceId") String deviceId, @Param("startTime") String startTime, @Param("endTime") String endTime);
}