package com.example.tunnel.service.impl;

import com.example.tunnel.domain.Monp;
import com.example.tunnel.mapper.MonpMapper;
import com.example.tunnel.service.MonpService;
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
public class MonpServiceImpl implements MonpService {

    @Resource
    private MonpMapper monpMapper;

    @Override
    public BusinessResult insertMonp(Monp monp) {
        if (Objects.isNull(monp) || Objects.isNull(monp.getTunnel()) ||
                Objects.isNull(monp.getTunnel().getTunnelId()) || Objects.isNull(monp.getName())) {
            return new BusinessResult(ErrorCodeEnum.PARAM_IS_NULL);
        }

        monp.setMonpId(Util.randomId());

        if (monpMapper.insert(monp) != 1) {
            return new BusinessResult(ErrorCodeEnum.INSERT_FAILED);
        }

        return new BusinessResult(true);
    }

    @Override
    public BusinessResult deleteMonp(String monpId) {
        if (StringUtil.isEmpty(monpId)) {
            return new BusinessResult(ErrorCodeEnum.PARAM_IS_NULL);
        }

        Monp monp = monpMapper.selectByPrimaryKey(monpId);

        if (Objects.isNull(monp)) {
            return new BusinessResult(ErrorCodeEnum.MONP_NOT_EXIST);
        }

        if (monpMapper.deleteByPrimaryKey(monpId) != 1) {
            return new BusinessResult(ErrorCodeEnum.DELETE_FAILED);
        }

        return new BusinessResult(true);
    }

    @Override
    public BusinessResult updateMonp(Monp monp) {
        if (Objects.isNull(monp) || Objects.isNull(monp.getMonpId())) {
            return new BusinessResult(ErrorCodeEnum.PARAM_IS_NULL);
        }

        try {
            if (monpMapper.updateByPrimaryKeySelective(monp) != 1) {
                return new BusinessResult(ErrorCodeEnum.UPDATE_FAILED);
            }
            return new BusinessResult(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new BusinessResult(50000, "Bad SQL");
        }
    }

    @Override
    public BusinessResult getMonp(String monpId) {
        if (StringUtil.isEmpty(monpId)) {
            return new BusinessResult(ErrorCodeEnum.PARAM_IS_NULL);
        }

        Monp monp = monpMapper.selectByPrimaryKey(monpId);

        if (Objects.isNull(monp)) {
            return new BusinessResult(ErrorCodeEnum.MONP_NOT_EXIST);
        }

        return new BusinessResult(true, monp);
    }

    @Override
    public BusinessResult listMonps(String tunnelId, Integer pageIndex) {
        if (StringUtil.isEmpty(tunnelId) || pageIndex < 1) {
            return new BusinessResult(ErrorCodeEnum.PARAM_IS_NULL);
        }

        List<Monp> monpList = monpMapper.listMonp(tunnelId, (pageIndex - 1) * 10, 10);
        if (Objects.isNull(monpList)) {
            return new BusinessResult(ErrorCodeEnum.MONP_NOT_EXIST);
        }

        int totalElement = monpMapper.countMonp();
        int totalPage = totalElement / 10;
        if (totalElement % 10 != 0) {
            totalPage++;
        }

        Map<String, Object> map = new HashMap<>();
        map.put("totalPage", totalPage);
        map.put("currentPage", pageIndex);
        map.put("monpList", monpList);

        return new BusinessResult(true, map);
    }

    @Override
    public BusinessResult listIdAndName(String tunnelId) {
        if (StringUtil.isEmpty(tunnelId)) {
            return new BusinessResult(ErrorCodeEnum.PARAM_IS_NULL);
        }

        List<Map<String, String>> list = monpMapper.listTunnelName(tunnelId);

        if (Objects.isNull(list)) {
            return new BusinessResult(ErrorCodeEnum.MONP_NOT_EXIST);
        }

        return new BusinessResult(true, list);
    }
}
