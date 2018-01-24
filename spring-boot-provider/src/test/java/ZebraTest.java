import java.util.Arrays;
import java.util.Random;

import javax.annotation.Resource;

import org.joda.time.DateTime;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.lanxiang.springboot.zebra.po.Show;
import com.lanxiang.springboot.zebra.service.ShowService;

/**
 * Created by lanxiang on 2017/11/8.
 */
public class ZebraTest extends BaseTest {

    @Resource
    private ShowService showService;

    @Test
    public void testInject() {
        System.out.println(showService);
    }

    @Test
    public void testInsert() {
        Show show = new Show();
        show.setShowNum(1L);
        show.setShowDate(new DateTime().plusDays(1).toDate());


        showService.insert(show);
    }


    /**
     * batch insert也有问题
     */
    @Test
    public void testBatchInsert() {
        Show show = new Show();
        show.setShowNum(1L);
        show.setShowDate(new DateTime().plusDays(1).toDate());

        Show show1 = new Show();
        show1.setShowNum(1L);
        show1.setShowDate(new DateTime().plusDays(2).toDate());

        showService.insertList(Arrays.asList(show, show1));
    }

    @Test
    public void testManyInsert() {
        int end = 1000;
        Random random = new Random();
        for (int i = 1; i <= end; i++) {
            Show show = new Show();
            show.setShowNum((long) i);
            show.setShowDate(new DateTime().plusDays(random.nextInt(3)).toDate());
            showService.insert(show);
            System.out.println("insert progress : " + i + "/" + end);
        }
    }

    @Test
    public void testSelectById() {
        int id = 1;
        Show show = showService.selectById(id);
        System.out.println(JSON.toJSONString(show));
    }

    @Test
    public void testSelectByIdAndShowDate() {
        int id = 5;
        int showDate = 20171209;
        Show show = showService.selectByIdAndShowDate(id, showDate);
        System.out.println(JSON.toJSONString(show));
    }
}
