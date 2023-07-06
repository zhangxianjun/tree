package team.flint.tree.kit.config;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import com.flint.parent.filter.Gateway;

@Configuration
public class FilterBean {
    @Bean
    @Order(value = 0)
    public FilterRegistrationBean<Gateway> gateway() {
        FilterRegistrationBean<Gateway> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new Gateway());
        registrationBean.addUrlPatterns("/*"); // 拦截所有的请求
        return registrationBean;
    }

}
