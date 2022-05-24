package spartayn.shop.community.domain;

import lombok.Getter;

import java.time.format.DateTimeFormatter;

@Getter
public class BoardMainPageResponseDto {

    /**
     * 메인 페이지 정보 (제목, 작성자, 날짜) 전달 DTO
     */
    private String title;
    private String writer;
    private String createdAt;
    public BoardMainPageResponseDto(Board entity) {
        this.title = entity.getTitle();
        this.writer = entity.getWriter();
        this.createdAt = entity.getCreatedAt().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));
    }
}
