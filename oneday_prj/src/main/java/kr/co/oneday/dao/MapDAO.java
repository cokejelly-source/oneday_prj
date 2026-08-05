package kr.co.oneday.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.oneday.dto.ClassDTO;
import kr.co.oneday.dto.MapSearchDTO;
@Mapper
public interface MapDAO {
	
	public List<ClassDTO> selectClassList(MapSearchDTO msDTO);
	
	public ClassDTO selectClassDetail(int classCode);
}
