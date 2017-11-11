package com.hadoop.rpc;

public class NameNode implements ClientNameNodeProtocal {

	@Override
	public String getMetaData() {
		return " 2{bl1,bl2} {bl1:mini1,mini2} {bl2:mini1,mini2} ";
	}
	
}
