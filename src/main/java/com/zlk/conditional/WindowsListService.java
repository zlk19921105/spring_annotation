package com.zlk.conditional;

/**
 * desc:Windows下创建的bean
 *
 * @author zhoulk
 *         Date:  2018/6/27.
 */

public class WindowsListService implements ListService {

    @Override
    public String showListCmd() {

        return "dir";
    }

}