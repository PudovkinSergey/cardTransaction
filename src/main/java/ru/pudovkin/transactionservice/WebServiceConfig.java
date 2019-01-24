package ru.pudovkin.transactionservice;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(context);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet,"/ws/*");
    }

    @Bean(name="transactions")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema transactionSchema){
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("TransactionPort");
        definition.setTargetNamespace("http://pudovkin.ru/sendedtransactions");
        definition.setLocationUri("/ws");
        definition.setSchema(transactionSchema);
        return definition;
    }

    @Bean
    public XsdSchema transactionSchema(){
        return new SimpleXsdSchema(new ClassPathResource("transaction-details.xsd"));
    }

}
