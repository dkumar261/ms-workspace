/**
 * 
 */
package com.practice.ms.webservice.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Dinesh Kumar
 *
 */

@Getter
@Setter
public class GreetingModel {

	private Integer id;
	private String message;
	private String brand;
	private Date createDate;
	private String type;

}