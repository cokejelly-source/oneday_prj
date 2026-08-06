package kr.co.oneday.map.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.co.oneday.dto.RangeDTO;
import kr.co.oneday.map.dto.BookmarkDTO;
@Mapper
public interface BookmarkDAO {
	public int selectTotalCnt(String memberCode, RangeDTO rDTO);
	
	public List<BookmarkDTO> selectBookmark(
			@Param("memberCode") int memberCode,
			@Param("rDTO") RangeDTO rDTO);
	public int insertBookmark(
			@Param("memberCode") int memberCode,
			@Param("rDTO") int classCode);
	public int deleteBookmark(
			@Param("memberCode") int memberCode,
			@Param("rDTO") int classCode);
}
