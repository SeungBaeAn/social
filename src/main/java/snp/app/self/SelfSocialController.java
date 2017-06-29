
package snp.app.self;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import snp.infra.helper.RequestParams;
import snp.infra.user.model.User;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/self")
public class SelfSocialController {

	@Autowired
	private SelfSocialService service;

	@RequestMapping(value="", method= RequestMethod.GET)
	public User getLoggedInUser()
	{
		User u = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return u;
	}
	/**
	 * 사용자 상세
	 * from user_detail.php
	 * @param userSeq
	 * @return
	 */
	@RequestMapping(value="/{userSeq}", method= RequestMethod.GET)
	public Map<String, Object> findUsers(@PathVariable("userSeq") Integer userSeq)
	{
		return service.findUser(RequestParams.map());
	}

	/**
	 * 사용자 목록
	 * from user_info_count.php , user_info.php
	 * @param page
	 * @param keyword
	 * @return
	 */
	@RequestMapping(value="/find/{page}/{keyword}", method= RequestMethod.GET)
	public List<Map<String, Object>> findUsers(@PathVariable("page") Integer page, @RequestParam(value="keyword",required=false) String keyword)
	{
		return service.findUsers(RequestParams.map());
	}

	@RequestMapping(value="/find", method= RequestMethod.GET)
	public List<Map<String, Object>> findUsers(@RequestParam(value="keyword",required=false) String keyword)
	{
		return service.findUsers(RequestParams.map());
	}

	/**
	 * 사용자 저장(입력,수정)
	 * from user_save.php
	 * @param
	 * @return
	 */
	@RequestMapping(value="", method={RequestMethod.POST, RequestMethod.PUT})
	public int saveUser(@RequestBody Map<String, Object> params)
	{
		return service.saveUser(RequestParams.map());
	}
	
	/**
	 * 사용자 삭제
	 * @param userSeq
	 * @return
	 */
	@RequestMapping(value="/{userSeq}", method={RequestMethod.DELETE})
	public int deleteUser(@PathVariable("userSeq") Integer userSeq)
	{
		return service.deleteUser(RequestParams.map());
	}
	/**
	 * 자가진단 최초 저장
	 * @return
	 */
	@RequestMapping(value="/step", method= RequestMethod.POST)
	public int saveStepForm(@RequestBody Map<String, Object> params)
	{
		return service.saveStepForm(params);
	}
	/**
	 * 자가진단 업데이트 기본정보 저장
	 * @return
	 */	
	@RequestMapping(value="/stepupdate", method= RequestMethod.POST)
	public int saveUpdateStep(@RequestBody Map<String, Object> params)
	{
		return service.saveUpdateStep(params);
	}
	/**
	 * 자가진단 업데이트 스텝1 저장
	 * @return
	 */	
	@RequestMapping(value="/stepup1", method= RequestMethod.POST)
	public int saveStepForm1(@RequestBody Map<String, Object> params)
	{
		return service.saveStepForm1(params);
	}
	/**
	 * 자가진단 업데이트 스텝2 저장
	 * @return
	 */	
	@RequestMapping(value="/stepup2", method= RequestMethod.POST)
	public int saveStepForm2(@RequestBody Map<String, Object> params)
	{
		return service.saveStepForm2(params);
	}
	/**
	 * 자가진단 업데이트 스텝3 저장
	 * @return
	 */	
	@RequestMapping(value="/stepup3", method= RequestMethod.POST)
	public int saveStepForm3(@RequestBody Map<String, Object> params)
	{
		return service.saveStepForm3(params);
	}
	/**
	 * 자가진단 업데이트 스텝4 저장
	 * @return
	 */	
	@RequestMapping(value="/stepup4", method= RequestMethod.POST)
	public int saveStepForm4(@RequestBody Map<String, Object> params)
	{
		return service.saveStepForm4(params);
	}
	/**
	 * 자가진단 업데이트 스텝5 저장
	 * @return
	 */
	@RequestMapping(value="/stepup5", method= RequestMethod.POST)
	public int saveStepForm5(@RequestBody Map<String, Object> params)
	{
		return service.saveStepForm5(params);
	}
	/**
	 * 자가진단 업데이트 스텝6 저장
	 * @return
	 */
	@RequestMapping(value="/stepup6", method= RequestMethod.POST)
	public int saveStepForm6(@RequestBody Map<String, Object> params)
	{
		return service.saveStepForm6(params);
	}
	/**
	 * 자가진단 업데이트 스텝7 저장
	 * @return
	 */
	@RequestMapping(value="/stepup7", method= RequestMethod.POST)
	public int saveStepForm7(@RequestBody Map<String, Object> params)
	{
		return service.saveStepForm7(params);
	}
	/**
	 * 자가진단 업데이트 스텝8 저장
	 * @return
	 */
	@RequestMapping(value="/stepup8", method= RequestMethod.POST)
	public int saveStepForm8(@RequestBody Map<String, Object> params)
	{
		return service.saveStepForm8(params);
	}
	/**
	 * 자가진단 업데이트 스텝8 저장
	 * @return
	 */
	@RequestMapping(value="/stepup9", method= RequestMethod.POST)
	public int saveStepForm9(@RequestBody Map<String, Object> params)
	{
		return service.saveStepForm9(params);
	}		
		 /**
			 * 자가진단 -1 저장
			 * @return
			 */	
			@RequestMapping(value="/stepback1", method= RequestMethod.POST)
			public int saveStepBack1(@RequestBody Map<String, Object> params)
			{
				return service.saveStepBack1(params);
			}	
			 /**
			 * 자가진단 -2 저장
			 * @return
			 */	
			@RequestMapping(value="/stepback2", method= RequestMethod.POST)
			public int saveStepBack2(@RequestBody Map<String, Object> params)
			{
				return service.saveStepBack2(params);
			}	
			 /**
			 * 자가진단 -1 저장
			 * @return
			 */	
			@RequestMapping(value="/stepback3", method= RequestMethod.POST)
			public int saveStepBack3(@RequestBody Map<String, Object> params)
			{
				return service.saveStepBack3(params);
			}	
			 /**
			 * 자가진단 -1 저장
			 * @return
			 */	
			@RequestMapping(value="/stepback4", method= RequestMethod.POST)
			public int saveStepBack4(@RequestBody Map<String, Object> params)
			{
				return service.saveStepBack4(params);
			}	
			 /**
			 * 자가진단 -1 저장
			 * @return
			 */	
			@RequestMapping(value="/stepback5", method= RequestMethod.POST)
			public int saveStepBack5(@RequestBody Map<String, Object> params)
			{
				return service.saveStepBack5(params);
			}	
			 /**
			 * 자가진단 -1 저장
			 * @return
			 */	
			@RequestMapping(value="/stepback6", method= RequestMethod.POST)
			public int saveStepBack6(@RequestBody Map<String, Object> params)
			{
				return service.saveStepBack6(params);
			}	
			 /**
			 * 자가진단 -1 저장
			 * @return
			 */	
			@RequestMapping(value="/stepback7", method= RequestMethod.POST)
			public int saveStepBack7(@RequestBody Map<String, Object> params)
			{
				return service.saveStepBack7(params);
			}	
			 /**
			 * 자가진단 -1 저장
			 * @return
			 */	
			@RequestMapping(value="/stepback8", method= RequestMethod.POST)
			public int saveStepBack8(@RequestBody Map<String, Object> params)
			{
				return service.saveStepBack8(params);
			}				
		
