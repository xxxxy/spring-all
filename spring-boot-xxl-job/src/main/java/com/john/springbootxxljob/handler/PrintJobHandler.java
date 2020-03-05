/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2020-03-05</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.springbootxxljob.handler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author huangjy
 * @since v1.0
 */

@Component
public class PrintJobHandler {
    private static final Logger logger = LoggerFactory.getLogger(PrintJobHandler.class);

    @XxlJob("PrintJobHandler")
    public ReturnT<String> execute(String param) throws Exception {
        XxlJobLogger.log("print something!");
        logger.info("---PrintJobHandler is starting!---");
        return ReturnT.SUCCESS;
    }
}
