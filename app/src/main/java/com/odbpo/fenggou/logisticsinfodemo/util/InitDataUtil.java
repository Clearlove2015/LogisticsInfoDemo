package com.odbpo.fenggou.logisticsinfodemo.util;

import com.odbpo.fenggou.logisticsinfodemo.bean.LogisticsInfoBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zc
 * @Time: 2018/10/25 15:36
 * @Desc:
 */
public class InitDataUtil {

    public static List<LogisticsInfoBean> getData() {
        List<LogisticsInfoBean> data = new ArrayList<>();
        data.add(new LogisticsInfoBean("签收", "2018-05-20 13:37:57", "客户 签收人: 他人代收 已签收 感谢使用圆通速递，期待再次为您服务"));
        data.add(new LogisticsInfoBean("", "2018-05-20 09:03:42", "【广东省深圳市宝安区新安公司】 派件人: 陆黄星 派件中 派件员电话13360979918"));
        data.add(new LogisticsInfoBean("", "2018-05-20 08:27:10", "【广东省深圳市宝安区新安公司】 已收入"));
        data.add(new LogisticsInfoBean("", "2018-05-20 04:38:32", "【深圳转运中心】 已收入"));
        data.add(new LogisticsInfoBean("", "2018-05-19 01:27:49", "【北京转运中心】 已发出 下一站 【深圳转运中心】"));
        data.add(new LogisticsInfoBean("", "2018-05-19 01:17:19", "【北京转运中心】 已收入"));
        data.add(new LogisticsInfoBean("", "2018-05-18 18:34:28", "【河北省保定市容城县公司】 已发出 下一站 【北京转运中心】"));
        data.add(new LogisticsInfoBean("已打包", "2018-05-18 18:33:23", "【河北省保定市容城县公司】 已打包"));
        data.add(new LogisticsInfoBean("已收件", "2018-05-18 18:27:21", "【河北省保定市容城县公司】 已收件"));
        return data;
    }

}
