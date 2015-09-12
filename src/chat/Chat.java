
package chat;
import java.net.*;
import org.jsoup.Jsoup;
import org.w3c.dom.Document;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sapna
 */
public class Chat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
        //URL url = new URL("http://www.javatpoint.com/jsoup-tutorial");//https://www.google.co.in/");//"http://my.horoscope.com/astrology/free-daily-horoscope-scorpio.html");
            org.jsoup.nodes.Document doc =Jsoup.parse("http://my.horoscope.com/astrology/free-daily-horoscope-scorpio.html");
        //Jsoup.parse(url, 3*1000);
//String title = doc.title();
//String n=doc.text();
          //  String s="You're ready for dramatic change in your life, Scorpio. It isn't that you're dissatisfied with your career or personal life. Rather, you feel like you're missing out on something great, if you only knew what. Be receptive to whatever opportunities arise and explore them all. You may find the answers you seek through travel or more education. Bring a friend if you're afraid to explore on your own.";
            System.out.println(doc);
            //System.out.println(""+ doc.data());
          // System.out.println(""+n);
        }
        catch(Exception e)
        {System.out.println(""+e);
        e.printStackTrace();
        }
    }
        // TODO code application logic here
      /*  String st="";
        try
        {
        Socket s=new Socket("com.geekcap.javaworld.simplesocketclient.SimpleSocketClientExample",80);
            System.out.println("Connected! "+s.toString());
        PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
        pw.println("GET "+"www.javaworld.com /"+" HTTP/1.1");
        pw.println();
         //String sop="GET / HTTPS/1.1\r\n\r\n";
         //pw.println("GET / HTTP/1.1\r\n\r\n");
         //pw.println(sop);
          //  System.out.println("GET / HTTPS/1.1\r\n\r\n");
        pw.flush();
            System.out.println("Msg sent!");
            
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
while((st=br.readLine())!=null)
{
    System.out.println(" "+st);
}
            s.close();
        pw.close();
        
        }
        catch(Exception e)
        {
            System.out.println(""+e.toString());
        }
        }*/
        
    }
    

