package kr.co.oneday.classDetail.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.co.oneday.classDetail.dto.ClassDTO;
import kr.co.oneday.classDetail.dto.CurriculumDTO;
import kr.co.oneday.classDetail.dto.OperatorDTO;
import kr.co.oneday.classDetail.dto.ReviewDTO;
import kr.co.oneday.classDetail.dto.ReviewSummaryDTO;
import kr.co.oneday.classDetail.dto.ScheduleDTO;


@Mapper
public interface ClassDetailDAO {
	
	//클래스 정보 조회
	public ClassDTO selectClass(int classCode);
	
	//비슷한 클래스 조회
	public List<ClassDTO> selectSameCategoryList( 
			@Param("classCode") int classCode,
	        @Param("categoryCode") int categoryCode
	        );

	//작가 조회
	public OperatorDTO selectCreator(int creatorCode);

	//클래스 스케쥴 조회
	public ScheduleDTO selectSchedule(int classCode);
	
	//클래스 스케쥴 리스트 조회
	public List<ScheduleDTO> selectScheduleList(int classCode);
	
	//커리큘럼 조회
	public CurriculumDTO selectCurriculum(int classCode);
	
	//리뷰 리스트 조회
	public List<ReviewDTO> selectReviewList(int classCode);
	
	//북마크 추가
	public int insertBookmark(
			@Param("memberCode") int memberCode,
			@Param("classCode") int classCode);
	
	//북마크 삭제
	public int deleteBookmark(
			@Param("memberCode") int memberCode,
			@Param("classCode") int classCode);
	
	//리뷰별점, 리뷰 점수 조회
	public ReviewSummaryDTO selectReviewSummary(int classCode);
}
