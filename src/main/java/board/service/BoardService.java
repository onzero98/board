package board.service;

import java.util.List;
import board.dto.BoardDto;

public interface BoardService {

    // 게시판 목록을 조회해서 반환하는 메소드를 정의
    List<BoardDto> selectBoardList() throws Exception;

    void insertBoard(BoardDto board) throws Exception;

    BoardDto selectBoardDetail(int boardIdx) throws Exception;
}
