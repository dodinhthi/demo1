package estore.filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
/**
 * Filter này giúp giải quyết xử lý unicode trong lập trình web
 * 
 * @version 1.1
 * @author Nguyễn Nghiệm, nghiemn@fpt.edu.vn
 */
@WebFilter(
	urlPatterns = {"/*"}, 
	dispatcherTypes = {DispatcherType.REQUEST}
)
public class UTF8Filter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {}
	@Override
	public void destroy() {}
}
