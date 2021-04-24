package src.store.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
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
public class Swagger2Config {
    @Bean
    public Docket createRestApi(Environment environment) {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(true)  //enable是否启动swagger，如果为False，则swagger不能在浏览器中访问
                .select()
                .apis(RequestHandlerSelectors.basePackage("src.store.controller"))
                //过滤什么路径
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //Swagger2展示界面的标题（重要）
                .title("Spring Boot使用Swagger2构建的Restful API")
                //描述信息（主要）
                .description("Swagger2 makes develop more easily")
                .version("1.0")
                .termsOfServiceUrl("https://swagger.io/docs")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                //作者信息
                .contact(new Contact("lujiale", "https://www.github.com/lujiale621/",
                        "751874332@qq.com")).build();
    }
}