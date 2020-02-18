package com.taoyuanmin.asysc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taoyuanmin.asysc.mail.MailService;
import com.taoyuanmin.asysc.msg.MsgService;
import com.taoyuanmin.asysc.util.ResultUtil;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/asysc")
@Slf4j
public class AsyscController {

	@Autowired
	private MsgService msgService;
	@Autowired
	private MailService mailService;

	@GetMapping("/sendMsgAndMail")
	public Object sendMsgAndMail() throws InterruptedException {
		log.info("【开始】模拟发送信息和邮件");
		msgService.sendMsg("此处信息正文。。。");
		mailService.sendMail("此处邮件正文。。。");
		log.info("【结束】模拟发送信息和邮件");
		return ResultUtil.success("模拟发送信息和邮件 成功！");
	}

}
