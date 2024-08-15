package de.os.dehaar.dokos.api.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class ApiConfig {

    @Bean
    fun springShopOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("DokOS REST API")
                    .description("An API with the purpose of storing Doppelkopf results")
                    .version("0.0.1-SNAPSHOT")
                    .license(
                        License().name("Apache 2.0").url("http://springdoc.org")
                    )
            )
    }
}