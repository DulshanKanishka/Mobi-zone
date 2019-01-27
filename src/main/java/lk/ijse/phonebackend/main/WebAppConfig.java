package lk.ijse.phonebackend.main;

import lk.ijse.phonebackend.repository.PhoneDetailsRepository;
import lk.ijse.phonebackend.repository.SignUpRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("lk.ijse.phonebackend")
@EnableJpaRepositories(basePackageClasses = {SignUpRepository.class, PhoneDetailsRepository.class})
public abstract class WebAppConfig implements WebMvcConfigurer {
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
