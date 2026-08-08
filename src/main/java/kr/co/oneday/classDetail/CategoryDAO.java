package kr.co.oneday.classDetail;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.oneday.map.CategoryDTO;
import kr.co.oneday.map.ClassImageDTO;

@Mapper
public interface CategoryDAO {
	
	public List<CategoryDTO> selectCategoryList();
	
	
	public List<ClassImageDTO> selectImage(int classCode);
	
}		
