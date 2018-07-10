package com.zlk.order;

import org.springframework.stereotype.Component;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/7/4.
 */
@Component
public class RankThree implements Ranks{
    private String rank = "RankThree";

    public String toString(){
        return this.rank;
    }

}
