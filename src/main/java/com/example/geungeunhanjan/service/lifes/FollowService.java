    package com.example.geungeunhanjan.service.lifes;


    import com.example.geungeunhanjan.domain.dto.FollowPage.FollowCriteria;
    import com.example.geungeunhanjan.domain.dto.file.FollowDTO;
    import com.example.geungeunhanjan.domain.dto.file.FollowHeartDTO;
    import com.example.geungeunhanjan.domain.vo.lifes.FollowVO;
    import com.example.geungeunhanjan.domain.vo.user.UniVO;
    import org.springframework.stereotype.Service;

    import java.util.List;

    @Service
    public interface FollowService {


    //팔로우의 다음 시퀀스
    Long getFollowSeqNext();
    //    팔로워 리스트 조회하기
    List<FollowDTO> selectFollower(Long uniId);
    // 팔로우 리스트 클릭시 상세 남의 페이지 조회하기
    FollowDTO selectFollowDetail(Long userId);
    //    팔로잉 리스트 조회하기
    List<FollowDTO> selectFollowing(Long uniId);
    //상세페이지 about 글 불러오기
    UniVO selectFollowAbout(Long userId);


        // 팔로우 팔로워의 일기 수 조회하기
        List<FollowDTO> selectBoardCount(Long userId);
        //팔로우 리스트 유저 클릭시 ; 팔로우 추가하기
        void insertFollow(FollowVO followVO);
        //팔로우 리스트 유저 클릭시 ; 언팔로우 하기
        void deleteFollow(FollowHeartDTO followHeartDTO);
        //팔로우 상태 확인하기
        int selectFollowStatus(FollowHeartDTO followHeartDTO);
        //페이징 처리
        List<FollowDTO> selectAllPageFollow(FollowCriteria followCriteria);
        //페이지 총 수 조회하기
        int selectTotalFollow();
    }
