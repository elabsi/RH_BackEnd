package ma.ensa.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import ma.ensa.security.jwt.JwtAuthEntryPoint;
import ma.ensa.security.jwt.JwtAuthTokenFilter;
import ma.ensa.security.services.UserDetailsServiceImpl;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
		prePostEnabled = true
)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Autowired
    private JwtAuthEntryPoint unauthorizedHandler;

    @Bean
    public JwtAuthTokenFilter authenticationJwtTokenFilter() {
        return new JwtAuthTokenFilter();
    }

    @Override
    public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder());
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable().
                authorizeRequests()
                .antMatchers("/file/**").permitAll()
                .antMatchers("/demande*/**").access("hasRole('ROLE_CHEF_SERVICE')  or hasRole('ROLE_EMPLOYE') or hasRole('ROLE_ROOT')")
                .antMatchers("/utilisateur/**").access("hasRole('ROLE_RH') or hasRole('ROLE_CHEF_SERVICE') or hasRole('ROLE_ADMINISTRATEUR') or hasRole('ROLE_EMPLOYE') or hasRole('ROLE_ROOT')")
                .antMatchers("/collaborateur/**").access("hasRole('ROLE_RH') or hasRole('ROLE_ROOT') ")
                .antMatchers("/auth/signup").access("hasRole('ROLE_RH') ")
                .antMatchers("/parametres/*/all*").access("hasRole('ROLE_CHEF_SERVICE') or hasRole('ROLE_RH') or hasRole('ROLE_EMPLOYE') or hasRole('ROLE_ADMINISTRATEUR')")
                .antMatchers("/parametres/**").access("hasRole('ROLE_ADMINISTRATEUR')")
                .antMatchers("/auth/signin").permitAll()
                .anyRequest().authenticated()
                .and()
                .exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        
        http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
    }
}