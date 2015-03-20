package tn.freelance.ecommerce.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.validation.Valid;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import tn.freelance.ecommerce.entity.Category;
import tn.freelance.ecommerce.service.IAdminCategoryService;

@Controller
@RequestMapping("/adminCat")
@SessionAttributes("editedCat")
public class AdminCategoryController {

	@Autowired
	private IAdminCategoryService service;

	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("category", new Category());
		model.addAttribute("categories", service.listCategory());
		return "categories";

	}

	@RequestMapping("/saveCat")
	public String saveCat(@Valid Category c, BindingResult bindingResult,
			Model model, MultipartFile file) throws Exception {
		if (bindingResult.hasErrors()) {
			model.addAttribute("categories", service.listCategory());
			return "categories";
		}
		if (!file.isEmpty()) {
			c.setPicture(file.getBytes());
		} else {
			if (c.getIdCategory() != null) {
				Category cat = (Category) model.asMap().get("editedCat");
				c.setPicture(cat.getPicture());
			}
		}
		if (c.getIdCategory() == null)
			service.addCategory(c);
		else
			service.updateCategory(c);
		;
		model.addAttribute("categorie", new Category());
		model.addAttribute("categories", service.listCategory());
		return "categories";
	}

	@RequestMapping(value = "/pictureCat", produces = MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public byte[] getPhoto(Long idCat) throws IOException {
		Category c = service.getCategory(idCat);
		if (c.getPicture() == null)
			return new byte[0];
		else
			return IOUtils
					.toByteArray(new ByteArrayInputStream(c.getPicture()));
	}

	@RequestMapping(value = "/deleteCat")
	public String suppCat(Long idCat, Model model) {
		service.deleteCategory(idCat);
		model.addAttribute("category", new Category());
		model.addAttribute("categories", service.listCategory());
		return "categories";
	}

	@RequestMapping(value = "/editCat")
	public String editCat(Long idCat, Model model) {
		Category c = service.getCategory(idCat);
		model.addAttribute("editedCat", c);
		model.addAttribute("category", c);
		model.addAttribute("categories", service.listCategory());
		return "categories";
	}
}
