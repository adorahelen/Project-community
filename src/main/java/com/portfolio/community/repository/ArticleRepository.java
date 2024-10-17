//package com.portfolio.community.repository;
//
//import com.portfolio.community.entitiy.Article;
//import org.springframework.data.repository.CrudRepository;
//
//import java.util.ArrayList;
//
//public interface ArticleRepository extends CrudRepository<Article, Long> {
//    // CRUD 레포지토리는 JPA에서 제공하는 인터페이스로 이를 상속해 작업을 진행할 수 있다.
//    // 다음과 같은 두개의 제네릭 요소를 인자로 받는다.
//    // 1. 아티클 : 관리 대상 엔티티의 클래스 타입 (entity/Article)
//    // 2. 롱 : 관리 대상 엔티티의 대표값 타입 ( Article.java 파일, id => Long 타입)
//
//
//    @Override
//    ArrayList<Article> findAll();
//    // 기존에 정의도이 있는 findAll 메소드의 경우 가장 상위 타입인 iterate, 오버라이딩 적용
//}
