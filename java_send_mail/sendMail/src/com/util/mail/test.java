package com.util.mail;

public class test {

	public static void main(String[] args) {
		// �������Ҫ�������ʼ�
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.163.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setUserName("zhpenglv@163.com");
		mailInfo.setPassword("03167698262131!");// ������������
		mailInfo.setFromAddress("zhpenglv@163.com");
		mailInfo.setToAddress("zhpebox@163.com");
		mailInfo.setSubject("����aaa��");
		mailInfo.setContent("hello ���յ�����");
		// �������Ҫ�������ʼ�
		SimpleMailSender sms = new SimpleMailSender();

		//�������ַ��͸�ʽ
		sms.sendTextMail(mailInfo);// ���������ʽ

		sms.sendHtmlMail(mailInfo);// ����html��ʽ
		System.out.println("OK!");
	}

}
