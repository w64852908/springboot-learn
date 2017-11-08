import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.lanxiang.springboot.AppStarter;

/**
 * Created by lanxiang on 2017/11/8.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {AppStarter.class})
@WebAppConfiguration
public abstract class BaseTest {

}
