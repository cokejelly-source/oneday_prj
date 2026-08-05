package kr.co.oneday.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.oneday.dao.ClassDetailDAO;
import kr.co.oneday.dto.ClassDTO;
import kr.co.oneday.dto.CreatorDTO;
import kr.co.oneday.dto.CurriculumDTO;
import kr.co.oneday.dto.ReviewSummaryDTO;
import kr.co.oneday.dto.ScheduleDTO;

@Service
public class ClassDetailService {
	
	private ClassDetailDAO cdDAO;

	// 클래스 상세 조회
	public ClassDTO getClass(int classCode) {
		
	}

	// 같은 카테고리 클래스 목록 조회
	public List<ClassDTO> getSameCategoryList(int classCode, int categoryCode){
		
	}

	// 크리에이터 정보 조회
	public CreatorDTO getCreator(int creatorCode) {
		
	}

	// 대표 일정 조회
	public ScheduleDTO getSchedule(int classCode) {
		
	}

	// 일정 목록 조회
	public List<ScheduleDTO> getScheduleList(int classCode){
		
	}

	// 커리큘럼 조회
	public CurriculumDTO getCurriculum(int classCode) {
		
	}

	// 리뷰 목록 조회
	public List<ReviewDTO> getReviewList(int classCode){
		
	}

	// 찜 추가
	public int addBookmark(String memberCode, String classCode) {
		
	}

	// 찜 삭제
	public int removeBookmark(String memberCode, String classCode) {
		
	}

	// 리뷰 통계 조회
	public ReviewSummaryDTO getReviewSummary(int classCode) {
		
	}
}