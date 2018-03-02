package addressListService;

import java.util.List;

import pojo.Addresslist;

public interface GetAllMessage {
	List<Addresslist> allMessage(int userId);
}
