package board.dto;

import lombok.Data;

// 모든 필드의 getter, setter, toSting, hashCode, equals 메소드를 자동으로 생성 !! Lombok @Data
@Data
public class BoardDto {
    private int board_idx;
    private String title;
    private String contents;
    private int hit_cnt;
    private String created_datetime;
    private String creator_id;
    private String updated_datetime;
    private String updator_id;
}
