package com.beer.sell.portal.app.controller;

import com.beer.sell.common.core.response.ResponseEntity;
import com.beer.sell.portal.app.common.dto.Dealerinfo;
import com.beer.sell.portal.app.service.DealerService;


import io.swagger.annotations.Api;
import org.apiguardian.api.API;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @Author XDD
 * @create 2024--04--26 20:26
 **/

@RestController
@RequestMapping("/dealer")
@Api(tags = "经销商测试文档")
public class Dealercontroller {

    @Resource
    private DealerService dealerService;

    /**
     * 经销商激活账号 -> 修改状态值为 1
     */

    @PostMapping("/mod")
    public ResponseEntity<Dealerinfo> mod_dealer(long dealerID, String status){

        return ResponseEntity.success(dealerService.mod_dealer(dealerID, status));
    }

    @GetMapping("/list_dealer")
    public ResponseEntity<Dealerinfo> list_dealer(long dealerID){

        return ResponseEntity.success(dealerService.list_dealer(dealerID));
    }

}
