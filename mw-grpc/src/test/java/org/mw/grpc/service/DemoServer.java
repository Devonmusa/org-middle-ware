package org.mw.grpc.service;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
*
*@author Devonmusa
*@date   2017年7月29日
*/
public class DemoServer {

	private int port = 9980;
	private Server server;

	public  void start() throws IOException, InterruptedException {
	  server = ServerBuilder.forPort(port).addService(new ServiceImpl()).build();
	  server.start();
	  while (true){
		  System.out.println("server runing...");
		  Thread.sleep(2000);
	  }

//	  Runtime.getRuntime().addShutdownHook(new Thread(){
//	    @Override
//	    public void run() {
//	    	DemoServer.this.stop();
//	    }
//	  });
	}

	public  void stop() {
	  if (server != null) {
	    server.shutdown();
	  }
	}
}
