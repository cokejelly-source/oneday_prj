package kr.co.oneday.classDetail.dto;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Getter
@Setter
public class ClassDetailResponseDTO {
    private ClassDTO classDetail;
    private OperatorDTO creator;
    private List<ClassDTO> sameCategoryList;
    private CurriculumDTO curriculum;
    private List<ReviewDTO> reviewList;
    private ReviewSummaryDTO reviewSummary;
    private ScheduleDTO representativeSchedule;
    private List<ScheduleDTO> scheduleList;

    // 생성자, Getter, Setter 작성 (또는 Lombok @Data 사용)
    public ClassDetailResponseDTO(ClassDTO classDetail, OperatorDTO creator, 
                                  List<ClassDTO> sameCategoryList, CurriculumDTO curriculum, 
                                  List<ReviewDTO> reviewList, ReviewSummaryDTO reviewSummary, 
                                  ScheduleDTO representativeSchedule, List<ScheduleDTO> scheduleList) {
        this.classDetail = classDetail;
        this.creator = creator;
        this.sameCategoryList = sameCategoryList;
        this.curriculum = curriculum;
        this.reviewList = reviewList;
        this.reviewSummary = reviewSummary;
        this.representativeSchedule = representativeSchedule;
        this.scheduleList = scheduleList;
    }
    
    // Getter 및 Setter 메서드 생략...
}