package cn.zhiu.base.api.user.bean.userlog;

import cn.zhiu.framework.base.api.core.annotation.request.RequestApiBean;
import cn.zhiu.framework.base.api.core.bean.AbstractBaseApiBean;

import java.util.Date;


@RequestApiBean
public class UserLog extends AbstractBaseApiBean {

	/**
	 * 记录id
	 */
	private String logId;

	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * 登录IP
	 */
	private String loginIp;

	/**
	 * 登录地址
	 */
	private String loginAddress;

	/**
	 * 登陆时间
	 */
	private Date loginTime;


	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public String getLoginAddress() {
		return loginAddress;
	}
	public void setLoginAddress(String loginAddress) {
		this.loginAddress = loginAddress;
	}

	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}


}
