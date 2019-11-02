package cliente;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class Cliente {

    public String serverName = "localhost";
    public int serverPort = 8081;
    public Socket socket = null;
    public DataOutputStream dos = null;
    public boolean rodandoServidor = false;

    public Cliente() {
        try {
            socket = new Socket(serverName, serverPort);
            System.out.println("Client started on port " + socket.getLocalPort() + "...");
            System.out.println("Connected to server " + socket.getRemoteSocketAddress());
            dos = new DataOutputStream(socket.getOutputStream());
            rodandoServidor = true;
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
            rodandoServidor = false;
        }
    }

    public void enviar(DefaultListModel model, String mensagem) {
        try {
            dos.writeUTF(mensagem);
            dos.flush();           
            model.addElement("Msg Enviada: "+mensagem);
        } catch (IOException e) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void encerrarConexao() {
        try {
            dos.close();
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isRodandoServidor() {
        return rodandoServidor;
    }

    public void setRodandoServidor(boolean rodandoServidor) {
        this.rodandoServidor = rodandoServidor;
    }
    
}
