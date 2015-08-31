package persistence;

import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by han on 15. 8. 31.
 * email : thetis15@hanmail.net
 */
public class HibernateUtil {
    public static SessionBuilder getSessionFactory() {

        // 세션 기본으로 만들기
        // 기본으로 만들경우 root hibernate.properties 파일 및 hibernate.* 파일을 자동으로 추가한다.
        SessionFactory sessionFactory = new Configuration().buildSessionFactory();

        // 세션 상세 설정으로 만들기.
//        String hibernateConfigFilePath = "hibernateConfigFilePath";
//        SessionFactory sessionFactory = new Configuration()
//                .configure(hibernateConfigFilePath)
//                .setProperty(Environment.DEFAULT_SCHEMA, "CAVEATEMPTOR")
//                .addResource("auction/CreditCard.hbm.xml")
//                .buildSessionFactory();

        return sessionFactory.withOptions();
    }
}
