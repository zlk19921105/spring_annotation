package com.zlk.order;

import org.springframework.stereotype.Component;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/7/4.
 */
@Component
public class RankTwo implements Ranks {
    private String rank = "RankTwo";

    public String toString(){
        return this.rank;
    }
}


