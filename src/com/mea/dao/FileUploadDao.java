package com.mea.dao;

import java.util.List;
import java.util.Map;

import com.mea.model.FileModel;

public interface FileUploadDao {

	boolean uploadFileDao(Map<String, String> formDataMap);//this type of method is called abstract method

	List<FileModel> showFileDetailDao();


}
