package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
//        ConnectionFactory.getConnection();
//        Producer producer = Producer.ProducerBuilder.aProducer().name("NHK").build();

//        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("madhouse").build();
//        ProduterService.save(producer);
//        ProduterService.delete(15);
//        ProduterService.update(producerToUpdate);
//        List<Producer> producers = ProduterService.findAll();
//        List<Producer> producers = ProduterService.findByName("Mad");
//        log.info("Producers found '{}'", producers);

//        ProduterService.showProducerMetaData();
//        ProduterService.showDriveMetaData();
//        ProduterService.showTypeScrollWorking();
//        List<Producer> producers = ProduterService.findByNameAndUpdateToUpperCase("Dee");
//        log.info("Producers Found '{}'", producers);
//        List<Producer> producers = ProduterService.findByNameAndInsertWhenNotFound("A-1 Pictures");
//        log.info("'{}'", producers);
//        ProduterService.findByNameAndDelete("A-1 Pictures");
//        List<Producer> producers = ProduterService.findByNamePreparedStatement("Bo");
//        log.info("'{}'", producers);
//        ProduterService.updatePreparedStatement(producerToUpdate);

        List<Producer> producers = ProducerService.findByNameCallableStatement("sasa");
        log.info("'{}'", producers);

//        log.info("INFO");
//        log.debug("debug");
//        log.warn("warn");
//        log.error("error");
//        log.trace("trace");
    }
}
