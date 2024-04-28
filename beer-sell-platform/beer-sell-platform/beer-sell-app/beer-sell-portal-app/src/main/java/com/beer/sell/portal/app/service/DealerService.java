package com.beer.sell.portal.app.service;

import com.beer.sell.portal.app.common.dto.Dealerinfo;

/**
 * @Author XDD
 * @create 2024--04--26 20:37
 **/
public interface DealerService {
    /**
     * 修改经销商状态值
     * @param dealerID
     * @param status
     * @return
     */
    Dealerinfo mod_dealer(long dealerID, String status);


    Dealerinfo list_dealer(long dealerID);

}
