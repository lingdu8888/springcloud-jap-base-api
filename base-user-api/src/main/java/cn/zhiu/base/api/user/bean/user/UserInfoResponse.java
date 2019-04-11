package cn.zhiu.base.api.user.bean.user;

import cn.zhiu.bean.user.entity.enums.user.SexType;
import cn.zhiu.bean.user.entity.enums.user.UserStatus;
import cn.zhiu.framework.base.api.core.annotation.request.RequestApiBean;
import cn.zhiu.framework.base.api.core.bean.AbstractBaseApiBean;

import java.util.Date;


@RequestApiBean
public class UserInfoResponse extends AbstractBaseApiBean {

	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * 账号
	 */
	private String account;

	/**
	 * 昵称
	 */
	private String nickName;



	/**
	 * 真实姓名
	 */
	private String realName;

	/**
	 * 电话
	 */
	private String phone;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 性别(0:男,1:女,2:通用)
	 */
	private SexType sex;

	/**
	 * 注册来源
	 */
	private String source;

	/**
	 * 状态(0:正常,1:锁定)
	 */
	private UserStatus status;

	/**
	 * 最后登录时间
	 */
	private Date addTime;

	/**
	 * 最后登陆地址
	 */
	private Date updateTime;


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public SexType getSex() {
		return sex;
	}
	public void setSex(SexType sex) {
		this.sex = sex;
	}

	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public UserStatus getStatus() {
		return status;
	}
	public void setStatus(UserStatus status) {
		this.status = status;
	}

	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


}
