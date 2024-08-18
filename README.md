# 커뮤니티 사이트

## 목차
- 1. 아이템 선정
- 2. 개요
- 3. 요구사항 분석
- 4. DB 설계
- 5. API 설계
- 6. 화면 설계서
- 7. 개발 및 테스트
- 8. 배포
- 9. 도메인 설정
- 10. ReadMe 및 포트폴리오 ( 자소서 ) 작성
- 11. 회고


## 프로젝트구성
<img width="700" alt="image" src="https://github.com/user-attachments/assets/6c2813fb-4168-434f-a20e-1711384bef20">

- IntelliJ IDEA 2024.1.4 (Ultimate Edition)
- Subscription is active until March 9, 2025.
- VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
    * macOS 14.5
    * Memory: 2048M
    * Cores: 8

## 템플릿엔진&View 
- 뷰 템플릿(=템플릿 엔진) : 화면을 담당하는 기술로, 하나의 틀로 만들고 여기저기에 변수를 삽입할 수 있게 한다.
    * 종류 : JSP, 타임리프, 머스테치(Mustache)
- MVC 패턴 : Model에 데이터를 담아, View에 보여준다. 이를 Contorller에서 작업
- 디자인 적용 : 1. 레이아웃, 화면에 요소를 배치하는 일을 말한다, 헤더-푸터 레이아웃이 근본

## 부트스트랩
<img width="700" alt="image" src="https://github.com/user-attachments/assets/c3b2c8db-8911-4154-8f5b-23474eb24645">

## Debugging
- 2024-08-18T15:42:39.227+09:00  WARN 1236 --- [community] [nio-8080-exec-1] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.web.HttpRequestMethodNotSupportedException: Request method 'POST' is not supported]
<img width="700" alt="image" src="https://github.com/user-attachments/assets/e16cbdd7-01c6-4eaa-a0f0-63737eec3d55">

- return " ";과 return "";에서 반환되는 문자열이 Spring MVC에서 해석되는 방법에 차이로 인한 에러
    * return "";의 경우 : 뷰 이름이 지정되지 않았다고 간주
    * return " ";의 경우 : 공백 문자열 " "을 반환하면, Spring은 이를 뷰 이름으로 해석하려고 시도
    * HttpRequestMethodNotSupportedException : 추후 뷰 리졸버가 뷰를 찾지 못할 때도 지원되지 않는 메소드라고 예외처리 될 수 있다.




