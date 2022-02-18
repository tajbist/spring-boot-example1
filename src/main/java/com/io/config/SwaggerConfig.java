package com.io.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.io"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiEndPointInfo());
    }

    public ApiInfo apiEndPointInfo(){
        return new ApiInfoBuilder().title("Spring Boot Rest APIs")
                .description("Customer Test API")
                .contact(new Contact("Somnath Musib", "devneps.com", "info@devneps.com"))
                .license("Devneps 2.0")
                .licenseUrl("http://www.devneps.html")
                .version("0.0.1")
                .build();
    }
}
