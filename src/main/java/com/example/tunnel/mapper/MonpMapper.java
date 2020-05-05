package com.example.tunnel.mapper;

import com.example.tunnel.domain.Monp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 10454
 */
@Mapper
public interface MonpMapper {
    int deleteByPrimaryKey(String monpId);

    int insert(Monp record);

    Monp selectByPrimaryKey(String monpId);

    int updateByPrimaryKeySelective(Monp record);

    List<Monp> listMonp(@Param("tunnelId") String tunnelId, @Param("index") Integer index, @Param("size") Integer size);

    int countMonp();

    List<Map<String, String>> listTunnelName(@Param("tunnelId") String tunnelId);
}