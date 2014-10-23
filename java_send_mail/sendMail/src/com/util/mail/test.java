package com.util.mail;

public class test {

	public static void main(String[] args) {
		// 这个类主要是设置邮件
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.163.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setUserName("zhpenglv@163.com");
		mailInfo.setPassword("03167698262131!");// 您的邮箱密码
		mailInfo.setFromAddress("zhpenglv@163.com");
		mailInfo.setToAddress("zhpebox@163.com");
		mailInfo.setSubject("是我aaa？");
		mailInfo.setContent("hello 你收到了吗？");
		// 这个类主要来发送邮件
		SimpleMailSender sms = new SimpleMailSender();

		//采用两种发送格式
		sms.sendTextMail(mailInfo);// 发送文体格式

		sms.sendHtmlMail(mailInfo);// 发送html格式
		System.out.println("OK!");
	}

}
