package com.supervision.start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * Created by Zeus Feng on 2017/3/16.
 *
 * @author Zeus Feng
 * @date 2017/03/16
 */
@SpringBootApplication
@EnableScheduling
@ComponentScan(value = {
    "com.supervision.dal",
    "com.supervision.start",
    "com.supervision.service",
    "com.supervision.web",
    "com.supervision.task"
})
public class Application {
    public static void main(String[] args) throws Exception {
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));
        argsList.add("-Xms1024m");
        argsList.add("-Xmx2048m");
        //argsList.add("--debug");
        args = argsList.toArray(new String[argsList.size()]);
        //args = new String[]{"-Xms1024m","-Xmx2048m"};
        SpringApplication.run(Application.class,args);
    }
}
