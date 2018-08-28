package com.multipart.controller.test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("jsp")
public class UploadController {
	@RequestMapping("/upload")
	// @ResponseBody
	public String toupload() {
		return "upload";
	}

	@RequestMapping(value = "/toupload", method = RequestMethod.POST)
	public @ResponseBody
	String uploads(MultipartFile file) {
		try {
			FileUtils.writeByteArrayToFile(
					new File("F:\\aaa" + file.getOriginalFilename()),
					file.getBytes());
			return "ok";
		} catch (Exception e) {
			e.printStackTrace();
			return "wrong";
		}
	}
}
