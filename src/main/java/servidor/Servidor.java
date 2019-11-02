package servidor;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class Servidor {

    public int port = 8081;
    public Socket socket = null;
    public ServerSocket serverSocket = null;
    public BufferedInputStream bis = null;
    public DataInputStream dis = null;

    public Servidor() {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started on port " + serverSocket.getLocalPort() + "...");
            System.out.println("Waiting for client...");

            /*socket = serverSocket.accept();
            System.out.println("Client " + socket.getRemoteSocketAddress() + " connected to server...");

            bis = new BufferedInputStream(socket.getInputStream());
            dis = new DataInputStream(bis);

            while (true) {
                try {
                    String messageFromClient = dis.readUTF();
                    if (messageFromClient.equals("exit")) {
                        break;
                    }
                    System.out.println("Client [" + socket.getRemoteSocketAddress() + "] : " + messageFromClient);
                } catch (IOException e) {
                    break;
                }
            }
            dis.close();
            socket.close();
            System.out.println("Client " + socket.getRemoteSocketAddress() + " disconnect from server...");*/
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
    }

    public void criarCanal() {
        if (socket == null) {
            try {
                socket = serverSocket.accept();
                bis = new BufferedInputStream(socket.getInputStream());
                dis = new DataInputStream(bis);
            } catch (IOException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void receber(DefaultListModel model) {
        try {
            String mensagemDoCliente = dis.readUTF();
            model.addElement("Msg recebida: " + mensagemDoCliente);
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
    }

}
