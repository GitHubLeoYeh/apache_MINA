package mina.messagetransfer;

/**
 * Created by user on 2015/5/27.
 */
import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import java.io.IOException;
import java.net.InetSocketAddress;

public class MessageSendServer {
    private static final int port = 11111;
    public static void main(String[]args) throws IOException{
        //�A?��?�v�ݤf��
        IoAcceptor acceptor = new NioSocketAcceptor();
        //���filter
        acceptor.getFilterChain().addLast("logger", new LoggingFilter());
        //?�H�ǦC�Ƥu�D�A��??java?�H�ǦC�Ʀ��G?��y
        acceptor.getFilterChain().addLast(
                "Objectcodec",
                new ProtocolCodecFilter(
                        (ProtocolCodecFactory) new ObjectSerializationCodecFactory()));
        //???�zhandler
//        acceptor.setHandler(new ServerHandler());
        //?�m?�v�ݤf
        acceptor.setDefaultLocalAddress(new InetSocketAddress(port));
        //??�F?�vaccptor
        acceptor.bind();

        System.out.println("Server starts to listen to PORT :"+port);

    }

}
