package morality.util.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

public class FrontInterceptor implements Interceptor {

	@Override
	public void intercept(Invocation inv) {
		System.out.println("我执行了拦截方法");
		
	}

}
