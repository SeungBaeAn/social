package snp.app.self;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import snp.infra.user.model.User;

import java.util.List;
import java.util.Map;

@Repository
public interface SelfSocialRepository {
	int countUsers(String userNm);
	List<Map<String, Object>> findUsers(@Param("p") Map<String, Object> params, @Param("u") User user);
	Map<String, Object> findUser(@Param("p") Map<String, Object> params, @Param("u") User user);
	Map<String, Object> findUserByUsername(@Param("p") Map<String, Object> params, @Param("u") User user);
	int insertUser(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateUser(@Param("p") Map<String, Object> params, @Param("u") User user);
	int deleteUser(@Param("p") Map<String, Object> params, @Param("u") User user);
	
	// 자가진단 시작
	List<Map<String, Object>> findCenterMgm(@Param("u") User user);
	// 자가진단 최초등록
	int insertStepForm(@Param("p") Map<String, Object> params, @Param("u") User user);
	//자가 진단 첫번째 입력폼 업데이트
	int updateStepForm(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepForm1(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepForm2(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepForm3(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepForm4(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepForm5(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepForm6(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepForm7(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepForm8(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepForm9(@Param("p") Map<String, Object> params, @Param("u") User user);
	
	int updateStepBack1(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepBack2(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepBack3(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepBack4(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepBack5(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepBack6(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepBack7(@Param("p") Map<String, Object> params, @Param("u") User user);
	int updateStepBack8(@Param("p") Map<String, Object> params, @Param("u") User user);
	
	int deleteStepForm(@Param("p") Map<String, Object> params, @Param("u") User user);
	
//	Map<String, Object> findstepList2(@Param("p") Map<String, Object> params, @Param("u") User user);
//	Map<String, Object> findstepList2(@Param("p") Map<String, Object> params, @Param("u") User user);

		// 자가진단 스템1 리스트
//	List<Map<String, Object>> findstepList1(@Param("u") User user);
	//겱과 조회 리스트
	Map<String, Object> resultStepList(@Param("u") User user);
	Map<String, Object> resultSteplow(@Param("u") User user);
	Map<String, Object> resultSteptop(@Param("u") User user);
		
//	List<Map<String, Object>> findstepList1();
	Map<String, Object> findstepList9(@Param("u") User user);
	Map<String, Object> findstepList8(@Param("u") User user);
	Map<String, Object> findstepList7(@Param("u") User user);
	Map<String, Object> findstepList6(@Param("u") User user);
	Map<String, Object> findstepList5(@Param("u") User user);
	Map<String, Object> findstepList4(@Param("u") User user);
	Map<String, Object> findstepList3(@Param("u") User user);
//	Map<String, Object> findstepList2(@Param("p") Map<String, Object> params, @Param("u") User user);

	Map<String, Object> findstepList2(@Param("u") User user);
	Map<String, Object> findstepList1(@Param("u") User user);

	// 참여기업 결과 리스트
	List<Map<String, Object>>gridCorp(@Param("u") User user);

}