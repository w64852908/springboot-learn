import javax.annotation.Resource;

import org.joda.time.DateTime;
import org.junit.Test;

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
        show.setShowDate(new DateTime().minusMinutes(1).toDate());
        showService.insert(show);
    }
}
