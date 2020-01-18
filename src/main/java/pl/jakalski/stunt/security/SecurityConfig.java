package pl.jakalski.stunt.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        String encodedPassword = passwordEncoder.encode("1234");

        auth.inMemoryAuthentication()
                .passwordEncoder(passwordEncoder)
                .withUser("user01").password(encodedPassword).roles("USER")
                .and()
                .withUser("user02").password(encodedPassword).roles("USER")
                .and()
                .withUser("user03").password(encodedPassword).roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/login")
                .permitAll()

                .antMatchers("/**")
                .hasAnyRole("USER")
                .and()

                .formLogin()
                //.loginPage("/login")
                .loginProcessingUrl("/perform_login")
                .defaultSuccessUrl("/home.html")
                .failureUrl("/login?error=true")
                .permitAll()
                .and()

                .logout()
                .logoutUrl("/perform_logout")
                .logoutSuccessUrl("/login")
                .invalidateHttpSession(true)
                .deleteCookies("JSESSIONID")
                .permitAll()

                .and()
                .csrf()
                .disable();
    }
}
