package kr.co.oneday.dao;

import java.util.List;

import kr.co.oneday.dto.ClassDTO;
import kr.co.oneday.dto.CreatorDTO;
import kr.co.oneday.dto.CurriculumDTO;
import kr.co.oneday.dto.ReviewDTO;
import kr.co.oneday.dto.ReviewSummaryDTO;
import kr.co.oneday.dto.ScheduleDTO;

/**
 * 
 */
public class ClassDetailDAO {
	
	private static ClassDetailDAO cdDAO;
	
	private ClassDetailDAO() {
		
	}
	
	public static ClassDetailDAO getInstance() {
		if(cdDAO == null) {
			cdDAO=new ClassDetailDAO();
		}
		
		return cdDAO;
	}
	
	
	/**
	 * class정보를 가져올 메서드
	 * @param classCode
	 * @return
	 */
	public ClassDTO selectClass(int classCode) {
		
	}
	
	public List<ClassDTO> selectSameCategoryList(int classCode,int categoryCode){
		
	}
	
	public CreatorDTO selectCreator(int creatorCode) {
		
	}
	
	public ScheduleDTO selectSchedule(int classCode) {
		
	}
	
	public List<ScheduleDTO> selectScheduleList(int classCode) {
		
	}
	
	public CurriculumDTO selectCurriculum(int classCode) {
		
	}
	
	public List<ReviewDTO> selectReviewList(int classCode) {
		
	}
	
	public int insertBookmark(String memberCode,String classCode) {
		
	}
	
	public int deleteBookmark(String memberCode, String classCode) {
		
	}
	
	public ReviewSummaryDTO selectReviewSummary(int classCode) {
		
	}
}
