import java.util.Date;

class test extends Thread {

  public void run() {

    try {
System.out.println(new Date());
Thread.sleep(60000);
System.out.println(new Date());
    } catch (Exception e) {
System.out.println(e);
    }
  }
}

public class T {
  public static void main(String[] argv) {
    new T().start();
  }
}
