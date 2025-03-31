package kr.co.ureca.bootmavenjpastart.s1di.controller;

import java.util.Map;
import kr.co.ureca.bootmavenjpastart.s1di.service.DITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DITestController {

//    private DITestService service = new DITestService(); // 개발자가 제어. -> Bye~
//    private DITestService service; // 스프링 프레임워크가 생성 및 제공. Dependency Injection.

    // 1. 생성자에 의한 의존성 주입(DI)
    // 생성자 실행 시, DITestService 필요 -> 스프링 프레임워크가 생성 및 제공.
//    public DITestController(DITestService service) {
//        this.service = service;
//    }

    // 2. Setter 메서드를 사용한 의존성 주입(DI)
//    @Autowired
//    public void setService(DITestService service) {
//        this.service = service;
//    }

    // 3. 필드 선언에 의한 의존성 주입(DI)
    @Autowired
    private DITestService service;

    @GetMapping("/ditest")
    @ResponseBody
    public Map<String, String> diTest() {
        Map<String, String> map = service.diTestPrint();
        return map;
    }
}
