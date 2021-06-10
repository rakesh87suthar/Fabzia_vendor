package com.rakesh.firstweb.login;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.rakesh.bean.UserBean;
import com.rakesh.dao.UserDao;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LoginForm loginForm = (LoginForm) form;
		String username = loginForm.getUserName();
		String password = loginForm.getPassword();
		System.out.println("USerName ::" + username + " Password::" + password);

		/*List<UserBean> beans = UserDao.getUserBean(username, password);
		if (null == beans) {
			// create new user
			UserBean bean = new UserBean(username, password);
			int count = UserDao.addUserBean(bean);
			if (count < 1) {
				return mapping.findForward("error");
			}
		}
		return mapping.findForward("success");*/
		
		if(username == "rakesh@gmail.com" && password == "u")
			{	
				return mapping.findForward("error");
			}
		else
			{
				return mapping.findForward("success");
			}
	}

}
