package morality.util.task;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.cron4j.ITask;
/**
* @ClassName: UserTask
* @Description: 用户任务调度实现
* @author: Yetangtang
* @date: 2017年3月14日 下午9:23:31
* @version: 1.0 版本初成
*/
public class UserTask extends Controller implements ITask {

	@Override
	public void run() {
		//格式化时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=sdf.format(new Date());
		System.out.println("我是任务调度器"+time);
		//查询数据
		List<Record> list= Db.find("select * from user");
		//遍历数据
		for(Record user:list){
			System.out.println(user.getStr("name"));
		}
	}

	@Override
	public void stop() {
		System.out.println("任务结束了");
	}


}
