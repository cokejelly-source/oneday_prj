package kr.co.oneday.map.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.co.oneday.map.dto.ClassDTO;
import kr.co.oneday.map.dto.MapSearchDTO;

@Mapper
public interface MapDAO {
	
	
	public ClassDTO selectClassDetail(int classCode);
	
	public List<MapSearchDTO> search(
            @Param("minLat") double minLat,
            @Param("maxLat") double maxLat,
            @Param("minLng") double minLng,
            @Param("maxLng") double maxLng);
	
}
