package kr.co.oneday.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.oneday.dao.BookmarkDAO;
import kr.co.oneday.dao.CategoryDAO;
import kr.co.oneday.dao.ClassDetailDAO;
import kr.co.oneday.dto.CategoryDTO;
import kr.co.oneday.dto.ClassDTO;
import kr.co.oneday.dto.MapSearchDTO;

@Service
public class MapService {
	
	
	@Autowired
    private CategoryDAO cDAO;
	@Autowired
	private ClassDetailDAO cdDAO;
	@Autowired
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
