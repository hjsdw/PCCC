package mmmm;

import java.util.Scanner;

public class Game1 {
    static int attack=1;
    static int hp=100;
    static int money=300;
    static int exp=1;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	   Scanner in=new Scanner(System.in);
       System.out.println("��ӭ����20���������������������Ϸһ��");
       Thread.sleep(2000);
       System.out.println("1:�����¼      2���ο͵�¼");
       int admission=in.nextInt();
       if(admission==2)         System.out.println("����¼��������Ϸ����ж�ذ�");
       else if (admission!=1) 	System.out.println("�۾��أ�˵��ѡ1��2");
       else {
    	   System.out.println("�������˺ţ�");
    	   String zhanghao=in.next();
   		 if(zhanghao.equals("18654165912")) {
   		   System.out.println("����������:");
   		   String password=in.next();
   		   if(password.equals("19960620")) {
   			   System.out.println("��¼�ɹ�");
   			   System.out.println("��������һ���С�С���������ɴ�������������а���󻤷���֮ʱ�����������µס�");
      	       Thread.sleep(2000);
      	       System.out.println("�㷢����һ��ɽ����");
      	       System.out.println("1:����    2���ƹ�     ����ʾ����2�о�ϲŶ��");
      		   int cave=in.nextInt();
      	       while(cave!=1) {
      		      System.out.println("����������,�ַ�����һ��ɽ����");
      		      System.out.println("1:����    2���ƹ�     ����ʾ����2�о�ϲŶ��");
      		      cave=in.nextInt();
      	       }
      	       if(cave==1) {
      		       System.out.println("�������ɽ��������ɽ������һ�Ѷ̽����Ƿ�ʰȡ");
      		       System.out.println("1:ʰȡ    2:ֱ�ӳ���");
      			   int knife=in.nextInt();
      		       if(knife==1) {
      			      attack+=4;
      			      money+=100;
      			      System.out.println("������˶̽������뿪��");
      			      
      		  }else {
      			  System.out.println("��Ҫ���������߰�");
      			  money+=10;
      		  }
      		   System.out.println("�Ƿ�Ҫ�������      1:��Ҫ��ǿ     2����������");
      		   int level=in.nextInt();
      		   while(level==1) {
      			   int enemy=(int)(Math.random()*24);
      			 int enemyhp=enemy*10;
      			   System.out.println("��������С��");
      			   Thread.sleep(2000);
      			   System.out.println("���Ĺ���Ϊ"+enemy+"  Ѫ��Ϊ��"+enemyhp);
      			   System.out.println("�Ƿ񹥻�    1:����     2���򲻹�������");
      			   int hit=in.nextInt();
      			   if(hit==2)  System.out.println("�㾪��ʧ�������");
      			   if(hit==1) {
      				   while(enemyhp>0) {
      					   System.out.println("�㹥������һ�£�����hp-"+attack*10);
      					   enemyhp-=attack*10;
      				   }
      				   if(enemyhp<0) {
      					   System.out.println("��ϲ�������С�֣���ý�ң�"+enemy*50+"  ��þ��飺"+enemy);
      					   money+=enemy*50;
      					   exp+=enemy;
      				   }
      				   if(exp>50) {
      					   System.out.println("��ϲ����");
      					   Thread.sleep(2000);
      					   System.out.println("����������������");
      					   attack+=2;
      					   hp+=200;
      					   exp-=50;
      				   }
      			   }
      			 System.out.println("�Ƿ�Ҫ�����������      1:��Ҫ��ǿ     2����������");
      			   level=in.nextInt();
      		   }
      		   
      		   System.out.println("ǰ���и������Ƿ���ȥѰ��     1����һ�б�����     2�����ˣ��Ҳ�����Ӿ");
      		   int swim=in.nextInt();
      		   if(swim==1) {
      			   System.out.println("��æ���˰��죬ë��û��");
      			   hp-=30;
      		   }else {
      			   System.out.println("���ƹ������������һ��Ҳ�����µĺ�");
      		   }
      		   //
      	  }
   	   }
	}
       
}  
       in.close();
	}

}
