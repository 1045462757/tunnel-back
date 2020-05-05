package com.example.tunnel.controller;

import com.example.tunnel.domain.Monp;
import com.example.tunnel.service.MonpService;
import com.example.tunnel.util.BusinessResult;
import com.example.tunnel.util.ResponseBody;
import net.sf.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author 10454
 */
@Controller
@CrossOrigin(origins = "https://hylovecode.cn")
public class MonpController {

    @Resource
    private MonpService monpService;

    @GetMapping("/monps")
    public ResponseEntity<String> listMonp(@RequestParam("tunnelId") String tunnelId, @RequestParam("pageIndex") Integer pageIndex) {

        BusinessResult businessResult = monpService.listMonps(tunnelId, pageIndex);

        if (!businessResult.getStatus()) {
            return ResponseEntity.ok(new ResponseBody(businessResult.getErrorCode(), businessResult.getErrorMessage()).toString());
        }

        Map<String, Object> map = (Map<String, Object>) businessResult.getData();

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("monpList", map.get("monpList"));

        jsonObject.put("currentPage", map.get("currentPage"));

        jsonObject.put("totalPage", map.get("totalPage"));

        return ResponseEntity.ok(jsonObject.toString());
    }

    @GetMapping("/monp")
    public ResponseEntity<String> getMonp(@RequestParam("monpId") String monpId) {

        BusinessResult businessResult = monpService.getMonp(monpId);

        if (!businessResult.getStatus()) {
            return ResponseEntity.ok(new ResponseBody(businessResult.getErrorCode(), businessResult.getErrorMessage()).toString());
        }

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("monp", businessResult.getData());

        return ResponseEntity.ok(jsonObject.toString());
    }

    @PostMapping("/monp")
    public ResponseEntity<String> insertMonp(@RequestBody Monp monp) {

        BusinessResult businessResult = monpService.insertMonp(monp);

        if (!businessResult.getStatus()) {
            return ResponseEntity.ok(new ResponseBody(businessResult.getErrorCode(), businessResult.getErrorMessage()).toString());
        }

        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/monp")
    public ResponseEntity<String> deleteMonp(@RequestParam("monpId") String monpId) {

        BusinessResult businessResult = monpService.deleteMonp(monpId);

        if (!businessResult.getStatus()) {
            return ResponseEntity.ok(new ResponseBody(businessResult.getErrorCode(), businessResult.getErrorMessage()).toString());
        }

        return ResponseEntity.ok(null);
    }

    @PutMapping("/monp")
    public ResponseEntity<String> modifyMonp(@RequestBody Monp monp) {

        BusinessResult businessResult = monpService.updateMonp(monp);

        if (!businessResult.getStatus()) {
            return ResponseEntity.ok(new ResponseBody(businessResult.getErrorCode(), businessResult.getErrorMessage()).toString());
        }

        return ResponseEntity.ok(null);
    }

    @GetMapping("/monpList")
    public ResponseEntity<String> getMonpList(@RequestParam("tunnelId") String tunnelId) {

        BusinessResult businessResult = monpService.listIdAndName(tunnelId);

        if (!businessResult.getStatus()) {
            return ResponseEntity.ok(new ResponseBody(businessResult.getErrorCode(), businessResult.getErrorMessage()).toString());
        }

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("monpList", businessResult.getData());

        return ResponseEntity.ok(jsonObject.toString());
    }

}
