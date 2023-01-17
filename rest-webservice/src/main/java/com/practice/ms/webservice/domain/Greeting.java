/**
 * 
 */
package com.practice.ms.webservice.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Dinesh Kumar
 *
 */

@Getter
@Setter
@AllArgsConstructor
public class Greeting {

	private String message;
	private Date createDate;
	private String cardId;

}