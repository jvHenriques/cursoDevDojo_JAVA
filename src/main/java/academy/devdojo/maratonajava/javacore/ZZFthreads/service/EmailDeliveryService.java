package academy.devdojo.maratonajava.javacore.ZZFthreads.service;

import academy.devdojo.maratonajava.javacore.ZZFthreads.domain.Members;

public class EmailDeliveryService implements Runnable{
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver emails");
        while (members.isOpen() || members.pendingEmails() > 0){
            try {
                String email = members.retrieveEmails();
                if (email == null) continue;
                System.out.println(threadName + " enviando email para " +email);
                Thread.sleep(2000);
                System.out.println(threadName + " enviou com sucesso email para " +email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("todos os email foram enviados com sucessos");
    }
}
