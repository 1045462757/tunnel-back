package com.example.tunnel.mapper;

import com.example.tunnel.domain.ProjectDesign;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 10454
 */
@Mapper
public interface ProjectDesignMapper {
    int deleteByPrimaryKey(String id);

    int insert(String id);

    ProjectDesign selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ProjectDesign record);
}