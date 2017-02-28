package morality.base;

import com.jfinal.config.Routes;

import morality.business.login.controller.LoginController;

/**
* @ClassName: AdminRoutes
* @Description: 配置后端路由（供管理系统）
* @author: Yetangtang
* @date: 2017年2月27日 下午6:21:20
* @version: 1.0 版本初成
 */
public class AdminRoutes extends Routes{

	@Override
	public void config() {
		//设置页面base路径
		setBaseViewPath("/view/admin");
		//用户登录控制器
		add("/login",LoginController.class,"/");
		
	}

}
