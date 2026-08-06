package kr.co.oneday.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.oneday.service.MapService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/classes")
@RequiredArgsConstructor
public class MapController{

    private final MapService mapService;

    @GetMapping("/map")
    public String showMapPage(Model model) {
        // 실제 구현 시에는 검색 필터나 좌표 범위(Bounds) 조건에 맞게 조회하도록 구성합니다.
       // List<ClassDTO> classList = mapService.getClass();
        
        //model.addAttribute("classList", classList);
        return "map/map"; // class-map.html 템플릿 호출
    }
}