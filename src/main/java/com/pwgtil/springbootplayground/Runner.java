package com.pwgtil.springbootplayground;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Runner implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Runner.class);
//    private final TreadmillRepository repository;
//
//    @Autowired
//    Runner(TreadmillRepository repository) {
//        this.repository = repository;
//    }

    @Override
    public void run(String... args) {

//        //-CREATE-------------------------------------------------------------------------------------------------------
//        //-CREATE-------------------------------------------------------------------------------------------------------
//        //-CREATE-------------------------------------------------------------------------------------------------------
//        LOGGER.info("Before save:");
//        doWeHaveSomethingInDb();
//
//        LOGGER.info("Saving...");
//        repository.save(new Treadmill("aaa", "Yamaguchi runway"));
//        repository.save(new Treadmill("bbb", "Yamaguchi runway pro-x"));
//        repository.save(new Treadmill("ccc", "model: Yamaguchi max"));
//
//        LOGGER.info("After save:");
//        doWeHaveSomethingInDb();
//
//        //-READ---------------------------------------------------------------------------------------------------------
//        //-READ---------------------------------------------------------------------------------------------------------
//        //-READ---------------------------------------------------------------------------------------------------------
//        LOGGER.info("Looking for the treadmill with code='bbb'... ");
//        Optional<Treadmill> treadmill = repository.findById("bbb");
//        String result = treadmill.map(this::createTreadmillView).orElse("Not found");
//        LOGGER.info(result);
//
//        LOGGER.info("Looking for the treadmill with code='non-existing-code'... ");
//        treadmill = repository.findById("bbb");
//        result = treadmill.map(this::createTreadmillView).orElse("Not found");
//        LOGGER.info(result);
//
//        Iterable<Treadmill> treadmills = repository.findAll();
//        for (Treadmill tm : treadmills) {
//            System.out.println(createTreadmillView(tm));
//        }
//
//        //-UPDATE-------------------------------------------------------------------------------------------------------
//        //-UPDATE-------------------------------------------------------------------------------------------------------
//        //-UPDATE-------------------------------------------------------------------------------------------------------
//        Optional<Treadmill> existingTreadmill = repository.findById("aaa");
//
//        String existing = existingTreadmill
//                .map(this::createTreadmillView)
//                .orElse("Not found");
//
//        LOGGER.info("Before update: " + existing);
//        LOGGER.info("Updating...");
//
//        existingTreadmill.ifPresent(tm -> {
//            tm.setModel("Yamaguchi runway-x");
//            repository.save(tm);
//        });
//
//        Optional<Treadmill> updatedTreadmill = repository.findById("aaa");
//        String updated = updatedTreadmill
//                .map(this::createTreadmillView)
//                .orElse("Not found");
//
//        LOGGER.info("After update: " + updated);
//
//        //-DELETE-------------------------------------------------------------------------------------------------------
//        //-DELETE-------------------------------------------------------------------------------------------------------
//        //-DELETE-------------------------------------------------------------------------------------------------------
//
//
//        //-Single entry-------------------------------------------------------------------------------------------------
//        LOGGER.info("Before delete: ");
//        printAllTreadmills();
//
//        LOGGER.info("Deleting...");
//        repository.deleteById("ccc");
//
//        LOGGER.info("After delete: ");
//        printAllTreadmills();
//
//        //-Other way----------------------------------------------------------------------------------------------------
//        LOGGER.info("Before delete: ");
//        printAllTreadmills();
//
//        LOGGER.info("Deleting...");
//        Optional<Treadmill> proXTreadmill = repository.findById("bbb");
//        proXTreadmill.ifPresent(
//                tm -> {
//                    repository.delete(tm);
//                }
//        );
//
//        LOGGER.info("After delete: ");
//        printAllTreadmills();
    }

//    private void printAllTreadmills() {
//        Iterable<Treadmill> treadmills = repository.findAll();
//        for (Treadmill treadmill : treadmills) {
//            LOGGER.info(treadmill.toString());
//        }
//    }
//
//    private void doWeHaveSomethingInDb() {
//        long count = repository.count();
//        if (count > 0) {
//            System.out.printf("Db has %d treadmill(s)%n", count);
//        } else {
//            System.out.println("Db is empty");
//        }
//    }
//
//    private String createTreadmillView(Treadmill treadmill) {
//        return "Treadmill(code: %s, model: %s)"
//                .formatted(treadmill.getCode(), treadmill.getModel());
//    }
}