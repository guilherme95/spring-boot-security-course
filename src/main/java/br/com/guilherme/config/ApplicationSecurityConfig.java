package br.com.guilherme.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // diz para a req que necessita de autorizacao
                .authorizeRequests()
                // para urls customizadas|determinadas ha possibilidade
                .antMatchers("/", "index", "/css/*", "/js/*")
                // permite em relacao ao passado anterioremente
                .permitAll()
                // em cima de qualquer req
                .anyRequest()
                // autenticacao
                .authenticated()
                .and()
                // sobre qualquer http req
                .httpBasic();
    }
}
