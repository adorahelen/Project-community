package com.portfolio.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 컨트롤러 명시
public class demo {
    @GetMapping("/start") // 해당하는 유엘알 요청 링크 접속시 아래에 함수 실행
    public String hi(Model model) { // 모델 객체 가져오기
        model.addAttribute("username", "administrator");
                // 앞에가 프론트에서 지정한 "이름" : 뒤에는 변수 값 "보통은 JSON 객체"
        return "greetings"; // 템플릿 디렉토리 안에 있는, 뷰 파일 반환
    }
}
// Model View Controller : MVC 는 데이터를 담는 모델, 반환해서 보여주는 뷰, 행동하는 컨트롤러
