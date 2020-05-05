package com.example.tunnel.service.impl;

import com.example.tunnel.domain.Tunnel;
import com.example.tunnel.domain.TunnelDO;
import com.example.tunnel.mapper.*;
import com.example.tunnel.service.TunnelService;
import com.example.tunnel.util.BusinessResult;
import com.example.tunnel.util.ErrorCodeEnum;
import com.example.tunnel.util.StringUtil;
import com.example.tunnel.util.Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author 10454
 */
@Service
public class TunnelServiceImpl implements TunnelService {

    @Resource
    private TunnelMapper tunnelMapper;

    @Resource
    private ProjectDesignMapper projectDesignMapper;

    @Resource
    private PreliminaryDesignMapper preliminaryDesignMapper;

    @Resource
    private ConstructionDesignMapper constructionDesignMapper;

    @Resource
    private SurroundingEnvironmentMapper surroundingEnvironmentMapper;

    @Resource
    private ConstructionInformationMapper constructionInformationMapper;

    @Resource
    private MonitoringInformationMapper monitoringInformationMapper;

    @Resource
    private SecondaryLiningMapper secondaryLiningMapper;

    @Resource
    private BasicFormationInformationMapper basicFormationInformationMapper;

    @Override
    public BusinessResult insertTunnel(String tunnelName, String tunnelIntro) {
        if (StringUtil.isEmpty(tunnelName) || StringUtil.isEmpty(tunnelIntro)) {
            return new BusinessResult(ErrorCodeEnum.PARAM_IS_NULL);
        }

        String tunnelId = Util.randomId();
        String projectDesign = Util.randomId();
        String preliminaryDesign = Util.randomId();
        String constructionDesign = Util.randomId();
        String surroundingEnvironment = Util.randomId();
        String constructionInformation = Util.randomId();
        String monitoringInformation = Util.randomId();
        String secondaryLining = Util.randomId();
        String basicFormationInformation = Util.randomId();

        if (projectDesignMapper.insert(projectDesign) != 1) {
            return new BusinessResult(ErrorCodeEnum.INSERT_FAILED);
        }

        if (preliminaryDesignMapper.insert(preliminaryDesign) != 1) {
            return new BusinessResult(ErrorCodeEnum.INSERT_FAILED);
        }

        if (constructionDesignMapper.insert(constructionDesign) != 1) {
            return new BusinessResult(ErrorCodeEnum.INSERT_FAILED);
        }

        if (surroundingEnvironmentMapper.insert(surroundingEnvironment) != 1) {
            return new BusinessResult(ErrorCodeEnum.INSERT_FAILED);
        }

        if (constructionInformationMapper.insert(constructionInformation) != 1) {
            return new BusinessResult(ErrorCodeEnum.INSERT_FAILED);
        }

        if (monitoringInformationMapper.insert(monitoringInformation) != 1) {
            return new BusinessResult(ErrorCodeEnum.INSERT_FAILED);
        }

        if (secondaryLiningMapper.insert(secondaryLining) != 1) {
            return new BusinessResult(ErrorCodeEnum.INSERT_FAILED);
        }

        if (basicFormationInformationMapper.insert(basicFormationInformation) != 1) {
            return new BusinessResult(ErrorCodeEnum.INSERT_FAILED);
        }

        if (tunnelMapper.insert(tunnelId, tunnelName, tunnelIntro, projectDesign, preliminaryDesign, constructionDesign,
                surroundingEnvironment, constructionInformation, monitoringInformation, secondaryLining, basicFormationInformation) != 1) {
            return new BusinessResult(ErrorCodeEnum.INSERT_FAILED);
        }

        return new BusinessResult(true);
    }

