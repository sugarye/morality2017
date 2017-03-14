package morality.business.login.controller;

import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

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
		//获取用户列表
		List<Record> users=Db.find("select * from user ");
		//返回json数据
		renderJson(users);

	}

}
