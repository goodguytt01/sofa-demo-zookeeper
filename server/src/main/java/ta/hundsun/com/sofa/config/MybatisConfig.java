package ta.hundsun.com.sofa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import tk.mybatis.spring.annotation.MapperScan;

@Component
@MapperScan("ta.hundsun.com.sofa.mapper")
public class MybatisConfig {
}
