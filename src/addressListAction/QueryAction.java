package addressListAction;

import java.util.List;

import pojo.Addresslist;

import addressListService.QueryService;

import com.opensymphony.xwork2.ActionSupport;

public class QueryAction extends ActionSupport {
	private String name;
	private List<Addresslist> list;
	private QueryService queryService;
	private int userId;

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Addresslist> getList() {
		return list;
	}
	public void setList(List<Addresslist> list) {
		this.list = list;
	}
	public QueryService getQueryService() {
		return queryService;
	}
	public void setQueryService(QueryService queryService) {
		this.queryService = queryService;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		list = queryService.query(name,userId);
		return SUCCESS;
	}
}
