package com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RefreshingAppController {
				
	@RequestMapping({
		"/MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb/",
		"/MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb/addcust",
		"/MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb/getcust",
		"/MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb/updatecust"
	})
	public String showHomePageAfterRefreshingAppThroughBrowser() {
		return "forward:/index.html";
	}
}
