import com.spring.entity.User;
import com.spring.service.UserService;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/ApplicationContextTest.xml"})
@Transactional
@Rollback
public class Test111 {

    @Autowired
    UserService userService;


    @Test
    public void test(){
        List<User> userList = userService.find("aaa","123qwe");
        System.out.println(userList.size());
    }

}
