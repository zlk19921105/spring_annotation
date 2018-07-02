package com.zlk.conditional;

/**
 * desc:linux下创建的Bean
 *
 * @author zhoulk
 *         Date:  2018/6/27.
 */
public class LinuxListService implements ListService {

    @Override
    public String showListCmd() {

        return "ls";
    }

}