package com.example.tunnel.mapper;

import com.example.tunnel.domain.ProjectDesign;
import com.example.tunnel.util.Util;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class ProjectDesignTest {

    @Resource
    private ProjectDesignMapper projectDesignMapper;

    @Test
    public void insert() {
        System.out.println(projectDesignMapper.insert(Util.randomId()));
    }

    @Test
    public void delete() {
        System.out.println(projectDesignMapper.deleteByPrimaryKey("f4bc82af61"));
    }

    @Test
    public void select() {
        System.out.println(projectDesignMapper.selectByPrimaryKey("1"));
    }

    @Test
    public void update() {
        ProjectDesign projectDesign = new ProjectDesign();

        projectDesign.setId("1");
        projectDesign.setOwnerUnit(null);
        projectDesign.setClearance("test");

        System.out.println(projectDesignMapper.updateByPrimaryKeySelective(projectDesign));
    }
}
