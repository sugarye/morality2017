
package morality.base;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.plugin.cron4j.Cron4jPlugin;
import com.jfinal.template.Engine;

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
		
		//读取配置文件
		PropKit.use("config.txt");
		
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
		
		//读取属性配置文件
		loadPropertyFile("config.txt");
		
		//创建C3p0插件，并添加到jfinal的配置中
		C3p0Plugin c3p0Plugin = new C3p0Plugin(getProperty("jdbcUrl"),getProperty("user"),getProperty("password"));
		me.add(c3p0Plugin);  
		
		//添加ActiveRecord组件
		ActiveRecordPlugin arp=new ActiveRecordPlugin(c3p0Plugin);
		me.add(arp);
		
		//添加任务调度插件
		me.add(new Cron4jPlugin(PropKit.use("task.properties")));
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub

	}
	
    
    public void afterJFinalStart() {
    	//
    	super.afterJFinalStart();
    	System.out.println("项目启动了，我可以执行程序了");
    }
 

}
