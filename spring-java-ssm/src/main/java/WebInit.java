/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-11-13</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 *
 * @author huangjy
 * @since v1.0
 */
public class WebInit implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        //加载Spring MVC的配置
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMVCConfig.class);

        //添加DispatcherServlet
        ServletRegistration.Dynamic springmvc = servletContext.addServlet("springmvc", new DispatcherServlet(ctx));

        //添加DispatcherServlet
        springmvc.addMapping("/");

        //启动时机
        springmvc.setLoadOnStartup(1);
    }
}
