/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-11-14</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author huangjy
 * @since v1.0
 */
@Service
public class HelloService {
    public String sayHi(){
        return "hi Spring";
    }
}
