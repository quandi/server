import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.quandi.bgs.bean.User;
import com.quandi.bgs.service.UserService;

public class TestMySqlConn
{
    
    public static void main(String[] args)
        throws Exception
    {
        @SuppressWarnings("resource")
        ApplicationContext context =
            new ClassPathXmlApplicationContext(new String[] {"applicationContext-datasource.xml",
                "applicationContext-service.xml"});
        UserService userService = (UserService)context.getBean("userService");
        User user = userService.findUser("1");
        System.out.println(user);
        
        user = new User();
        user.setId("9");
        user.setAge(111);
        user.setName("zhang san");
        userService.insertUser(user);
        
    }
}
