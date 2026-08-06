package kr.co.oneday.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.oneday.classDetail.dto.ClassDetailResponseDTO;
import kr.co.oneday.service.ClassDetailService;

@Controller
public class ClassDetailController {

    @Autowired
    private ClassDetailService cdService;

    @GetMapping("/classDetail")
    public String useClass2(@RequestParam("classCode") int classCode, Model model) {
        // 서비스에서 모든 조립 과정을 마친 하나의 객체를 가져옵니다.
        ClassDetailResponseDTO detail = cdService.getClassDetail(classCode);
        
        if (detail == null) {
            return "error/404"; // 데이터가 없을 때의 예외 처리
        }

        // 모델에 단 하나의 attribute만 추가하므로 코드가 간결해집니다.
        model.addAttribute("detail", detail);

        return "class/detail2";
    }
}
