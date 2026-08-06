package kr.co.oneday.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CurriculumDTO {
	private int curriculumCode;//커리큘럼코드
	private int classCode;//클래스코드
	private int type;//커리큘럼단계
	private String title;//커리큘럼제목
	private String content;//커리큘럼내용
	private String img;//커리큘럼이미지
}
