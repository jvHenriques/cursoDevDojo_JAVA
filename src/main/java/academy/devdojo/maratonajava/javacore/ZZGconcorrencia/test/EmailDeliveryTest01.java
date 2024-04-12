package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;



import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.domain.Members;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jiraya = new Thread(new EmailDeliveryService(members), "JIRAYA");
        Thread kakashi = new Thread(new EmailDeliveryService(members), "KAKASHI");
        jiraya.start();
        kakashi.start();

        while (true){
            String email = JOptionPane.showInputDialog("entre com o seu email");
            if (email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMembers(email);
        }
    }
}
