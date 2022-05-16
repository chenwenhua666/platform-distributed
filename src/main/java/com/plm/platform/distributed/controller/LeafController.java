package com.plm.platform.distributed.controller;

import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.service.SegmentService;
import com.sankuai.inf.leaf.service.SnowflakeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author crystal
 */
@RestController
@RequiredArgsConstructor
public class LeafController {

    private final SegmentService segmentService;
    private final SnowflakeService snowflakeService;

    @RequestMapping(value = "/api/segment/{key}")
    public Result getSegmentId(@PathVariable("key") String key) {
        return segmentService.getId(key);
    }

    @RequestMapping(value = "/api/snowflake/{key}")
    public Result getSnowflakeId(@PathVariable("key") String key) {
        return snowflakeService.getId(key);
    }
}
