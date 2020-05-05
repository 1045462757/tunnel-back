package com.example.tunnel.controller;

import com.example.tunnel.service.MonpDataService;
import com.example.tunnel.util.BusinessResult;
import com.example.tunnel.util.ResponseBody;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

/**
 * @author 10454
 */
@Controller
@CrossOrigin(origins = "https://hylovecode.cn")
public class MonpDataController {

    @Resource
    private MonpDataService monpDataService;

    @GetMapping("monpDataList")
    public ResponseEntity<String> listMonpData(@Param("monpId") String monpId, @Param("time") String[] time) {

        if (time == null || time.length == 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        String startTime = time[0];
        String endTime = time[1];

        startTime = startTime.replace("[", "");
        startTime = startTime.replace("\"", "");

        endTime = endTime.replace("]", "");
        endTime = endTime.replace("\"", "");

        BusinessResult businessResult = monpDataService.listMonpData(monpId, startTime, endTime);

        if (!businessResult.getStatus()) {
            return ResponseEntity.ok(new ResponseBody(businessResult.getErrorCode(), businessResult.getErrorMessage()).toString());
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        List<Map<String, String>> monpDatalist = (List<Map<String, String>>) businessResult.getData();

        JSONArray list = new JSONArray();

        for (Map<String, String> map : monpDatalist) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("time", sdf.format(map.get("time")));
            jsonObject.put("value", map.get("value"));
            list.add(jsonObject);
        }

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("monpDataList", list);

        return ResponseEntity.ok(jsonObject.toString());
    }

}
