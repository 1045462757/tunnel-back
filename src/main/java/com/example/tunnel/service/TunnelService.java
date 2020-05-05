package com.example.tunnel.service;

import com.example.tunnel.domain.Tunnel;
import com.example.tunnel.util.BusinessResult;

/**
 * @author 10454
 */
public interface TunnelService {

    /**
     * 添加Tunnel
     *
     * @param tunnelName  隧道名
     * @param tunnelIntro 隧道简介
     * @return BusinessResult
     */
    BusinessResult insertTunnel(String tunnelName, String tunnelIntro);

    /**
     * 删除Tunnel
     *
     * @param tunnelId 隧道Id
     * @return BusinessResult
     */
    BusinessResult deleteTunnel(String tunnelId);

    /**
     * 修改Tunnel
     *
     * @param tunnel 隧道
     * @return BusinessResult
     */
    BusinessResult updateTunnel(Tunnel tunnel);

    /**
     * 获取Tunnel
     *
     * @param tunnelId 隧道Id
     * @return BusinessResult
     */
    BusinessResult getTunnel(String tunnelId);

    /**
     * 获取Tunnel集合
     *
     * @param pageIndex 页码
     * @return BusinessResult
     */
    BusinessResult listTunnels(Integer pageIndex);

    /**
     * 获取Id和Name
     *
     * @return BusinessResult
     */
    BusinessResult listIdAndName();
}
