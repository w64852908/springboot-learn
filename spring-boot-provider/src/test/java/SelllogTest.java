import java.util.Date;
import java.util.Random;

import javax.annotation.Resource;

import org.joda.time.DateTime;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
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
        int total = 100;
        for (int i = 0; i < total; i++) {
            Selllog selllog = new Selllog();
            selllog.setType(1);
            selllog.setOrderId(random.nextInt(10000000));
            selllog.setCinemaId(random.nextInt(10000));
            selllog.setSource(random.nextInt(100));
            DateTime now = new DateTime();
            int minusDays = random.nextInt(100);
            if (minusDays > 30) {
                selllog.setCreateDate(now.minusDays(minusDays).toDate());
            } else {
                selllog.setCreateDate(now.plusDays(random.nextInt(7)).toDate());
            }
            selllog.setCreateTime(now.toDate());
            selllogService.insert(selllog);
        }
    }

    @Test
    public void testInsertForDateData() {
        Selllog selllog = new Selllog();
        selllog.setType(1);
        selllog.setOrderId(random.nextInt(10000000));
        selllog.setCinemaId(random.nextInt(10000));
        selllog.setSource(random.nextInt(100));
        String date = "2017-01-01";
        DateTime createdDate = DateTime.parse(date);
        selllog.setCreateDate(createdDate.toDate());
        selllog.setCreateTime(new Date());
        selllogService.insert(selllog);
    }

    @Test
    public void testInsertByAnnotation() {
        Selllog selllog = new Selllog();
        selllog.setType(1);
        selllog.setOrderId(random.nextInt(10000000));
        selllog.setCinemaId(random.nextInt(10000));
        selllog.setSource(random.nextInt(100));
        selllog.setCreateDate(new Date());
        selllog.setCreateTime(new Date());
        Long id = selllogService.insertByAnnotation(selllog);
        System.out.println("==============================" + id);
    }

    @Test
    public void testQuery() {
        DateTime dateTime = new DateTime(2017, 12, 6, 0, 0, 0);
        Selllog log = selllogService.queryByIdAndCreateDate(811L, dateTime.toDate());
        System.out.println(JSON.toJSONString(log));
        dateTime = new DateTime(2018, 1, 28, 0, 0, 0);
        log = selllogService.queryByIdAndCreateDate(10L, dateTime.toDate());
        System.out.println(JSON.toJSONString(log));
    }

    @Test
    public void testQueryByProvider() {
        DateTime dateTime = new DateTime(2017, 12, 20, 0, 0, 0);
        Selllog log = selllogService.queryByIdAndCreateDateFromProvider(811L, dateTime.toDate());
        System.out.println(JSON.toJSONString(log));
        dateTime = new DateTime(2018, 1, 24, 0, 0, 0);
        log = selllogService.queryByIdAndCreateDateFromProvider(10L, dateTime.toDate());
        System.out.println(JSON.toJSONString(log));
    }
}