    @Override
    public BusinessResult deleteTunnel(String tunnelId) {
        if (StringUtil.isEmpty(tunnelId)) {
            return new BusinessResult(ErrorCodeEnum.PARAM_IS_NULL);
        }

        TunnelDO tunnelDO = tunnelMapper.select(tunnelId);

        if (Objects.isNull(tunnelDO)) {
            return new BusinessResult(ErrorCodeEnum.TUNNEL_NOT_EXIST);
        }

        if (Objects.nonNull(tunnelDO.getProjectDesign())) {
            if (projectDesignMapper.deleteByPrimaryKey(tunnelDO.getProjectDesign()) != 1) {
                System.out.println("projectDesign删除失败");
            }
        }

        if (Objects.nonNull(tunnelDO.getPreliminaryDesign())) {
            if (preliminaryDesignMapper.deleteByPrimaryKey(tunnelDO.getPreliminaryDesign()) != 1) {
                System.out.println("preliminaryDesign删除失败");
            }
        }

        if (Objects.nonNull(tunnelDO.getConstructionDesign())) {
            if (constructionDesignMapper.deleteByPrimaryKey(tunnelDO.getConstructionDesign()) != 1) {
                System.out.println("constructionDesign删除失败");
            }
        }

        if (Objects.nonNull(tunnelDO.getSurroundingEnvironment())) {
            if (surroundingEnvironmentMapper.deleteByPrimaryKey(tunnelDO.getSurroundingEnvironment()) != 1) {
                System.out.println("surroundingEnvironment删除失败");
            }
        }

        if (Objects.nonNull(tunnelDO.getConstructionInformation())) {
            if (constructionInformationMapper.deleteByPrimaryKey(tunnelDO.getConstructionInformation()) != 1) {
                System.out.println("constructionInformation删除失败");
            }
        }

        if (Objects.nonNull(tunnelDO.getMonitoringInformation())) {
            if (monitoringInformationMapper.deleteByPrimaryKey(tunnelDO.getMonitoringInformation()) != 1) {
                System.out.println("monitoringInformation删除失败");
            }
        }

        if (Objects.nonNull(tunnelDO.getSecondaryLining())) {
            if (secondaryLiningMapper.deleteByPrimaryKey(tunnelDO.getSecondaryLining()) != 1) {
                System.out.println("secondaryLining删除失败");
            }
        }

        if (Objects.nonNull(tunnelDO.getBasicFormationInformation())) {
            if (basicFormationInformationMapper.deleteByPrimaryKey(tunnelDO.getBasicFormationInformation()) != 1) {
                System.out.println("basicFormationInformation删除失败");
            }
        }

        if (tunnelMapper.deleteByPrimaryKey(tunnelId) != 1) {
            return new BusinessResult(ErrorCodeEnum.DELETE_FAILED);
        }
        return new BusinessResult(true);
    }

