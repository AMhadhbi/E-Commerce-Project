package tn.freelance.ecommerce.controller;

import java.io.File;
import java.io.FileInputStream;
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

import tn.freelance.ecommerce.entity.Product;
import tn.freelance.ecommerce.service.IAdminCategoryService;

@Controller
@RequestMapping("/adminPro")
@SessionAttributes("editedPro")
public class AdminProductController {

	@Autowired
	private IAdminCategoryService service;

	@RequestMapping(value = "/index")
	public String index(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("products", service.listproduct());
		model.addAttribute("categories", service.listCategory());
		return "products";
	}

	@RequestMapping(value = "/saveProd")
	public String saveProd(@Valid Product p, BindingResult bindingResult,
			Model model, MultipartFile file) throws IOException {
		if (bindingResult.hasErrors()) {
			model.addAttribute("categories", service.listCategory());
			model.addAttribute("produits", service.listproduct());
			return ("products");
		}
		if (!file.isEmpty()) {
			String path = System.getProperty("java.io.tmpdir");
			p.setPicture(file.getOriginalFilename());
			Long idP = null;
			if (p.getIdProduct() == null) {
				idP = service.addProduct(p, p.getCategory().getIdCategory());
			} else {
				service.updateProduct(p);
				idP = p.getIdProduct();
			}
			file.transferTo(new File(path + "/" + "PROD_" + idP + "_"
					+ file.getOriginalFilename()));
		} else {
			if (p.getIdProduct() == null)
				service.addProduct(p, p.getCategory().getIdCategory());
			else
				service.updateProduct(p);
		}
		model.addAttribute("product", new Product());
		model.addAttribute("products", service.listproduct());
		model.addAttribute("categories", service.listCategory());
		return "products";
	}

	@RequestMapping(value = "pictureProd", produces = MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public byte[] photCat(Long idProd) throws IOException {
		Product p = service.getProduc(idProd);
		File f = new File(System.getProperty("java.io.tmpdir") + "/PROD_"
				+ idProd + "_" + p.getPicture());
		return IOUtils.toByteArray(new FileInputStream(f));
	}

	@RequestMapping(value = "/deleteProd")
	public String supp(Long idProd, Model model) {
		service.deleteProduct(idProd);
		model.addAttribute("product", new Product());
		model.addAttribute("products", service.listproduct());
		model.addAttribute("categories", service.listCategory());
		return "products";
	}

	@RequestMapping(value = "/editProd")
	public String edit(Long idProd, Model model) {
		Product p = service.getProduc(idProd);
		model.addAttribute("product", p);
		model.addAttribute("products", service.listproduct());
		model.addAttribute("categories", service.listCategory());
		return "products";
	}

}
