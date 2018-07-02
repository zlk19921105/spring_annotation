package com.zlk.value;

import org.springframework.stereotype.Service;

/**
 * 测试Bean
 */
@Service("userService")
public class UserService {

    public int count() {
        return 10;
    }

    public int max(int size) {
        int count = count();
        return count > size ? count : size;
    }
}