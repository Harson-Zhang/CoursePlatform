package cn.young.common;

import cn.young.manager.common.RedisPool;
import org.junit.Assert;

/**
 * @author Harson
 * @version 1.0
 * @date 2019/9/11 16:43
 */
public class TestRedis {
    public static void main(String[] args) {
        RedisPool.set("hello", "world");
        Assert.assertEquals(RedisPool.get("hello"), "world");
    }
}
