package com.liu;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
	// public class App extends WebMvcConfigurerAdapter {

	// 集成方式实现自定义json序列化
	// @Override
	// public void configureMessageConverters(
	// List<HttpMessageConverter<?>> converters) {
	// super.configureMessageConverters(converters);
	//
	// FastJsonHttpMessageConverter fastConverter = new
	// FastJsonHttpMessageConverter();
	// FastJsonConfig fastJsonConfig = new FastJsonConfig();
	// fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
	// //处理中文乱码问题
	// List<MediaType> fastMediaTypes = new ArrayList<MediaType>();
	// fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
	// fastConverter.setSupportedMediaTypes(fastMediaTypes);
	// fastConverter.setFastJsonConfig(fastJsonConfig);
	// converters.add(fastConverter);
	// }

	// bean注入方式实现自定义json序列化
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		// 处理中文乱码问题
		List<MediaType> fastMediaTypes = new ArrayList<MediaType>();
		fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		fastConverter.setSupportedMediaTypes(fastMediaTypes);
		fastConverter.setFastJsonConfig(fastJsonConfig);
		HttpMessageConverter<?> converter = fastConverter;
		return new HttpMessageConverters(converter);
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
