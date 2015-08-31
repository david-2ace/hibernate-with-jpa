package hello;

import org.hibernate.Session;
import org.hibernate.Transaction;
import persistence.HibernateUtil;

import java.util.List;

/**
 * Created by han on 15. 8. 31.
 * email : thetis15@hanmail.net
 */
public class HelloWorld {
    public static void main(String[] args) {
        // 첫번째 작업 단위
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Message message = new Message("hello World");
        Long msgId = (Long) session.save(message);

        tx.commit();
        session.close();

        // 두번째 작업 단위
        Session newSession = HibernateUtil.getSessionFactory().openSession();
        Transaction newTx = newSession.beginTransaction();

        String hql = "from Message m order by m.text asc";
        @SuppressWarnings("unchecked")
        List<Message> messages = (List<Message>) newSession.createQuery(hql).list();

        System.out.println(messages.size() + " message(s) found:");

        messages.forEach(msg -> System.out.print(msg.getText()));

        newTx.commit();
        session.close();

        // 세번째 작업 단위 - 연쇄저장(cascading save)
        Session thirdSession = HibernateUtil.getSessionFactory().openSession();
        Transaction thirdTx = thirdSession.beginTransaction();

        // msgId는 첫번째 메시지의 식별자 값을 담고 있다.
        message = thirdSession.get(Message.class, msgId);

        message.setText("Greetings Earthling");
        message.setNextMessage(new Message("Take me to your leader (please)"));

        thirdTx.commit();
        session.close();
    }
}
