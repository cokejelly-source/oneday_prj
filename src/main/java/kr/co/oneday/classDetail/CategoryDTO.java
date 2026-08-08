package kr.co.oneday.classDetail;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class CategoryDTO {
	private int categoryCode;
	private int parentCategoryCode;
	private String categoryName;
}
