package com.touresBalon.b2c.B2Cbusinesscampaigns.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.*;
import com.touresBalon.b2c.B2Cbusinesscampaigns.controller.ServicesController;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.touresBalon.b2c.B2Cbusinesscampaigns.consumer",
        "com.touresBalon.b2c.B2Cbusinesscampaigns.controller",
        "com.touresBalon.b2c.B2Cbusinesscampaigns.dto",
        "com.touresBalon.b2c.B2Cbusinesscampaigns.entities",
        "com.touresBalon.b2c.B2Cbusinesscampaigns.impl",
        "com.touresBalon.b2c.B2Cbusinesscampaigns.interfaces",
        "com.touresBalon.b2c.B2Cbusinesscampaigns.mapper"

})
@EntityScan("com.touresBalon.b2c.B2Cbusinesscampaigns.entities")
@EnableJpaRepositories("com.touresBalon.b2c.B2Cbusinesscampaigns.consumer")

public class B2CBusinessCampaignsApplication {

	public static void main(String[] args) {
		SpringApplication.run(B2CBusinessCampaignsApplication.class, args);
	}
}
