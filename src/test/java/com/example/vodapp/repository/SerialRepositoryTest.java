package com.example.vodapp.repository;

import com.example.vodapp.model.entity.Serial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class SerialRepositoryTest {

    @Autowired
    SerialRepository serialRepository;

    @Test
    void testSavingAndRetrievingSerial() {
        //given - przygotowac encję i zapisać
        Serial serial = new Serial();
        serial.setTitle("Klan");
        serial.setDescription("Najlepszy polski serial ever");
        serial.setSeasons(20);
        serial.setEpisodes(1500);
        serial.setReleaseYear(1995);

        serialRepository.save(serial);

        //when - wyciagnąć encję z bazy
        List<Serial> all = serialRepository.findAll();

        //then - sprawdzić czy encja została zapisana
        Assertions.assertEquals(1, all.size());
    }

}