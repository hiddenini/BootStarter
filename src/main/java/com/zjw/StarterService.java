package com.zjw;

import org.springframework.util.StringUtils;

/**
 * Created by xz on 2019/9/19.
 */
public class StarterService {
    private String config;

    public StarterService(String config) {
        this.config = config;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.config, separatorChar);
    }

}
