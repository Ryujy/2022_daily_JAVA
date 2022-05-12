package chap12.ex01.Ipaddr;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP {

	public static void main(String[] args) throws IOException {
		
		//내 컴퓨터 IP 알아보기
		InetAddress addr = InetAddress.getLocalHost(); // localhost == 내 컴퓨터 == 127.0.0.1
		System.out.println("my pc ip : "+addr.getHostAddress());
		
		System.out.println();
		
		// 특정 도메인의 IP 주소 알아보기
		String domain = "www.gdu.co.kr";
		addr = InetAddress.getByName(domain);
		System.out.println("구디아카데미 서버 : "+ addr.getHostAddress());
		
		// 하나의 도메인에 여러 서버가 몰려있는 경우
		domain = "www.youtube.com";
		InetAddress[] ipList = InetAddress.getAllByName(domain);
		
		System.out.println(domain + "에 연결된 서버들...");
		for (InetAddress ip : ipList) {
			System.out.println(ip.getHostAddress());
		}

	}

}
