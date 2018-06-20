package com.test.action;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.test.demo.User;
import com.test.service.TestService;

@Controller
public class TestActionController {
	static Log log = LogFactory.getLog(TestActionController.class);
	@Autowired(required=true)
	TestService TestService;
	
	@RequestMapping("/Servlet01")
	public String test(HttpServletRequest req,HttpServletResponse res,ModelAndView mav,User u,RedirectAttributes  redi){
		//向数据库录入信息
		String username = req.getParameter("username1");
		String password = req.getParameter("password1");
		if("".equals(username)||"".equals(password)||null==username||null==password){
			Map<String, Object> errorMap = new HashMap<String, Object>();
			redi.addFlashAttribute("errorMessage", "请输入用户名密码");
			redi.addAttribute("aa", "asd");
			HttpSession session = req.getSession();
			session.setAttribute("aa", "session");
			return "error";
		}
		u.setUsername(username);
		u.setPassword(password);
		String path = req.getRealPath("baoxiao.png");
		boolean b = TestService.insertSjd(u);
		List<Map> Slist = TestService.findUser();
		System.out.println("Controller层");
		ModelAndView mv = new ModelAndView("redirect:/test.jsp");
		return "test";
	}

	@RequestMapping("/testView")
	public ModelAndView returnJsp(){
		/**
		 * 返回key-value值
		 */
//		String message = "返回页面的单条信息";
//		return new ModelAndView("test","message",message);
		
		/**
		 * 返回对象
		 */
		
		/**
		 * 返回集合
		 */
		
		System.out.println("这是多数据传输测试");
		User u = new User();
		u.setUsername("张山");
		u.setPassword("zhangsan");
		ModelAndView mav = new ModelAndView("test");
		List<User> listUsers = new ArrayList<User>();
		listUsers.add(new User("张山", "zhangsan"));
		listUsers.add(new User("李四", "lisi"));
		listUsers.add(new User("王五", "wangwu"));
		listUsers.add(new User("赵六", "zhaoliu"));
		listUsers.add(new User("田七", "tianqi"));
		mav.addObject("users", listUsers);
		mav.addObject("", "");
		return mav;
	}
	
	public static void main(String args[]){
		String str1 = new String("a");
		String str11 = new String("");
		String str2 = new String("a");
		String str3 = "b";
		String str4 = "b";
		System.out.println(str11);
		System.out.println("str1+str2="+str1==str2);
		System.out.println("str3+str4="+str3==str4);
		System.out.println(str1.equals(str2));
		int i1 = 1;
		int i2 = 1;
		System.out.println(i1==i2);
		Integer i3 = 1;
		Integer i4 = 1;
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		char s = 'a';
		char d = 'a';
		System.out.println(s==d);
		System.out.println(s);
		
	}
	
	@RequestMapping("/downFile")
	public void downFiles(HttpServletResponse response,HttpServletRequest request){
		String fileDownName  = "zhong中国.txt";
		File file = new File("C:/Users/shiji/Desktop/HTTP/aa.txt");
		try {
			String code = bianma(file);
			log.info("文件编码格式:"+code);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		FileInputStream is = null;
		OutputStream os = null;
		String user_agent = request.getHeader("User-Agent");
		System.out.println(user_agent);
		if(file.exists()&&file.isFile()){
			try {
				is = new FileInputStream(file);
				int  i = 0;
				//设置输出格式
				response.reset();
				response.setCharacterEncoding("utf-8");
				response.setContentType("application/x-msdownload");
//				response.setContentType("application/vnd.ms-excel;charset=utf-8");
//				response.setContentType("multipart/form-data");
				response.addHeader("Content-disposition", "attachment;filename="+new String(fileDownName.getBytes(),"ISO8859-1"));
				byte[] b = new byte[1024];
				os = response.getOutputStream();
				while((i=is.read())!=-1){
					os.write(b, 0, i);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	/**
	 * 第一种判断编码格式
	 * @param file
	 * @return
	 * @throws Exception
	 */
	public String bianma(File file) throws Exception{
		String code = null;
		try {
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(file));
			int b = (bin.read()<<8)+bin.read();
			switch (b) {
			case 0xefbb:
				code = "UTF-8";
				break;
			case 0xfffe:
				code = "Unicode";
				break;
			case 0xfeff:
				code = "UTF-16";
				break;

			default:
				code = "gbk";
				break;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return code;
	}
	
	/**
	 * 第二种判断编码格式
	 * @param file
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("resource")
	public String bianma2(File file) throws Exception{
		String code = null;
		InputStream is = new FileInputStream(file);
		byte[] b = new byte[3];
		is.read(b);
		if(b[0]==-17&&b[1]==-69&&b[2]==-65){
			code = "utf-8";
			log.info("文件编码格式：utf-8");}
		else {
			code = "gbk";
			log.info("可能是gbk编码格式");
		}
		return code;
	}
}
