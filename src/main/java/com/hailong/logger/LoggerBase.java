package com.hailong.logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.List;

/**
 * 最基本的系统Logger操作
 */
public class LoggerBase implements ApplicationListener<ContextRefreshedEvent>{

    /**
     * 启动的日志的级别
     */
    @Value("${baseboot.enable.logger.types:Server}")
    private List<String> loggerTypes;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        if(contextRefreshedEvent.getApplicationContext().getParent()==null){





        }

    }
}
