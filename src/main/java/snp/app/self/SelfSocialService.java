package snp.app.self;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import snp.infra.security.Security;
import snp.app.common.*;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class SelfSocialService {
	
	@Autowired
	private SelfSocialRepository repository;
	
	@Autowired
	private CommonRepository commonRepository;
	
	public Map<String, Object> loadUserByUsername(Map<String, Object> params) throws UsernameNotFoundException
	{
		//if ((username == null) || username.isEmpty()) throw new IllegalArgumentException();
		
		Map<String, Object> u = repository.findUserByUsername(params, Security.user());
		/*if(u == null)
		{
			throw new UsernameNotFoundException("notfound");
		}
		List<MenuHierarchy> menus = commonRepository.findUserMenu(username);
		u.toAuthority(menus);*/
		return u;
	}
	
	public List<Map<String, Object>> findUsers(Map<String, Object> params)
	{
		return repository.findUsers(params, Security.user());
	}
	
	public Map<String, Object> findUser(Map<String, Object> params)
	{
		return repository.findUser(params, Security.user());
	}
	
	public int saveUser(Map<String, Object> params)
	{
		int r = 0;
		/*if(u.getUserSeq() > 0)
		{
			boolean changeRole = false;
			User user = findUser(u.getUserSeq());
			r = repository.updateUser(u);
			if(user.getRoleCd() == null && u.getRoleCd() != null)
			{
				changeRole = true;
			}
			if(user.getRoleCd() != null && u.getRoleCd() == null)
			{
				changeRole = true;
			}
			
			if(user.getRoleCd() != null && u.getRoleCd() != null && !user.getRoleCd().equals(u.getRoleCd()))
			{
				changeRole = true;
			}
			saveUserRole(u.getRoleCd(), u.getUserId());
			
		}
		else
		{
			r = repository.insertUser(u);
			if(u.getRoleCd() != null)
			{
				saveUserRole(u.getRoleCd(), u.getUserId());
			}
		}*/
		
		
		return r;
	}
	
	private int saveUserRole(Map<String, Object> params)
	{
		commonRepository.deleteRoleUser(params, Security.user());
		if(params.get("ROLE_CDs") != null)
		{
			commonRepository.insertRoleUser(params, Security.user());
		}
		return 1;
	}
	
	public int deleteUser(Map<String, Object> params)
	{
		return repository.deleteUser(params, Security.user());
	}
	
	// 센터 관리
	public List<Map<String, Object>> findCenterMgm() {
		return repository.findCenterMgm(Security.user());
	}

	
	// 자가진단 최초등록
	public int saveStepForm(Map<String, Object> params) {

		repository.insertStepForm(params, Security.user());
		
		return 1;
	}
	// 자가진단업데티트1
	public int saveStepForm1(Map<String, Object> params) {

		repository.updateStepForm1(params, Security.user());
		
		return 1;
	}
	// 자가진단업데티트2
	public int saveStepForm2(Map<String, Object> params) {

		repository.updateStepForm2(params, Security.user());
		
		return 1;
	}
	// 자가진단업데티트3
	public int saveStepForm3(Map<String, Object> params) {

		repository.updateStepForm3(params, Security.user());
		
		return 1;
	}
	// 자가진단업데티트4
		public int saveStepForm4(Map<String, Object> params) {

			repository.updateStepForm4(params, Security.user());
			
			return 1;
		}	
		// 자가진단업데티트4
		public int saveStepForm5(Map<String, Object> params) {

			repository.updateStepForm5(params, Security.user());
			
			return 1;
		}	
		// 자가진단업데티트4
		public int saveStepForm6(Map<String, Object> params) {

			repository.updateStepForm6(params, Security.user());
			
			return 1;
		}	
		// 자가진단업데티트4
		public int saveStepForm7(Map<String, Object> params) {

			repository.updateStepForm7(params, Security.user());
			
			return 1;
		}	
		// 자가진단업데티트4
		public int saveStepForm8(Map<String, Object> params) {

			repository.updateStepForm8(params, Security.user());
			
			return 1;
		}
		// 자가진단업데티트4
		public int saveStepForm9(Map<String, Object> params) {

			repository.updateStepForm9(params, Security.user());
			
			return 1;
		}				
	// 자가진단업데티트 -1
		public int saveStepBack1(Map<String, Object> params) {

			repository.updateStepBack1(params, Security.user());
			
			return 1;
		}
		// 자가진단업데티트 -1
		public int saveStepBack2(Map<String, Object> params) {

			repository.updateStepBack2(params, Security.user());
			
			return 1;
		}
		// 자가진단업데티트 -1
		public int saveStepBack3(Map<String, Object> params) {

			repository.updateStepBack3(params, Security.user());
			
			return 1;
		}
		// 자가진단업데티트 -1
		public int saveStepBack4(Map<String, Object> params) {

			repository.updateStepBack4(params, Security.user());
			
			return 1;
		}
		// 자가진단업데티트 -1
		public int saveStepBack5(Map<String, Object> params) {

			repository.updateStepBack5(params, Security.user());
			
			return 1;
		}
		// 자가진단업데티트 -1
		public int saveStepBack6(Map<String, Object> params) {

			repository.updateStepBack6(params, Security.user());
			
			return 1;
		}
		// 자가진단업데티트 -1
		public int saveStepBack7(Map<String, Object> params) {

			repository.updateStepBack7(params, Security.user());
			
			return 1;
		}
		// 자가진단업데티트 -1
		public int saveStepBack8(Map<String, Object> params) {

			repository.updateStepBack8(params, Security.user());
			
			return 1;
		}
																
	// 자가진단 기본정보 업데티트
	public int saveUpdateStep(Map<String, Object> params) {

		repository.updateStepForm(params, Security.user());
		
		return 1;
	}
	// 자가진단 스템1 리스트
	public Map<String, Object> findstepList1()
	{
		return repository.findstepList1(Security.user());
	
	}
	
//	public Map<String, Object> findstepList1(Map<String, Object> params){
//		return repository.findstepList1(params, Security.user());
 //  }
	
	public Map<String, Object> findstepList2(Map<String, Object> params)
   {
	return repository.findstepList2(params, Security.user());
    }
	
	public Map<String, Object> findstepList3(Map<String, Object> params)
	   {
		return repository.findstepList3(params, Security.user());
	    }
			

	public Map<String, Object> findstepList4(Map<String, Object> params)
	{
		return repository.findstepList4(params, Security.user());
	
	}

	public Map<String, Object> findstepList5(Map<String, Object> params)
	{
		return repository.findstepList5(params, Security.user());
	
	}
	public Map<String, Object> findstepList6(Map<String, Object> params)
	{
		return repository.findstepList6(params, Security.user());
	
	}	
	public Map<String, Object> findstepList7(Map<String, Object> params)
	{
		return repository.findstepList7(params, Security.user());
	
	}	
	public Map<String, Object> findstepList8(Map<String, Object> params)
	{
		return repository.findstepList8(params, Security.user());
	
	}	
	public Map<String, Object> findstepList9(Map<String, Object> params)
	{
		return repository.findstepList9(params, Security.user());
	
	}	
	
	// 결과조회 화면
	public Map<String, Object> resultStepList(Map<String, Object> params)
	{
		return repository.resultStepList(params, Security.user());
	
	}		
	// 결과조회 화면
	public Map<String, Object> resultSteplow(Map<String, Object> params)
	{
		return repository.resultSteplow(params, Security.user());
	
	}	
	// 결과조회 화면
	public Map<String, Object> resultSteptop(Map<String, Object> params)
	{
		return repository.resultSteptop(params, Security.user());
	
	}	
	// 결과조회 화면
	public Map<String, Object> resultMent(Map<String, Object> params)
	{
		return repository.resultMent(params, Security.user());
	
	}		
	
			// 
		public Map<String, Object> chartAllGrade(Map<String, Object> params) {
		Map<String, Object> nestedData = new HashMap<>();
		
		nestedData.put("socialData", chartAllGradeSocial(params));
		nestedData.put("totalData", chartAllGradeTotal());
		nestedData.put("mytotalData", chartAllGradeMyTotal(params));
		
		return nestedData;
		}
		
		
		public Map<String, Object> chartAllrader(Map<String, Object> params) {
		Map<String, Object> nestedData = new HashMap<>();
		
		nestedData.put("radersocialData", chartAllraderSocial(params));

		
		return nestedData;
		}
		//
		public List<Map<String, Object>> chartAllraderSocial(Map<String, Object> params) {
			return repository.chartAllraderSocial(params, Security.user());
		}
		// 
		public List<Map<String, Object>> chartAllGradeSocial(Map<String, Object> params) {
			return repository.chartAllGradeSocial(params, Security.user());
		}

		// 
		public List<Map<String, Object>> chartAllGradeTotal() {
			return repository.chartAllGradeTotal(Security.user());
		}		

		// 
		public List<Map<String, Object>> chartAllGradeMyTotal(Map<String, Object> params) {
			return repository.chartAllGradeMyTotal(params,Security.user());
		}	
//	public Map<String, Object> findstepList2(Map<String, Object> params)
//	{
//		return repository.findstepList2(params, Security.user());
//	}	


	// 참여기업 결과 리스트
	public List<Map<String, Object>>gridCorp() {
		List<Map<String, Object>> result;

		result = repository.gridCorp(Security.user()); //전체

		return result;
	}
	
}
