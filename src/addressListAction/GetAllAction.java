package addressListAction;

import java.util.List;

import pojo.Addresslist;

import addressListService.GetAllMessage;

import com.opensymphony.xwork2.ActionSupport;

public class GetAllAction extends ActionSupport {
	private GetAllMessage getAllMessage;
	private List<Addresslist> list;
	private int userId;
	
	public List<Addresslist> getList() {
		return list;
	}
	public void setList(List<Addresslist> list) {
		this.list = list;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public GetAllMessage getGetAllMessage() {
		return getAllMessage;
	}
	public void setGetAllMessage(GetAllMessage getAllMessage) {
		this.getAllMessage = getAllMessage;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		list = getAllMessage.allMessage(userId);
		return SUCCESS;
	}
}
