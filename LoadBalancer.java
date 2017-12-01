import java.io.*;
import java.net.*;
public class LoadBalancer{
  public static void main(String []args)throws IOException{
  ServerSocket s1=new ServerSocket(1234);
  while(true){
    Socket connectionsocket=s1.accept();
    BufferedReader messagefromclient=new BufferedReader(new InputStreamReader(connectionsocket.getInputStream()));
    String clientsentence=messagefromclient.readLine();
    if(clientsentence.contains("Fat")){
    Socket server=new Socket("192.168.15.128,2345);
    DataOutputStream outtoserver=new DataOutputStream(server.getOutputStream());
    outtoserver2.writeBytes(clientsentence+"\n);
    server.close();
    }
   
    else if(clientsentence.contains("Thin")){
    Socket server=new Socket("192.168.15.129,2346);
    DataOutputStream outtoserver=new DataOutputStream(server.getOutputStream());
    outtoserver2.writeBytes(clientsentence+"\n);
    server.close();
    }
  
    else{System.out.println("ERROR"); }
    }
   }
}
