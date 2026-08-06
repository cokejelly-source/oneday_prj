package kr.co.oneday.map.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.oneday.map.dto.CategoryDTO;
import kr.co.oneday.map.dto.ClassImageDTO;

@Mapper
public interface CategoryDAO {
	
	public List<CategoryDTO> selectCategoryList();
	
	
	public List<ClassImageDTO> selectImage(int classCode);
	
}		
