
package morality.base;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.template.Engine;

import morality.business.login.controller.LoginController;
import morality.util.interceptor.FrontInterceptor;

/**
 * @ClassName: MoralityConfig
 * @Description:基础配置文件类
 * @author: Yetangtang
 * @date: 2017年2月22日 下午4:50:08
 * @version: 1.0 版本初成
 */
public class MoralityConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		//设置当前环境为开发环境
		me.setDevMode(true);
	}

	@Override
	public void configRoute(Routes me) {
         me.add(new FrontRoutes()); //前端路由
         me.add(new AdminRoutes()); //后端路由
	}

	@Override
	public void configEngine(Engine me) {

	}

	@Override
	public void configPlugin(Plugins me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub

	}

}
