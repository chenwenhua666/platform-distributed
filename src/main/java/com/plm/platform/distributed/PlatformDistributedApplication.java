package com.plm.platform.distributed;

import com.sankuai.inf.leaf.plugin.annotation.EnableLeafServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author crystal
 */

@EnableLeafServer
@SpringBootApplication
public class PlatformDistributedApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformDistributedApplication.class, args);
    }

}
