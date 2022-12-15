package com.dw.member.config;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;

//Interceptor란? 모든 URL 요청시, 실행하는 전역 기능!
public class interceptor implements HandlerInterceptor{

    private final Logger logger =  {

        private final Logger logger = LoggerFactory.getLogger(clazz: Interceptor.class);
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

                String requestUrl = request.getRequestURI(); // 사용자 접속  url 요청
                String httpMethod = request.getMethod(); // 사용자 접속 HTTP Method (Get, Post, Delete, Patch ...)
                String userIP = request.getRemoteAddr(); // 사용자 접속 IP

                logger.info("요청 URL ====> "+ requestUrl);
                logger.info("요청 HTTP ====> "+ httpMethod);
                logger.info("사용자 접속 IP ====> "+ userIP);

                HttpSession session = request.getSession(); //세션호출
                String userId = (String) session.getAttribute( "userId"); // 세션에 저장된 값 불러오기

                if (userId == null) {//세션에 저장된 값이 없어서 null이라면?
                    //Redirect : URL 재요청
                    response.sendRedirect( "/login"); // 세션에 값이 없거나 세션 만료시, /login 경로로 강제 이동!
                    return false;
                }
                
                return true;
            }
    }
    
}
