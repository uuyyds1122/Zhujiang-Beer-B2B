package com.beer.sell.common.session;

import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

/**
 * 移动端
 * ->> jSessionId
 *
 * @author zhangwei
 */
public class CustomDefaultWebSessionManager extends DefaultWebSessionManager {
    public static final String HEAD_AUTHORIZATION_KEY = "Authorization";

    @Override
    protected Serializable getSessionId(ServletRequest request, ServletResponse response) {
        HttpServletRequest httpServletRequest = WebUtils.toHttp(request);
        String sessionId = httpServletRequest.getHeader(HEAD_AUTHORIZATION_KEY);
        if (sessionId != null && !sessionId.isEmpty()) {
            return sessionId;
        }
        return super.getSessionId(request, response);
    }
}
