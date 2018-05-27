package priv.cjb.demo.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class DemoFilter extends ZuulFilter {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoFilter.class);

	@Override
	public Object run() {
		//RequestContext ctx = RequestContext.getCurrentContext();
		//HttpServletRequest request = ctx.getRequest();

		LOGGER.info("------------------demo filter running-------------------");
		return null;
	}

	/**
	 * 是否执行此过滤器
	 */
	@Override
	public boolean shouldFilter() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		String url = request.getRequestURL().toString();
		if (url.contains("/api-boot/")) {
			return true;
		}
		return false;
	}

	/**
	 * 过滤器优先级
	 */
	@Override
	public int filterOrder() {
		return 0;
	}

	/**
	 * pre：可以在请求被路由之前调用 
	 * route：在路由请求时候被调用 
	 * post：在route和error过滤器之后被调用
	 * error：处理请求时发生错误时被调
	 */
	@Override
	public String filterType() {
		return "pre";
	}

}
