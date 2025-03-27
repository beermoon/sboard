package kr.co.sboard.repository;

import kr.co.sboard.entity.Article;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArticleRepositoryTest {

        @Autowired
        private ArticleRepository articleRepository;


        @DisplayName("관계설정 테스트")
        @Test
        public void test1() {

        // given
        int no = 8;



        // when
        Article article = articleRepository.findById(no).get();



        // then
        System.out.println(article);

    }



}