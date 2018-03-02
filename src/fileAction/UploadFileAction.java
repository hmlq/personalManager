package fileAction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadFileAction extends ActionSupport {
	private File upload;
	private String uploadFilename;
	private String uploadContentType;
	
	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFilename() {
		return uploadFilename;
	}

	public void setUploadFilename(String uploadFilename) {
		this.uploadFilename = uploadFilename;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(upload!=null){
			String savePath = ServletActionContext.getServletContext().getRealPath("/upload/"+this.uploadFilename);
//			File targetFile = new File(serverRealPath,getFilename());
//			FileUtils.copyFile(upload, targetFile); 
//			System.out.println(serverRealPath);
			try{
				FileInputStream fis = new FileInputStream(upload);
				FileOutputStream fos = new FileOutputStream(savePath);
				IOUtils.copy(fis, fos);
				fos.flush();
				fos.close();
				fis.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return SUCCESS;
		}
		else{
		//	addActionMessage("ÇëÑ¡ÔñÎÄ¼þ!");
			return INPUT;
		}
	}
}
