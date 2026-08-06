package kr.co.oneday.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.oneday.classDetail.dao.ClassDetailDAO;
import kr.co.oneday.map.dao.BookmarkDAO;
import kr.co.oneday.map.dao.CategoryDAO;
import kr.co.oneday.map.dto.CategoryDTO;
import kr.co.oneday.map.dto.ClassDTO;
import kr.co.oneday.map.dto.MapSearchDTO;


@Service
public class MapService {
	
	
    private CategoryDAO cDAO;
	private ClassDetailDAO cdDAO;
	private BookmarkDAO bDAO;
	
	public List<ClassDTO> getClass(MapSearchDTO mDTO){
		
	}
	
	public int addBookmark(String memberCode, String classCode) {
		
	}
	
	public int removeBookmark(String memberCode, String classCode) {
		
	}
	
	public List<CategoryDTO> getCategoryList(){
		return cDAO.selectCategoryList();

	}
}
