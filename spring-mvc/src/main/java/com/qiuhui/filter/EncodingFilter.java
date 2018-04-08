package com.qiuhui.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter extends AbstractFilter{

	private String encoding = "UTF-8";
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String encoding = filterConfig.getInitParameter("encoding");
		this.encoding = encoding;
	}
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(encoding);
		response.setCharacterEncoding(encoding);
		chain.doFilter(request, response);
		
	}

}
