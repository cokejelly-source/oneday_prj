package kr.co.oneday.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.oneday.dto.BookmarkDTO;
import kr.co.oneday.dto.RangeDTO;
@Mapper
public interface BookmarkDAO {
	public int selectTotalCnt(String memberCode, RangeDTO rDTO);
	
	public List<BookmarkDTO> selectBookmark(String memberCode, RangeDTO rDTO);
	public int insertBookmark(String memberCode, String classCode);
	public int deleteBookmark(String memberCode, String classCode);
}
