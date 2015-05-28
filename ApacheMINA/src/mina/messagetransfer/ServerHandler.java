//package mina.messagetransfer;
//
///**
// * Created by user on 2015/5/27.
// */
//import org.apache.mina.core.future.WriteFuture;
//import org.apache.mina.core.service.IoHandlerAdapter;
//import org.apache.mina.core.session.IoSession;
//import java.util.*;
//public class ServerHandler extends IoHandlerAdapter{
//
//    @Override
//    public void messageReceived(IoSession session,Object message)throws Exception{
//
////        Message receivedMsg = (Message)message;
////        if("quit".equalsIgnoreCase(receivedMsg.getContent())){
//            System.out.println("Session closed");
//            session.close(true);
//        }
////        receivedMsg.setContent("Server response :"+receivedMsg.getContent());
//
////        receivedMsg.setDate(Calendar.getInstance().getTime());
//
////        WriteFuture future = session.write(receivedMsg);
////        future.awaitUninterruptibly();
//
//        System.out.println("Successfully response to "+session.getRemoteAddress().toString());
//    }
//    @Override
//    public void exceptionCaught(IoSession session, Throwable cause)throws Exception{
//        session.close(true);
//    }
//}
