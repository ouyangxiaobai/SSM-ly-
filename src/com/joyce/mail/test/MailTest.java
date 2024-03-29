/**
 * @Description: 
 *
 * @Title: MailTest.java
 * @Package com.joyce.test
 * @Copyright: Copyright (c) 2014
 *
 * @author Comsys-LZP
 * @date 2014-5-28 上午09:07:52
 * @version V2.0
 */
package com.joyce.mail.test;

import java.util.ArrayList;
import java.util.HashMap;

import com.joyce.mail.bean.Mail;
import com.joyce.mail.bean.MailConstant;
import com.joyce.mail.main.MailSender;



/**
 * @Description: 发送邮件测试类
 *
 * @ClassName: MailTest
 * @Copyright: Copyright (c) 2014
 *
 * @author Comsys-LZP
 * @date 2014-5-28 上午09:07:52
 * @version V2.0
 */
public class MailTest {
	
	public static void  sendmial(String str,String email){
		try {
			MailSender mail = new MailSender(MailConstant.MAIL_USER, MailConstant.MAIL_PWD);
			Mail content = new Mail();
			content.setSubject(MailConstant.MAIL_TITLE);
			content.setContent(MailConstant.getMailContent(str));
				mail.send(email, content);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			MailSender mail = new MailSender(MailConstant.MAIL_USER, MailConstant.MAIL_PWD);
			Mail content = new Mail();
			content.setSubject(MailConstant.MAIL_TITLE);
			content.setContent(MailConstant.getMailContent("hello"));
			mail.send("86266000@qq.com", content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
