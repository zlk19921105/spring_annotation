package com.zlk.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/7/4.
 */
@Component
public class Results {
    @Autowired
    private List<Ranks> ranks ;

    @Override
    public String toString(){
        return ranks.toString();
    }

}
