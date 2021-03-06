package org.mw.zookeeper.demo;



import org.junit.Test;
import org.mw.zookeeper.client.ZkClient;

/**
*@see Describetion:
*@author  Devonmusa
*@version
*@date 2017年2月18日 下午4:24:38
*
*/
public class ZkClientTest {
	private ZkClient zkClient;
	private String path = "/mynode/001";
	@Test
	public void testZkConnect() throws Exception {
		zkClient = new ZkClient("localhost:2184");
		zkClient.init();
		zkClient.setWatcherForChildsNode("/");
		zkClient.createNode("/mynode");
		zkClient.setWatcherForChildsNode("/mynode");
		zkClient.createNode(path);
		zkClient.setWatcherForParentNode(path);

		zkClient.deleteNode(path);
		zkClient.deleteNode("/mynode");		
		
		Thread.sleep(1000 * 10);
		
	}

}
