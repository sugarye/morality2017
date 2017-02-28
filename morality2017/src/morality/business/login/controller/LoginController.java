package morality.business.login.controller;

import com.jfinal.core.Controller;

/**
* @ClassName: LoginController
* @Description: 用户登录的控制器
* @author: Yetangtang
* @date: 2017年2月25日 上午11:10:54
* @version: 1.0 版本初成
 */
public class LoginController extends Controller{
	
	public void index(){
		render("index.html");
	}
	
	public void userLogin(){
		renderText("欢迎yetangtang登录");

	}

}
