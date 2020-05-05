package com.example.tunnel.service;

import com.example.tunnel.util.BusinessResult;

public interface MonpDataService {

    /**
     * 获取监测数据
     *
     * @param monpId    监测点名称
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return
     */
    BusinessResult listMonpData(String monpId, String startTime, String endTime);
}
