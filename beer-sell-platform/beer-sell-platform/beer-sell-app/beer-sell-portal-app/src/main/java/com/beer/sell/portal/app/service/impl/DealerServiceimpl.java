package com.beer.sell.portal.app.service.impl;

import com.beer.sell.common.core.response.ResponseEntity;
import com.beer.sell.common.core.utils.BeanConvertUtils;
import com.beer.sell.portal.app.common.dto.Dealerinfo;
import com.beer.sell.portal.app.entity.Dealer;
import com.beer.sell.portal.app.mapper.DealerMapper;
import com.beer.sell.portal.app.service.DealerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author XDD
 * @create 2024--04--26 20:37
 **/
@Service
public class DealerServiceimpl implements DealerService {

    @Resource
    private DealerMapper dealerMapper;

    @Override
    public Dealerinfo mod_dealer(long dealerID, String status) {

        /**
         * 进行经销商账号激活
         * 1.先判断经销商ID是否存在
         * 2.如果存在 则修改经销商状态 不存在抛出异常
         *
         */
        //查询经销商ID是否存在
        Dealer dealer = dealerMapper.selectById(dealerID);
        if(dealer == null){

            throw new RuntimeException("经销商用户不存在请联系管理员");
        }

        //修改经销商状态
        dealer.setStatus("1");
        int i = dealerMapper.updateById(dealer);

        //将po对象转Vo对象
        Dealerinfo dealerinfo = BeanConvertUtils.convertTo(dealer, Dealerinfo::new);
        //判断是否修改成功
        if (i == 0){
            throw new RuntimeException("经销商账号激活失败");
        }
        return dealerinfo;
    }

    @Override
    public Dealerinfo list_dealer(long dealerID) {
        Dealer dealer = dealerMapper.selectById(dealerID);
        //将po对象转Vo对象
        Dealerinfo dealerinfo = BeanConvertUtils.convertTo(dealer, Dealerinfo::new);
        return dealerinfo;

    }
}
