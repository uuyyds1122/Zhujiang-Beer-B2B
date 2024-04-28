package com.beer.sell.common.db.uitils;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.beer.sell.common.core.utils.BeanConvertUtils;


import java.util.List;
import java.util.function.Supplier;

/**
 * Mybatis Plus  Page对象转化
 * Page<S> source ---> Page<Member>  source.getRecords()    ---->List<Member>
 * Page<T> target ----> Page<MemberVo>
 *
 * @author zhangwei
 */
public class BeanPageUtils extends BeanConvertUtils {
    public static <S, T> Page<T> convertPage(Page<S> source, Page<T> target, Supplier<T> targetSupplier) {
        /*
         * 先复制外层 page对象
         */
        copyProperties(source, target);
        List<T> ts = convertListTo(source.getRecords(), targetSupplier);
        target.setRecords(ts);
        return target;
    }
}
