package kr.co.oneday.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.oneday.classDetail.dao.ClassDetailDAO;
import kr.co.oneday.classDetail.dto.ClassDTO;
import kr.co.oneday.classDetail.dto.ClassDetailResponseDTO;
import kr.co.oneday.classDetail.dto.CurriculumDTO;
import kr.co.oneday.classDetail.dto.OperatorDTO;
import kr.co.oneday.classDetail.dto.ReviewDTO;
import kr.co.oneday.classDetail.dto.ReviewSummaryDTO;
import kr.co.oneday.classDetail.dto.ScheduleDTO;

@Service
public class ClassDetailService {

    @Autowired
    private ClassDetailDAO classDetailDAO;

    public ClassDetailResponseDTO getClassDetail(int classCode) {
        // 1. 클래스 기본 상세 조회
        ClassDTO classDto = classDetailDAO.selectClass(classCode);
        if (classDto == null) {
            return null;
        }

        // 2. 클래스 정보에서 얻은 creatorCode(또는 operatorCode)와 categoryCode 추출
        // DTO 내부 변수명에 맞게 호출해주세요 (예: getCreatorCode, getCategoryCode)
        int creatorCode = classDto.getOperatorCode(); 
        int categoryCode = classDto.getCategoryCode();

        // 3. 추가 정보들을 DAO를 통해 조회
        OperatorDTO creatorDto = classDetailDAO.selectCreator(creatorCode);
        List<ClassDTO> sameCategoryList = classDetailDAO.selectSameCategoryList(classCode, categoryCode);
        CurriculumDTO curriculumDto = classDetailDAO.selectCurriculum(classCode);
        List<ReviewDTO> reviewList = classDetailDAO.selectReviewList(classCode);
        ReviewSummaryDTO reviewSummaryDto = classDetailDAO.selectReviewSummary(classCode);
        ScheduleDTO representativeSchedule = classDetailDAO.selectSchedule(classCode);
        List<ScheduleDTO> scheduleList = classDetailDAO.selectScheduleList(classCode);

        // 4. 하나의 DTO로 결합하여 반환
        return new ClassDetailResponseDTO(
            classDto, creatorDto, sameCategoryList, curriculumDto, 
            reviewList, reviewSummaryDto, representativeSchedule, scheduleList
        );
    }
}