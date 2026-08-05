package kr.co.oneday.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.oneday.dto.CategoryDTO;
import kr.co.oneday.dto.CategorySearchDTO;
import kr.co.oneday.dto.ClassDTO;
import kr.co.oneday.dto.ClassImageDTO;

@Mapper
public interface CategoryDAO {
	
	public List<CategoryDTO> selectCategoryList();
	
	public List<ClassDTO> selectCategoryClass(CategorySearchDTO csDTO);
	
	public List<ClassImageDTO> selectImage(int classCode);
	
}		
