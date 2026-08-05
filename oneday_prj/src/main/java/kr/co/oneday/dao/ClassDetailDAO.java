package kr.co.oneday.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.oneday.dto.ClassDTO;
import kr.co.oneday.dto.CreatorDTO;
import kr.co.oneday.dto.CurriculumDTO;
import kr.co.oneday.dto.ReviewDTO;
import kr.co.oneday.dto.ReviewSummaryDTO;
import kr.co.oneday.dto.ScheduleDTO;

@Mapper
public interface ClassDetailDAO {
	
	
	public ClassDTO selectClass(int classCode);
	
	public List<ClassDTO> selectSameCategoryList(int classCode,int categoryCode);

	
	public CreatorDTO selectCreator(int creatorCode);

	
	public ScheduleDTO selectSchedule(int classCode);
	
	public List<ScheduleDTO> selectScheduleList(int classCode);
	
	public CurriculumDTO selectCurriculum(int classCode);
	
	public List<ReviewDTO> selectReviewList(int classCode);
	
	public int insertBookmark(String memberCode,String classCode);
	
	public int deleteBookmark(String memberCode, String classCode);
	
	public ReviewSummaryDTO selectReviewSummary(int classCode);
}
