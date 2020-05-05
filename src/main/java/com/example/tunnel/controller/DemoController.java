package com.example.tunnel.controller;

import com.example.tunnel.domain.Sheet1;
import com.example.tunnel.mapper.Sheet1Mapper;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tiger
 * @version 1.0
 * @date 2020/4/10
 */
@Controller
@CrossOrigin(origins = "https://hylovecode.cn")
public class DemoController {

//    @Resource
//    private Sheet1Mapper sheet1Mapper;
//
//    @GetMapping("/")
//    public ModelAndView demo() {
//        return new ModelAndView("index");
//    }
//
//    @GetMapping("/select")
//    public ResponseEntity<String> select(@Param("deviceId") String deviceId, @Param("time") String[] time) {
//
//        if (deviceId == null || time == null || time.length == 0) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//        String startTime = time[0];
//        String endTime = time[1];
//
//        startTime = startTime.replace("[", "");
//        startTime = startTime.replace("\"", "");
//
//        endTime = endTime.replace("]", "");
//        endTime = endTime.replace("\"", "");
//
//        List<Sheet1> list = sheet1Mapper.select(deviceId, startTime, endTime);
//
//        List<String> xData = new ArrayList<>();
//        List<String> yData = new ArrayList<>();
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
//
//        for (Sheet1 sheet1 : list) {
//            xData.add(sdf.format(sheet1.getCreateTime()));
//            yData.add(sheet1.getSurveyReslut());
//        }
//
//        JSONObject jsonObject = new JSONObject();
//
//        jsonObject.put("xData", xData);
//
//        jsonObject.put("yData", yData);
//
//        return ResponseEntity.ok(jsonObject.toString());
//    }
}
