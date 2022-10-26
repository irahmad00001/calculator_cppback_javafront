/**
 * Created by Public on 10/26/2022.
 */

import java.net.*;
import java.io.*;

public class SocketProgramming {
    public String socketMethod(String str){
        try {
            Socket client = new Socket("localhoct", 444);

            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF(str);
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);

            String temp = in.readUTF();
            client.close();
            return temp;
        } catch (IOException e) {
            e.printStackTrace();
            return "0";
        }
    }
}
