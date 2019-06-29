import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by huangzuwang on 18/1/24.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.hzw.*"})
public class UserManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserManageApplication.class, args);
    }
}
