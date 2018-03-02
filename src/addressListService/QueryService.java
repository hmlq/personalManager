package addressListService;

import java.util.List;

import pojo.Addresslist;

public interface QueryService {
	List<Addresslist> query(String name,int userId);
}
