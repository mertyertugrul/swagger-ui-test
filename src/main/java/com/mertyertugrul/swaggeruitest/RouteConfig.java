package com.mertyertugrul.swaggeruitest;

import io.swagger.v3.oas.annotations.Operation;
import org.springdoc.core.annotations.RouterOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;


@Configuration
public class RouteConfig {
    @Bean
    @RouterOperation(
            path = "/api/hello",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET,
            beanClass = MainHandler.class,
            beanMethod = "hello",
            operation = @Operation(
                    operationId = "hello",
                    summary = "hello",
                    description = "hello",
                    tags = {"hello"}
            )
    )
    public RouterFunction<ServerResponse> helloRouter(MainHandler mainHandler){
        return route(GET("/api/hello").and(accept(MediaType.APPLICATION_JSON)), mainHandler::hello);
}

}
