package com.example.tunnel.mapper;

import com.example.tunnel.domain.Tunnel;
import com.example.tunnel.domain.TunnelDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 10454
 */
@Mapper
public interface TunnelMapper {
    int deleteByPrimaryKey(String tunnelId);

    int insert(@Param("tunnelId") String tunnelId, @Param("tunnelName") String tunnelName, @Param("tunnelIntro") String tunnelIntro,
               @Param("projectDesign") String projectDesign, @Param("preliminaryDesign") String preliminaryDesign, @Param("constructionDesign") String constructionDesign,
               @Param("surroundingEnvironment") String surroundingEnvironment, @Param("constructionInformation") String constructionInformation, @Param("monitoringInformation") String monitoringInformation,
               @Param("secondaryLining") String secondaryLining, @Param("basicFormationInformation") String basicFormationInformation);

    Tunnel selectByPrimaryKey(String tunnelId);

    TunnelDO select(String tunnelId);

    int updateByPrimaryKeySelective(@Param("tunnelId") String tunnelId, @Param("tunnelName") String tunnelName,
                                    @Param("tunnelIntro") String tunnelIntro);

    List<Tunnel> listTunnel(@Param("index") Integer index, @Param("size") Integer size);

    int countTunnle();

    List<Map<String, String>> listTunnelName();
}