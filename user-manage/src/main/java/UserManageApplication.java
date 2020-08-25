import org.apache.dubbo.container.Main;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

/**
 * Created by huangzuwang on 18/1/24.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.hzw.*"})
public class UserManageApplication {
    public static void main(String[] args) throws IOException {
//        SpringApplication.run(UserManageApplication.class, args);
//        ServerApp.main(new String[]{});
        Main.main(new String[]{"spring", "log4j"});
        System.out.println(System.in.read());
    }
}
