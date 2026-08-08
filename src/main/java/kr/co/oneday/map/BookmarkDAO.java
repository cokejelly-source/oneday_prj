package kr.co.oneday.map;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BookmarkDAO {
	public int selectTotalCnt(
			@Param("memberCode") int memberCode, 
			@Param("rDTO") RangeDTO rDTO);
	
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
