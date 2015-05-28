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
        //服?端?听端口用
        IoAcceptor acceptor = new NioSocketAcceptor();
        //日志filter
        acceptor.getFilterChain().addLast("logger", new LoggingFilter());
        //?象序列化工厂，用??java?象序列化成二?制流
        acceptor.getFilterChain().addLast(
                "Objectcodec",
                new ProtocolCodecFilter(
                        (ProtocolCodecFactory) new ObjectSerializationCodecFactory()));
        //???理handler
//        acceptor.setHandler(new ServerHandler());
        //?置?听端口
        acceptor.setDefaultLocalAddress(new InetSocketAddress(port));
        //??了?听accptor
        acceptor.bind();

        System.out.println("Server starts to listen to PORT :"+port);

    }

}
