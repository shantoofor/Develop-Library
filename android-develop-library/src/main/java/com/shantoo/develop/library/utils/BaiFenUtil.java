package com.shantoo.develop.library.utils;

import java.text.NumberFormat;

/**
 * 作者: shantoo on 2017/4/10 13:22.
 */

public class BaiFenUtil {

    public static int getBaiFenShu(long current,long total){
        NumberFormat nf = NumberFormat.getPercentInstance();
        //设置百分数精确度2即保留两位小数
        nf.setMinimumFractionDigits(0);
        float baifen = (float)current/total;
        return Integer.valueOf(nf.format(baifen).replace("%",""));
    }
}
