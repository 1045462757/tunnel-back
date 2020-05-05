package com.example.tunnel.service;

import com.example.tunnel.domain.Monp;
import com.example.tunnel.util.BusinessResult;

public interface MonpService {

    /**
     * 添加Monp
     *
     * @param monp monp
     * @return BusinessResult
     */
    BusinessResult insertMonp(Monp monp);

    /**
     * 删除Monp
     *
     * @param monpId monpId
     * @return BusinessResult
     */
    BusinessResult deleteMonp(String monpId);

    /**
     * 修改Monp
     *
     * @param monp monp
     * @return BusinessResult
     */
    BusinessResult updateMonp(Monp monp);

    /**
     * 获取Monp
     *
     * @param monpId monpId
     * @return BusinessResult
     */
    BusinessResult getMonp(String monpId);

    /**
     * 获取Monp集合
     *
     * @param tunnelId  隧道Id
     * @param pageIndex 页码
     * @return BusinessResult
     */
    BusinessResult listMonps(String tunnelId, Integer pageIndex);

    /**
     * 获取Id和Name
     *
     * @param tunnelId 隧道Id
     * @return BusinessResult
     */
    BusinessResult listIdAndName(String tunnelId);
}
