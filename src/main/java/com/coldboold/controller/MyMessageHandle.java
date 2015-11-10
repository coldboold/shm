package com.coldboold.controller;

import com.github.sd4324530.fastweixin.handle.MessageHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.req.BaseReqMsg;
import com.github.sd4324530.fastweixin.message.req.ReqType;

public class MyMessageHandle implements MessageHandle {

	public BaseMsg handle(BaseReqMsg message) {
		System.out.println("====="+message.getFromUserName());
		BaseMsg msg=new BaseMsg();
		msg.setCreateTime(System.currentTimeMillis());
		msg.setFromUserName("coldboold");
		msg.setMsgType(ReqType.TEXT);
		msg.setToUserName("xx");
		return msg;
	}

	public boolean beforeHandle(BaseReqMsg message) {
		System.out.println("---"+message.getFromUserName());
		return false;
	}

}
