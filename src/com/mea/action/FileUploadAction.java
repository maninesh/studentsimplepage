package com.mea.action;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.mea.dao.FileUploadDao;
import com.mea.daoimpl.FileUploadDaoimpl;
import com.mea.model.FileModel;

public class FileUploadAction {

	public void fileUpload(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
			String UPLOAD_DIRECTORY="D:/PROJECT/Day_4_MultipileRequest_SingleController/WebContent/images";
			Map<String, String> formDataMap=new HashMap<String, String>();			
			if(ServletFileUpload.isMultipartContent(request)){
			DiskFileItemFactory diskFileItemFactory=new DiskFileItemFactory();
			ServletFileUpload servletFileUpload=new ServletFileUpload(diskFileItemFactory);
			try {
				List<FileItem> multipartList=servletFileUpload.parseRequest(request);
				//jati ota input field cha teti choti loop chalcha
				for(FileItem fileItem:multipartList){
					if(!fileItem.isFormField()){
						String fileName=fileItem.getName();
						System.out.println(fileName); //File ko name aaucha or directory pani aaucha
						//file ma convert garne
						String fileNameToUpload=new File(fileName).getName();
						formDataMap.put(fileItem.getFieldName(),fileNameToUpload );
						System.out.println(fileNameToUpload);
						//now write/save the file to the specified directory
						fileItem.write(new File(UPLOAD_DIRECTORY+File.separator+fileNameToUpload));
						
					}
					else{
//						String name=request.getParameter("name");  ---------estari multipart ma garna mildaina ra kaamg pani gardaina
//						String name = fileItem.getString();
						//key ma name ko kura aauchha ra value ma hamile type gareko data aaucha 
						formDataMap.put(fileItem.getFieldName(),fileItem.getString());
//						System.out.println(name);
					}
				}//end of for loop
				//now we have to call dao/daoimpl and pass map to save form data
				FileUploadDao fileUploadDao=new FileUploadDaoimpl();
				boolean status=fileUploadDao.uploadFileDao(formDataMap);
				if(status){
					request.setAttribute("msg","File Uploaded Successfully");
					RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
					rd.forward(request, response);
				}else{
					request.setAttribute("msg","File not Uploaded");
					RequestDispatcher rd=request.getRequestDispatcher("file_upload_example.jsp");
					rd.forward(request, response);
				}
				
				
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void showFileDetailAction(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		FileUploadDao fileUploadDao=new FileUploadDaoimpl();
		List<FileModel> fList=fileUploadDao.showFileDetailDao();
		if(fList.size()>0){
			request.setAttribute("File_Detail",fList);
			RequestDispatcher rd=request.getRequestDispatcher("fileDetail.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