	/**
	 * 
	 * 
	 * 자가진단  스템1 목록
	 * @return
	 */	
	
//	public List<Map<String, Object>> findstepList1(){
	@RequestMapping(value="/stepList1")
	public Map<String, Object> findstepList1(){
		return service.findstepList1();
	}
//	@RequestMapping(value="/findStep2", method= RequestMethod.GET)
//	public Map<String, Object>findstepList2(@RequestParam Map<String, Object> params){
//		return service.findstepList2(params);
//	}	
	
	@RequestMapping(value="/findStep2")
    public Map<String, Object> findstepList2(){
		return service.findstepList2();
//	return service.findstepList2(RequestParams.map());
   }
	@RequestMapping(value="/findStep3")
    public Map<String, Object> findstepList3(){
		return service.findstepList3();
//	return service.findstepList2(RequestParams.map());
   }
	@RequestMapping(value="/findStep4")
    public Map<String, Object> findstepList4(){
		return service.findstepList4();
//	return service.findstepList2(RequestParams.map());
   }
	@RequestMapping(value="/findStep5")
    public Map<String, Object> findstepList5(){
		return service.findstepList5();
//	return service.findstepList2(RequestParams.map());
   }
	@RequestMapping(value="/findStep6")
    public Map<String, Object> findstepList6(){
		return service.findstepList6();
//	return service.findstepList2(RequestParams.map());
   }
	@RequestMapping(value="/findStep7")
    public Map<String, Object> findstepList7(){
		return service.findstepList7();
//	return service.findstepList2(RequestParams.map());
   }
	
	@RequestMapping(value="/findStep8")
    public Map<String, Object> findstepList8(){
		return service.findstepList8();
//	return service.findstepList2(RequestParams.map());
   }
	@RequestMapping(value="/findStep9")
    public Map<String, Object> findstepList9(){
		return service.findstepList9();
//	return service.findstepList2(RequestParams.map());
   }
	@RequestMapping(value="/resultStep")
    public Map<String, Object> resultStepList(){
		return service.resultStepList();
//	return service.findstepList2(RequestParams.map());
   }	
	@RequestMapping(value="/resultSteplow")
    public Map<String, Object> resultSteplow(){
		return service.resultSteplow();
//	return service.findstepList2(RequestParams.map());
   }		
	@RequestMapping(value="/resultSteptop")
    public Map<String, Object> resultSteptop(){
		return service.resultSteptop();
//	return service.findstepList2(RequestParams.map());
   }
	@RequestMapping(value="/resultMent")
    public Map<String, Object> resultMent(){
		return service.resultMent();
//	return service.findstepList2(RequestParams.map());
   }
	// 참여기업 결과 리스트
	@RequestMapping(value="/corplist", method= RequestMethod.GET)
	public List<Map<String, Object>>gridCorp(){
		return service.gridCorp();
	}
		
}
