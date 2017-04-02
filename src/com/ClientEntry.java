package com;

import java.net.URL;

import javax.xml.namespace.QName;

import org.apache.axis.client.Service;

public class ClientEntry extends Service {

	String endPoint = "http://localhost:8080/hhhh";
	static String remoteMethod = "tttt";
	static QName qName = new QName("http://com/",remoteMethod);

	private static final long serialVersionUID = 1L;

	public static void main(String... strings) throws Exception {

		CommonStub helloPort = new ClientEntry().getStub();

		String ff = helloPort.callMethod("I am param", qName);
		System.out.print(ff);

	}

	public CommonStub getStub() throws Exception {

		CommonStub _stub = new CommonStub(new URL(endPoint), this);

		_stub.setPortName("DemoTestPortname");
		_stub.init(remoteMethod);
		return _stub;

	}

}
