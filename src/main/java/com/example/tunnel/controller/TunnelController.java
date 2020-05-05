package com.example.tunnel.controller;

import com.example.tunnel.domain.Tunnel;
import com.example.tunnel.service.TunnelService;
import com.example.tunnel.util.BusinessResult;
import com.example.tunnel.util.ResponseBody;
import net.sf.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author 10454
 */
@Controller
//@CrossOrigin(origins = "http://127.0.0.1:8080")
@CrossOrigin(origins = "https://hylovecode.cn")
public class TunnelController {

    @Resource
    private TunnelService tunnelService;

    @GetMapping("/")
    public ModelAndView demo() {
        return new ModelAndView("index");
    }

    @GetMapping("/tunnels")
    public ResponseEntity<String> listTunnel(@RequestParam("pageIndex") Integer pageIndex) {

        BusinessResult businessResult = tunnelService.listTunnels(pageIndex);

        if (!businessResult.getStatus()) {
            return ResponseEntity.ok(new ResponseBody(businessResult.getErrorCode(), businessResult.getErrorMessage()).toString());
        }

        Map<String, Object> map = (Map<String, Object>) businessResult.getData();

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("tunnelList", map.get("tunnelList"));

        jsonObject.put("currentPage", map.get("currentPage"));

        jsonObject.put("totalPage", map.get("totalPage"));

        return ResponseEntity.ok(jsonObject.toString());
    }

    @GetMapping("/tunnel")
    public ResponseEntity<String> getTunnel(@RequestParam("tunnelId") String tunnelId) {

        BusinessResult businessResult = tunnelService.getTunnel(tunnelId);

        if (!businessResult.getStatus()) {
            return ResponseEntity.ok(new ResponseBody(businessResult.getErrorCode(), businessResult.getErrorMessage()).toString());
        }

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("tunnel", businessResult.getData());

        return ResponseEntity.ok(jsonObject.toString());
    }

    @PostMapping("/tunnel")
    public ResponseEntity<String> insertTunnel(@RequestParam("tunnelName") String tunnelName, @RequestParam("tunnelIntro") String tunnelIntro) {

        BusinessResult businessResult = tunnelService.insertTunnel(tunnelName, tunnelIntro);

        if (!businessResult.getStatus()) {
            return ResponseEntity.ok(new ResponseBody(businessResult.getErrorCode(), businessResult.getErrorMessage()).toString());
        }

        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/tunnel")
    public ResponseEntity<String> deleteTunnel(@RequestParam("tunnelId") String tunnelId) {

        BusinessResult businessResult = tunnelService.deleteTunnel(tunnelId);

        if (!businessResult.getStatus()) {
            return ResponseEntity.ok(new ResponseBody(businessResult.getErrorCode(), businessResult.getErrorMessage()).toString());
        }

        return ResponseEntity.ok(null);
    }

    @PutMapping("/tunnel")
    public ResponseEntity<String> modifyTunnel(@RequestBody Tunnel tunnel) {

        BusinessResult businessResult = tunnelService.updateTunnel(tunnel);

        if (!businessResult.getStatus()) {
            return ResponseEntity.ok(new ResponseBody(businessResult.getErrorCode(), businessResult.getErrorMessage()).toString());
        }

        return ResponseEntity.ok(null);
    }

    @GetMapping("/tunnelList")
    public ResponseEntity<String> getTunnelList() {

        BusinessResult businessResult = tunnelService.listIdAndName();

        if (!businessResult.getStatus()) {
            return ResponseEntity.ok(new ResponseBody(businessResult.getErrorCode(), businessResult.getErrorMessage()).toString());
        }

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("tunnelList", businessResult.getData());

        return ResponseEntity.ok(jsonObject.toString());
    }

}
