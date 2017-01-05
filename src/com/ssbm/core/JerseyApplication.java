package com.ssbm.core;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
 * @author Santhosh
 * 
 * Registers all Controller classes
 *
 */
public class JerseyApplication extends Application{
	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> s = new HashSet<Class<?>>();
		
		//Dependency classes
		s.add(org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider.class);
		s.add(org.codehaus.jackson.jaxrs.JacksonJsonProvider.class);
		s.add(org.codehaus.jackson.jaxrs.JsonParseExceptionMapper.class);
		s.add(org.codehaus.jackson.jaxrs.JsonMappingExceptionMapper.class);
		
		//Application Controller classes
		s.add(com.ssbm.api.ProductApi.class);
		
		return s;
	}

}
