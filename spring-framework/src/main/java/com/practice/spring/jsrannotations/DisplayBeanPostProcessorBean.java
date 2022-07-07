package com.practice.spring.jsrannotations;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayBeanPostProcessorBean implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("After bean initialization of bean: " + beanName);
//		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
//	}
//
//	@Override
//	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("Before bean initialization of bean: " + beanName);
//		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
//	}
}
