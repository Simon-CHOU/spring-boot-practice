package com.simon.springbootmysqldemo;

import com.simon.springbootmysqldemo.entity.DocumentEntity;
import com.simon.springbootmysqldemo.mapper.DocumentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SampleTest {
    @Autowired
    private DocumentMapper documentMapper;

    @Test
    public void testSelect() {
        System.out.println("-------");
        List<DocumentEntity> documentEntities = documentMapper.selectList(null);
        assertEquals(0, documentEntities.size());
        documentEntities.forEach(System.out::println);
    }
}
