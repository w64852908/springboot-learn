import java.util.Random;

import javax.annotation.Resource;

import org.joda.time.DateTime;
import org.junit.Test;

import com.lanxiang.springboot.zebra.po.Selllog;
import com.lanxiang.springboot.zebra.service.SelllogService;

/**
 * Created by lanxiang on 2018/1/24.
 */
public class SelllogTest extends BaseTest {

    @Resource
    private SelllogService selllogService;

    private Random random = new Random();

    @Test
    public void testInsert() {
        int total = 5;
        for (int i = 0; i < total; i++) {
            Selllog selllog = new Selllog();
            selllog.setType(1);
            selllog.setOrderId(random.nextInt(10000000));
            selllog.setCinemaId(random.nextInt(10000));
            selllog.setSource(random.nextInt(100));
            DateTime now = new DateTime();
            int minusDays = random.nextInt(100);
            if (minusDays > 10) {
                selllog.setCreateDate(now.minusDays(minusDays).toDate());
            } else {
                selllog.setCreateDate(now.plusDays(random.nextInt(7)).toDate());
            }
            selllog.setCreateTime(now.toDate());
            selllogService.insert(selllog);
        }
    }


    @Test
    public void testQuery() {

    }
}
