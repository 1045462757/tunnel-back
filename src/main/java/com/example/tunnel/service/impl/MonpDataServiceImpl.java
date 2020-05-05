package com.example.tunnel.service.impl;

import com.example.tunnel.mapper.MonpDataMapper;
import com.example.tunnel.service.MonpDataService;
import com.example.tunnel.util.BusinessResult;
import com.example.tunnel.util.ErrorCodeEnum;
import com.example.tunnel.util.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author 10454
 */
@Service
public class MonpDataServiceImpl implements MonpDataService {

    @Resource
    private MonpDataMapper monpDataMapper;

    @Override
    public BusinessResult listMonpData(String monpId, String startTime, String endTime) {
        if (StringUtil.isEmpty(monpId) || StringUtil.isEmpty(startTime) || StringUtil.isEmpty(endTime)) {
            return new BusinessResult(ErrorCodeEnum.PARAM_IS_NULL);
        }

        List<Map<String, String>> monpDatalist = monpDataMapper.listMonpData(monpId, startTime, endTime);

        if (Objects.isNull(monpDatalist)) {
            return new BusinessResult(ErrorCodeEnum.MONPDATA_NOT_EXIST);
        }

        return new BusinessResult(true, monpDatalist);
    }
}
