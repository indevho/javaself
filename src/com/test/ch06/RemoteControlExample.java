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
	  
	  //���ʸ� �⺻�� ��̸���Ʈ�� ��� Ÿ�� ���͵� ����̾���. 
	  // �� ��ü ���� �ϰ� ������ ���� , ������ Ÿ���� �ϰ� ���ض�. 
	  //  �ƹ�Ÿ���̳� ������ �ٵ�����, ȥ���� �´�.
	  
	  //Object �� ������.. �׷��� >>> ���������� instanceOf �� �Ź����鼭 ����������
	  //����� �ʹ�ũ�� .
	  // �׷��� ����޼��峪 vo ���� ���ʸ��� ���� ����. 
	  
	  
	  
	  
	  
	  /*
	   * 
	   * 
	   *���μ��� vs ������ ���� 
	   *
	   *���μ��� �Ʒ��� ���� �����尡 �������ִ�. 
	   *���� ���� PID �� �ִ�. 
	   *���μ����� CPU�� �޸� �Ҵ�޾�. 
	   *�������  . >>  �Ҵ���� �޸� ������  ���ϴ� �ֵ��̾� 
	   *
	   *MIN MAX �� �� , �ױ��ؾȿ��� ���������   �������鼭 �����ϴ°ž� 
	   *
	   *������� �� �����ֳ�.. 
	   *
	   *������� ����ü, �������̽��Դϴ�. 
	   *
	   *
	   *  ���ʺ�  @functionalInterface �̴� 
	   *  
	   *  �½�ũ������ �κ�  +  ����ü�ִ� �ϳ� 
	   *  
	   *  �����ӿ����־�� 
	   *  ������ ���ʺ�� �Ⱦ��� . 
	   *  �ڹ� ������ �����ӿ�ũ���־��. 
	   *  �ͽ�ť�ͼ��� ��°��־��..  
	   *  
	   *  ������Ǯ 
	   *  
	   *  
	   *  
	   *�½�ũ�� �׷��� ���ÿ� ��ųη� ���������ִ�. 
	   * 
	   * 
	   */
	  
	  
	  
}
}