    @Override
    public BusinessResult updateTunnel(Tunnel tunnel) {
        if (Objects.isNull(tunnel)) {
            return new BusinessResult(ErrorCodeEnum.PARAM_IS_NULL);
        }

        try {
            if (Objects.nonNull(tunnel.getTunnelName()) || Objects.nonNull(tunnel.getTunnelIntro())) {
                if (tunnelMapper.updateByPrimaryKeySelective(tunnel.getTunnelId(), tunnel.getTunnelName(), tunnel.getTunnelIntro()) != 1) {
                    return new BusinessResult(ErrorCodeEnum.UPDATE_FAILED);
                }
            }

            if (Objects.nonNull(tunnel.getProjectDesign())) {
                if (projectDesignMapper.updateByPrimaryKeySelective(tunnel.getProjectDesign()) != 1) {
                    System.out.println("projectDesign修改失败");
                    return new BusinessResult(ErrorCodeEnum.UPDATE_FAILED);
                }
            }

            if (Objects.nonNull(tunnel.getPreliminaryDesign())) {
                if (preliminaryDesignMapper.updateByPrimaryKeySelective(tunnel.getPreliminaryDesign()) != 1) {
                    System.out.println("preliminaryDesign修改失败");
                    return new BusinessResult(ErrorCodeEnum.UPDATE_FAILED);
                }
            }

            if (Objects.nonNull(tunnel.getConstructionDesign())) {
                if (constructionDesignMapper.updateByPrimaryKeySelective(tunnel.getConstructionDesign()) != 1) {
                    System.out.println("constructionDesign修改失败");
                    return new BusinessResult(ErrorCodeEnum.UPDATE_FAILED);
                }
            }

            if (Objects.nonNull(tunnel.getSurroundingEnvironment())) {
                if (surroundingEnvironmentMapper.updateByPrimaryKeySelective(tunnel.getSurroundingEnvironment()) != 1) {
                    System.out.println("surroundingEnvironment修改失败");
                    return new BusinessResult(ErrorCodeEnum.UPDATE_FAILED);
                }
            }

            if (Objects.nonNull(tunnel.getConstructionInformation())) {
                if (constructionInformationMapper.updateByPrimaryKeySelective(tunnel.getConstructionInformation()) != 1) {
                    System.out.println("constructionInformation修改失败");
                    return new BusinessResult(ErrorCodeEnum.UPDATE_FAILED);
                }
            }

            if (Objects.nonNull(tunnel.getMonitoringInformation())) {
                if (monitoringInformationMapper.updateByPrimaryKeySelective(tunnel.getMonitoringInformation()) != 1) {
                    System.out.println("monitoringInformation修改失败");
                    return new BusinessResult(ErrorCodeEnum.UPDATE_FAILED);
                }
            }

            if (Objects.nonNull(tunnel.getSecondaryLining())) {
                if (secondaryLiningMapper.updateByPrimaryKeySelective(tunnel.getSecondaryLining()) != 1) {
                    System.out.println("secondaryLining修改失败");
                    return new BusinessResult(ErrorCodeEnum.UPDATE_FAILED);
                }
            }

            if (Objects.nonNull(tunnel.getBasicFormationInformation())) {
                if (basicFormationInformationMapper.updateByPrimaryKeySelective(tunnel.getBasicFormationInformation()) != 1) {
                    System.out.println("basicFormationInformation修改失败");
                    return new BusinessResult(ErrorCodeEnum.UPDATE_FAILED);
                }
            }

            return new BusinessResult(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new BusinessResult(50000, "Bad SQL");
        }
    }

    @Override
    public BusinessResult getTunnel(String tunnelId) {
        if (StringUtil.isEmpty(tunnelId)) {
            return new BusinessResult(ErrorCodeEnum.PARAM_IS_NULL);
        }

        Tunnel tunnel = tunnelMapper.selectByPrimaryKey(tunnelId);
        if (Objects.isNull(tunnel)) {
            return new BusinessResult(ErrorCodeEnum.TUNNEL_NOT_EXIST);
        }

        return new BusinessResult(true, tunnel);
    }

    @Override
    public BusinessResult listTunnels(Integer pageIndex) {
        if (pageIndex < 1) {
            return new BusinessResult(ErrorCodeEnum.PARAM_IS_NULL);
        }

        List<Tunnel> tunnelList = tunnelMapper.listTunnel((pageIndex - 1) * 10, 10);
        if (Objects.isNull(tunnelList)) {
            return new BusinessResult(ErrorCodeEnum.TUNNEL_NOT_EXIST);
        }

        int totalElement = tunnelMapper.countTunnle();
        int totalPage = totalElement / 10;
        if (totalElement % 10 != 0) {
            totalPage++;
        }

        Map<String, Object> map = new HashMap<>();
        map.put("totalPage", totalPage);
        map.put("currentPage", pageIndex);
        map.put("tunnelList", tunnelList);

        return new BusinessResult(true, map);
    }

    @Override
    public BusinessResult listIdAndName() {
        List<Map<String, String>> list = tunnelMapper.listTunnelName();

        if (Objects.isNull(list)) {
            return new BusinessResult(ErrorCodeEnum.TUNNEL_NOT_EXIST);
        }

        return new BusinessResult(true, list);
    }
}
