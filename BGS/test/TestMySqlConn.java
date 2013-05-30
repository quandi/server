import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.quandi.bgs.bean.User;
import com.quandi.bgs.dao.UserDao;

public class TestMySqlConn
{
    
    public static void main(String[] args)
        throws IOException
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("global.datasource.xml");
        UserDao userDao = (UserDao)context.getBean("userDao");
        User user = userDao.selectUser();
        System.out.println(user);
        
    }
    
}
