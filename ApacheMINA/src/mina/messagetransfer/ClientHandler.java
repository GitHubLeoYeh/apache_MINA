package mina.messagetransfer;

/**
 * Created by user on 2015/5/27.
 */
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class ClientHandler extends IoHandlerAdapter{

    @Override
    public void messageReceived(IoSession session, Object message)
            throws Exception {
//        Message m = (Message)message;
//        System.out.println(m.getId()+" "+m.getContent()+" "+m.getDate());
    }

    @Override
    public void exceptionCaught(IoSession session, Throwable cause)throws Exception{
        session.close(true);
    }
}
