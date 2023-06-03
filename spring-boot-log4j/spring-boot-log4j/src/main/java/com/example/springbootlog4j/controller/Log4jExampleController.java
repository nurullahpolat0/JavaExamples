package com.example.springbootlog4j.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;

@Controller
public class Log4jExampleController {

	private static final Logger logger = LogManager.getLogger(Log4jExampleController.class);
}
