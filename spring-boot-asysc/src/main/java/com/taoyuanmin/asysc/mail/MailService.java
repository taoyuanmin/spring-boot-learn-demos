package com.taoyuanmin.asysc.mail;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MailService {

	@Async
	public void sendMail(String content) throws InterruptedException {
		Thread.sleep(2000);
		log.info("发邮件成功：{}", content);
	}

}
