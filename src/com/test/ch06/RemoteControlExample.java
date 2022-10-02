package com.test.ch06;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RemoteControlExample {
  public static void main(String[] args) {
	
	  System.out.println(RemoteControl.MAX_VOLUME);
	  
	  

	  RemoteControl television = new Television();
	  RemoteControl audio = new Audio();
	  
	  television.turnOn();
	  audio.turnOn();
	  
	  
	  Searchable searchTv =  new Television();
	  searchTv.search("saddsd");
	  //Television 
	  
	  
	  ArrayList list = new ArrayList<>();
	  
	  List list2 = new  ArrayList();
	  
	  //제너릭 기본은 어래이리스트는 어느 타입 들어와도 상관이없다. 
	  // 이 객체 쓴느 니가 스스로 규정 , 데이터 타입을 니가 정해라. 
	  //  아무타입이나 섞여서 다들어오면, 혼란이 온다.
	  
	  //Object 도 가능함.. 그러면 >>> 내부적으로 instanceOf 가 매번돌면서 난리가난다
	  //비용이 너무크다 .
	  // 그래서 공통메서드나 vo 쓸떄 제너릭을 많이 쓴다. 
	  
	  
	  
	  
	  
	  /*
	   * 
	   * 
	   *프로세스 vs 스레드 구분 
	   *
	   *프로세스 아래에 여러 스레드가 있을수있다. 
	   *서빅스 들어가면 PID 가 있다. 
	   *프로세스는 CPU를 메모리 할당받아. 
	   *쓰레드는  . >>  할당받은 메모리 위에서  일하는 애들이야 
	   *
	   *MIN MAX 를 줘 , 그기준안에서 쓰레드들이   굴러당기면서 일을하는거야 
	   *
	   *쓰레드는 또 뭐가있냐.. 
	   *
	   *쓰레드는 구현체, 인터페이스입니다. 
	   *
	   *
	   *  러너블도  @functionalInterface 이다 
	   *  
	   *  태스크돌리는 부분  +  구현체있는 하나 
	   *  
	   *  프레임웍이있어요 
	   *  요즘은 러너블로 안쓰고 . 
	   *  자바 스레드 프레임워크가있어요. 
	   *  익시큐터서비스 라는게있어요..  
	   *  
	   *  쓰레드풀 
	   *  
	   *  
	   *  
	   *태스크를 그래서 동시에 펑셔널로 돌릴수가있다. 
	   * 
	   * 
	   */
	  
	  
	  
}
}
