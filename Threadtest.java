class A extends Thread
{public void run()
{for (int i=1;i<=5;i++){
System.out.println("from thread a:"+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{public void run()
{for (int j=1;j<=5;j++){
System.out.println("from thread b:"+j);
}
System.out.println("exit from B");
try{
    sleep(1000);
}catch(Exception e){}

}
}
class Threadtest{
public static void main(String args[]){
new A().start();
//new A().run();
new B().start();
//new B().run();

}

}