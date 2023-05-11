package com.murilo.helpdesk.domain;

import java.time.LocalDate;

import com.murilo.helpdesk.domain.enums.Priority;
import com.murilo.helpdesk.domain.enums.Status;



public class Order  {
	private Integer id;
	private LocalDate openDate = LocalDate.now();
	private LocalDate closedDate ;
	private Priority priority;
	private Status status;
	private String title;
	private String comments;

}
