import javax.annotation.Resource;

import org.junit.Test;

import com.lanxiang.springboot.aoplearn.ILockSeatService;

/**
 * Created by lanxiang on 2018/1/3.
 */
public class AOPTest extends BaseTest {

    @Resource
    private ILockSeatService lockSeatService;

    @Test
    public void test1() {
        String res = lockSeatService.lockSeat();
        System.out.println(res);
    }
}
