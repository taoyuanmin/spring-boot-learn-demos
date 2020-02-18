package com.taoyuanmin.asysc.msg;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MsgService {

	@Async
	public void sendMsg(String content) throws InterruptedException {
		Thread.sleep(2000);
		log.info("发送消息成功：{}", content);
	}

}
