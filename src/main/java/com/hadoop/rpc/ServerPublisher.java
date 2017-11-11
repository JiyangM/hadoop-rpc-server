package com.hadoop.rpc;

import java.io.IOException;
import org.apache.hadoop.HadoopIllegalArgumentException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RPC.Builder;
import org.apache.hadoop.ipc.Server;


public class ServerPublisher {

	public static void main(String[] args) throws HadoopIllegalArgumentException, IOException {
		Builder builder = new RPC.Builder(new Configuration());
		builder.setBindAddress("localhost").setPort(8789).setProtocol(ClientNameNodeProtocal.class).setInstance(new NameNode());
		Server server = builder.build();
		
		server.start();
	}
}
