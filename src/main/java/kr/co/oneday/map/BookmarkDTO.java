package kr.co.oneday.map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookmarkDTO {
	private String className;
	private String classResion;
	private String classImg;
	private String classPrice;
}
