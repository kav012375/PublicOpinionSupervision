package com.supervision.web;

import java.util.List;

import com.supervision.dal.conf.domain.entity.ConfDomainDO;
import com.supervision.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zeus Feng on 2017/3/17.
 *
 * @author Zeus Feng
 * @date 2017/03/17
 */
@RestController
@RequestMapping(value = "/test")
public class TestMvc {
    @Autowired
    TestService testService;

    @ResponseBody
    @RequestMapping(value = "/tt")
    public List<ConfDomainDO> ttMvc(){
        return testService.test();
    }

    @ResponseBody
    @RequestMapping(value = "/tt2")
    public String tt2Mvc(){
        String obj = "{\n"
            + "  \"draw\": 10,\n"
            + "  \"recordsTotal\": 57,\n"
            + "  \"recordsFiltered\": 57,\n"
            + "  \"data\": [\n"
            + "    [\n"
            + "      \"Airi\",\n"
            + "      \"Satou\",\n"
            + "      \"Accountant\",\n"
            + "      \"Tokyo\",\n"
            + "      \"2008/11/28\",\n"
            + "      162700\n"
            + "    ],\n"
            + "    [\n"
            + "      \"Angelica\",\n"
            + "      \"Ramos\",\n"
            + "      \"Chief Executive Officer (CEO)\",\n"
            + "      \"London\",\n"
            + "      \"2009/10/09\",\n"
            + "      1200000\n"
            + "    ],\n"
            + "    [\n"
            + "      \"Ashton\",\n"
            + "      \"Cox\",\n"
            + "      \"Junior Technical Author\",\n"
            + "      \"San Francisco\",\n"
            + "      \"2009/01/12\",\n"
            + "      86000\n"
            + "    ],\n"
            + "    [\n"
            + "      \"Bradley\",\n"
            + "      \"Greer\",\n"
            + "      \"Software Engineer\",\n"
            + "      \"London\",\n"
            + "      \"2012/10/13\",\n"
            + "      132000\n"
            + "    ],\n"
            + "    [\n"
            + "      \"Brenden\",\n"
            + "      \"Wagner\",\n"
            + "      \"Software Engineer\",\n"
            + "      \"San Francisco\",\n"
            + "      \"2011/06/07\",\n"
            + "      206850\n"
            + "    ],\n"
            + "    [\n"
            + "      \"Brielle\",\n"
            + "      \"Williamson\",\n"
            + "      \"Integration Specialist\",\n"
            + "      \"New York\",\n"
            + "      \"2012/12/02\",\n"
            + "      372000\n"
            + "    ],\n"
            + "    [\n"
            + "      \"Bruno\",\n"
            + "      \"Nash\",\n"
            + "      \"Software Engineer\",\n"
            + "      \"London\",\n"
            + "      \"2011/05/03\",\n"
            + "      163500\n"
            + "    ],\n"
            + "    [\n"
            + "      \"Caesar\",\n"
            + "      \"Vance\",\n"
            + "      \"Pre-Sales Support\",\n"
            + "      \"New York\",\n"
            + "      \"2011/12/12\",\n"
            + "      106450\n"
            + "    ],\n"
            + "    [\n"
            + "      \"Cara\",\n"
            + "      \"Stevens\",\n"
            + "      \"Sales Assistant\",\n"
            + "      \"New York\",\n"
            + "      \"2011/12/06\",\n"
            + "      145600\n"
            + "    ],\n"
            + "    [\n"
            + "      \"Cedric\",\n"
            + "      \"Kelly\",\n"
            + "      \"Senior Javascript Developer\",\n"
            + "      \"Edinburgh\",\n"
            + "      \"2012/03/29\",\n"
            + "      433060\n"
            + "    ]\n"
            + "  ]\n"
            + "}";

        return obj;
    }
}
