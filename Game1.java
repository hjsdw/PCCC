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
       System.out.println("欢迎来到20秒难遇的仙侠类大作《游戏一》");
       Thread.sleep(2000);
       System.out.println("1:密码登录      2：游客登录");
       int admission=in.nextInt();
       if(admission==2)         System.out.println("不登录还想玩游戏？你卸载吧");
       else if (admission!=1) 	System.out.println("眼睛呢，说了选1或2");
       else {
    	   System.out.println("请输入账号：");
    	   String zhanghao=in.next();
   		 if(zhanghao.equals("18654165912")) {
   		   System.out.println("请输入密码:");
   		   String password=in.next();
   		   if(password.equals("19960620")) {
   			   System.out.println("登录成功");
   			   System.out.println("假设你是一名叫【小花】的正派大侠。这日在与邪教左护法打斗之时，不慎落入崖底。");
      	       Thread.sleep(2000);
      	       System.out.println("你发现了一个山洞。");
      	       System.out.println("1:进入    2：绕过     【提示：按2有惊喜哦】");
      		   int cave=in.nextInt();
      	       while(cave!=1) {
      		      System.out.println("你走着走着,又发现了一个山洞。");
      		      System.out.println("1:进入    2：绕过     【提示：按2有惊喜哦】");
      		      cave=in.nextInt();
      	       }
      	       if(cave==1) {
      		       System.out.println("你进入了山洞，发现山洞里有一把短剑，是否拾取");
      		       System.out.println("1:拾取    2:直接出洞");
      			   int knife=in.nextInt();
      		       if(knife==1) {
      			      attack+=4;
      			      money+=100;
      			      System.out.println("你捡起了短剑，并离开了");
      			      
      		  }else {
      			  System.out.println("不要拉倒，你走吧");
      			  money+=10;
      		  }
      		   System.out.println("是否要打怪升级      1:我要变强     2：就这样吧");
      		   int level=in.nextInt();
      		   while(level==1) {
      			   int enemy=(int)(Math.random()*24);
      			 int enemyhp=enemy*10;
      			   System.out.println("你碰上了小怪");
      			   Thread.sleep(2000);
      			   System.out.println("它的攻击为"+enemy+"  血量为："+enemyhp);
      			   System.out.println("是否攻击    1:打他     2：打不过，我跑");
      			   int hit=in.nextInt();
      			   if(hit==2)  System.out.println("你惊慌失措的跑了");
      			   if(hit==1) {
      				   while(enemyhp>0) {
      					   System.out.println("你攻击了它一下，对手hp-"+attack*10);
      					   enemyhp-=attack*10;
      				   }
      				   if(enemyhp<0) {
      					   System.out.println("恭喜你打死了小怪！获得金币："+enemy*50+"  获得经验："+enemy);
      					   money+=enemy*50;
      					   exp+=enemy;
      				   }
      				   if(exp>50) {
      					   System.out.println("恭喜升级");
      					   Thread.sleep(2000);
      					   System.out.println("你的能力获得提升！");
      					   attack+=2;
      					   hp+=200;
      					   exp-=50;
      				   }
      			   }
      			 System.out.println("是否要继续打怪升级      1:我要变强     2：就这样吧");
      			   level=in.nextInt();
      		   }
      		   
      		   System.out.println("前面有个湖，是否下去寻宝     1：万一有宝贝呢     2：算了，我不会游泳");
      		   int swim=in.nextInt();
      		   if(swim==1) {
      			   System.out.println("你忙活了半天，毛都没有");
      			   hp-=30;
      		   }else {
      			   System.out.println("你绕过了这个看起来一点也不可怕的湖");
      		   }
      		   //
      	  }
   	   }
	}
       
}  
       in.close();
	}

}
