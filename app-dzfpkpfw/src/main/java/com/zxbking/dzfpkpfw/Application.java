package com.zxbking.dzfpkpfw;

import com.ihyht.alyxjs.nbjcpt.component.dao.mybatis.DaoMybatisConfig;
import com.ihyht.alyxjs.nbjcpt.component.swagger.SwaggerConfig;
import com.ihyht.alyxjs.wfw.component.cache.redis.FrameworkCacheConfig;
import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.apache.tomcat.websocket.server.WsSci;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import({
        SwaggerConfig.class
        ,DaoMybatisConfig.class
        ,DaoServiceConfig.class
        ,FrameworkCacheConfig.class
})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
//    @Bean
//    public EmbeddedServletContainerFactory servletContainer() {
//        //将http跳转https
//        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory() {
//            @Override
//            protected void postProcessContext(Context context) {
//                SecurityConstraint constraint = new SecurityConstraint();
//                constraint.setUserConstraint("CONFIDENTIAL");
//                SecurityCollection collection = new SecurityCollection();
//                collection.addPattern("/*");
//                constraint.addCollection(collection);
//                context.addConstraint(constraint);
//            }
//        };
//        //默认http https并存
////        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
//        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
//        return tomcat;
//    }
//
//    @Value("${http.port}")
//    private Integer httpPort;
//    @Value("${server.port}")
//    private Integer httpsPort;
//
//    private Connector createStandardConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
////        只支持http
////        connector.setPort(port());
//        //同时支持http和https
//        connector.setScheme("http");
//        connector.setPort(httpPort);
//        connector.setSecure(false);
//        connector.setRedirectPort(httpsPort);
//        return connector;
//    }
//    /**
//     * 创建wss协议接口
//     * @return
//     */
//    @Bean
//    public TomcatContextCustomizer tomcatContextCustomizer() {
//        System.out.println("TOMCATCONTEXTCUSTOMIZER INITILIZED");
//        return new TomcatContextCustomizer() {
//            @Override
//            public void customize(Context context) {
//                context.addServletContainerInitializer(new WsSci(), null);
//            }
//
//        };
//    }
}
