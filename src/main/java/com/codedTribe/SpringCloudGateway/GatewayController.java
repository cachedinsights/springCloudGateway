package com.codedTribe.SpringCloudGateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController
{
    @GetMapping("/defaultFallback")
    public String defaultMessage()
    {
        return "There were some error in connecting. Please try again later.";
    }
}
