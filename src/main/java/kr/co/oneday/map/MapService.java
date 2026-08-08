package kr.co.oneday.map;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.oneday.classDetail.CategoryDAO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MapService {
	
	private final MapDAO mDAO;
	private final CategoryDAO cDAO;
	private final BookmarkDAO bDAO;
	
	// 💡 이 부분의 return 문이 비어 있어서 발생한 에러입니다!
	public List<ClassDTO> getClassList(MapSearchDTO mDTO) {
		// 우선 화면을 띄우기 위해 빈 리스트를 반환하도록 작성합니다.
		// (추후 mDAO 연동 로직으로 작성하시면 됩니다)
		return mDAO.selectClassList(mDTO); 
	}
	
	public int addBookmark(int memberCode, int classCode) {
		return bDAO.insertBookmark(memberCode, classCode);
	}
	
	public int removeBookmark(int memberCode, int classCode) {
		return bDAO.deleteBookmark(memberCode, classCode);
	}
	
	public List<CategoryDTO> getCategoryList() {
		return cDAO.selectCategoryList();
	}
	
	public List<BookmarkDTO> getBookmarkList(int memberCode, RangeDTO rDTO) {
		return bDAO.selectBookmark(memberCode, rDTO);
	}
	
	public List<MapSearchDTO> search(double minLat, double maxLat, double minLng, double maxLng) {
		return mDAO.search(minLat, maxLat, minLng, maxLng);
	}
}