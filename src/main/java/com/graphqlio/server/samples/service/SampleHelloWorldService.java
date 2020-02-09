package com.graphqlio.server.samples.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import com.graphqlio.server.samples.resolvers.SampleHelloWorldResolver;
import com.graphqlio.server.server.GsServer;

@Service
public class SampleHelloWorldService implements ApplicationRunner {
	
	
	@Autowired
	SampleHelloWorldResolver helloWorldResolver;
	
	@Autowired
	private GsServer gsServer;
	
	SampleHelloWorldService(){
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {	
		
		gsServer.registerGraphQLResolver(helloWorldResolver);
		gsServer.start();		
	}
}
